<%@ page import="java.sql.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        /* CSS styles for the table */
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

      <%
      try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry_system","root","root");
			String sql = "SELECT * FROM order_request WHERE email=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,session.getAttribute("email").toString());
			ResultSet rs  = ps.executeQuery();%>
			
			
			<table border=2px solid>
			<tr>
			    <th>EMAIL</th>
			    <th>PICK_DATE</th>
			    <th>TOP_WEAR</th>
			    <th>BOTTOM_WEAR</th>
			    <th>WOOLEN_CLOTH</th>
			    <th>OTHERS</th>
			    <th>SELECT_SERVICE</th>
			    <th>CONTACT_PERSON</th>
			    <th>DESCRIPTION</th>
			    <th>EDIT</th>
			    <th>DELETE</th>
			</tr>
			
			<% 
			    while(rs.next()){ 
			%>
			
			<tr>
			   
			   <td><%= rs.getString(1) %></td>
			   <td><%= rs.getString(2) %></td>
			   <td><%= rs.getString(3) %></td>
			   <td><%= rs.getString(4) %></td>
			   <td><%= rs.getString(5) %></td>
			   <td><%= rs.getString(6) %></td>
			   <td><%= rs.getString(7) %></td>
			   <td><%= rs.getString(8) %></td>
			   <td><%= rs.getString(9) %></td>
			   <td><a href=editorderequest.jsp?id=<%= rs.getString(10)%> >edit</a></td>
			   <td><a href=deleteorderequest?id=<%= rs.getString(10) %> >delete</a></td>
			</tr>
			
			<%
			    }
			%>
			</table>
				
			
			<%con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
      %>

</body>
</html>