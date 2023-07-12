package com.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.org.dto.User;

public class UserDao {
	static String url = "jdbc:mysql://localhost:3306/laundry_system";
	static String username = "root";
	static String password = "root";

	public static int saveUser(User user) {
		String query = "insert into user (name,email,phone,pass) values (?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setLong(3, user.getPhone());
			ps.setString(4, user.getPass());
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

	public static boolean loginValidation(User user) {
		String query = "SELECT * FROM user WHERE email = ? AND pass =?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getPass());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("success");
				con.close();
				return true;
			}
			con.close();
		} catch (SQLException | ClassNotFoundException e) {

		}
		return false;
	}
}
