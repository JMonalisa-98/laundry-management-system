package com.org.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.dao.OrderRequestDao;
import com.org.dto.OrderRequest;

@WebServlet("/saveorderequest")
public class SaveOrderRequest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OrderRequest or = new OrderRequest();
		
		or.setEmail(req.getParameter("email"));
		or.setPick_date(req.getParameter("date"));
		or.setTopware(req.getParameter("top_wear"));
		or.setBottomware(req.getParameter("bottom_wear"));
		or.setWoolencloth(req.getParameter("woolen_cloth"));
		or.setOthers(req.getParameter("other_box"));
		or.setSelectServise(req.getParameter("service_type"));
		or.setContact(req.getParameter("contact_person"));
		or.setDescription(req.getParameter("descrip_tion"));
		
		OrderRequestDao.SaveOrderRequest(or);
		RequestDispatcher rd = req.getRequestDispatcher("vieworderequest.jsp");
		rd.forward(req, resp);
	}

}
