package com.org.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.dao.OrderRequestDao;
import com.org.dto.OrderRequest;

@WebServlet("/updateorderequest")
public class UpdateOrderRequest extends HttpServlet {
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OrderRequest or = new OrderRequest();
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		or.setPick_date(req.getParameter("date"));
		or.setTopware(req.getParameter("top_wear"));
		or.setBottomware(req.getParameter("bottom_wear"));
		or.setWoolencloth(req.getParameter("woolen_cloth"));
		or.setOthers(req.getParameter("other_box"));
		or.setSelectServise(req.getParameter("service_type"));
		or.setContact(req.getParameter("contact"));
		or.setDescription(req.getParameter("description"));
		or.setId(Integer.parseInt(req.getParameter("id")));

		OrderRequestDao.updateOrderRequest(or);
		RequestDispatcher rd = req.getRequestDispatcher("vieworderequest.jsp");
		 rd.forward(req, resp);
	}

}
