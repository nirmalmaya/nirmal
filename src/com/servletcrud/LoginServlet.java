package com.servletcrud;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("username");
		String upass=request.getParameter("userpassword");
		
		if(uname.trim().length()==0)
		{
			response.sendRedirect("Login.jsp?status=UserName cannot be empty");
			return;
		}
		 if(upass.trim().length()==0)
		{
			response.sendRedirect("Login.jsp?status=Password cannot be empty");
			return;
		}
		
			try {
				Connection con=DBConnection.getConnection();  
	 
			PreparedStatement ps = con.prepareStatement("select uname,upassword from userdetails where uname=? and upassword=?");
			ps.setString(1, uname);
			ps.setString(2, upass);
	 
			ResultSet rs = ps.executeQuery();
	 
			while (rs.next()) {
				response.sendRedirect("Success.jsp");
				return;
			}
			response.sendRedirect("Login.jsp?status=Your Username or Password incorrect!");
			return;
			} catch ( SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
	}

	


