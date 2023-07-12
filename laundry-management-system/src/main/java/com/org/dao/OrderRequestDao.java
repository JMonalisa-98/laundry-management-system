package com.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

import com.org.dto.OrderRequest;

public class OrderRequestDao {
	static String url = "jdbc:mysql://localhost:3306/laundry_system";
	static String username = "root";
	static String password = "root";

	public static int SaveOrderRequest(OrderRequest or) {
		String query = "insert into order_request (pick_date,topwear,bottomwear,woolencloth,others,select_service,contact_person,description) values (?,?,?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, or.getPick_date());
			ps.setString(2, or.getTopware());
			ps.setString(3, or.getBottomware());
			ps.setString(4, or.getWoolencloth());
			ps.setString(5, or.getOthers());
			ps.setString(6, or.getSelectServise());
			ps.setString(7, or.getContact());
			ps.setString(8, or.getDescription());
			int res = ps.executeUpdate();
			if (res == 1) {
				System.out.println("success");
				con.close();
				return 1;
			} else {
				System.out.println("fail");
				con.close();
				return -1;
			}
		} catch (SQLException | ClassNotFoundException e) {

		}
		return 0;

	}

	public static int deleteOrderRequest(String id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry_system", "root", "root");
			String sql = "DELETE FROM order_request WHERE id="+id;
			Statement st = con.createStatement();
			int res = st.executeUpdate(sql);
			if (res == 1) {
				con.close();
				return 1;
			}
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static int updateOrderRequest(OrderRequest or) {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry_system","root","root");
				String sql = "UPDATE order_request SET pick_date = ? , topwear = ? , bottomwear = ? , woolencloth = ? , others = ? , select_service = ? , contact_person = ? , description = ?  WHERE id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setString(1,or.getPick_date());
				ps.setString(2,or.getTopware());
				ps.setString(3,or.getBottomware());
				ps.setString(4,or.getWoolencloth());
				ps.setString(5,or.getOthers());
				ps.setString(6,or.getSelectServise());
				ps.setString(7,or.getContact());
				ps.setString(8,or.getDescription());
				ps.setInt(9,or.getId());
				ps.execute();
				con.close();
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return 0;
	}
}
