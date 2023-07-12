package com.org.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.UserDao;
import com.org.dto.User;
@WebServlet("/login")
public class LoginValidation extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("Email"));
		System.out.println(req.getParameter("Password"));
		User user = new User();
		user.setEmail(req.getParameter("Email"));
		user.setPass(req.getParameter("Password"));
		
		if(UserDao.loginValidation(user)) {
			HttpSession hs = req.getSession();
			hs.setAttribute("email", user.getEmail());
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
	}
}
