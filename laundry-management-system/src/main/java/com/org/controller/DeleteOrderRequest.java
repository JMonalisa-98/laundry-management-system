package com.org.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.dao.OrderRequestDao;

@WebServlet("/deleteorderequest")
public class DeleteOrderRequest extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		System.out.println(id);
		OrderRequestDao.deleteOrderRequest(id);
		RequestDispatcher rd = req.getRequestDispatcher("vieworderequest.jsp");
		rd.forward(req, resp);
	}
}
