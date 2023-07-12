package com.org.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.dao.UserDao;
import com.org.dto.User;

@WebServlet("/signup")
public class Signup extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("hahahahahah");
		User user = new User();
		user.setName(req.getParameter("Fullname"));
		user.setEmail(req.getParameter("Email"));
		user.setPhone(Long.parseLong(req.getParameter("Mobilenumber")));
		user.setPass(req.getParameter("Password"));
		
//		System.out.println("Password : "+req.getParameter("Password"));
//		
//		System.out.println("start");
//		System.out.println(user);
//		System.out.println("start");
		UserDao.saveUser(user);
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.forward(req, resp);
	}
}
