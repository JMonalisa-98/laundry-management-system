<%@ page import="java.sql.*" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="dashboard.css">
</head>
<body>
	<%
	String id = request.getParameter("id");

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry_system", "root", "root");
		String sql = "SELECT * FROM order_request where id =" + id;
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
	%>
	<div class="container">
		<h1>Order Request</h1>
		<form action="updateorderequest">
			<input type="number" name="id"
				value="<%=rs.getInt(10)%>" readonly hidden>
			<div class="form_container">
				<div class="form_control">
					<input placeholder="pick up/Drop Date" id="date" name="date"
						type="text" value="<%=rs.getString(2) %>" onfocus="(this.type='date')">
				</div>
				<div class="form_control">
					<input id="top_wear" name="top_wear"
						placeholder="Topwear(Tshirt,Top,Shirt)" value="<%=rs.getString(3)%>">
				</div>
				<div class="form_control">
					<input id="bottom_wear" name="bottom_wear"
						placeholder="Bottomwear(Lower,Jeans,Leggins)" value="<%=rs.getString(4) %>">
				</div>
				<div class="form_control">
					<input id="woolen_cloth" name="woolen_cloth"
						placeholder="Woolen Cloth" value="<%=rs.getString(5) %>">
				</div>
				<div class="form_control">
					<input id="other_box" name="other_box" placeholder="Others" value="<%=rs.getString(6) %>">
				</div>
				<% if(rs.getString(7).equals("Selective Service type")){%>
				<select id="service_type" name="service_type">
					<option value="" selected>Selective Service type</option>
					<option value="fast_service">Fast Service</option>
					<option value="reular_service">Regular Service</option>

				</select>
				<%}else if(rs.getString(7).equals("Fast Service")){ %>
				<select id="service_type" name="service_type">
					<option value="">Selective Service type</option>
					<option value="fast_service" selected>Fast Service</option>
					<option value="reular_service">Regular Service</option>
				</select>
				<%}else{ %>
				<select id="service_type" name="service_type">
					<option value="">Selective Service type</option>
					<option value="fast_service">Fast Service</option>
					<option value="reular_service" selected>Regular Service</option>

				</select>
				<%} %>
				<div class="form_control">
					<input id="contact_person" name="contact"
						placeholder="Contact Person" value="<%=rs.getString(8) %>">
				</div>
				<div class="text_control">
					<textarea id="descrip_tion" name="description" value="<%=rs.getString(9) %>" rows="4" cols="30"
						placeholder="Description(if any)" ></textarea>
					<!-- <input id="descrip_tion" name="descrip_tion" placeholder="Description(if any)"> -->
				</div>
			</div>
	</div>
	<div class="button_container">
		<button type="submit">Update</button>
	</div>
	</form>
	</div>

	<%
	con.close();
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	%>
</body>
</html>