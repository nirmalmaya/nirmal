package com.servletcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;

public class DBConnection
{
	  public static Connection getConnection(){  
	        Connection con=null;
	       
	        try {
				 Class.forName("com.mysql.jdbc.Driver");  
				              con = DriverManager.
				                 getConnection("jdbc:mysql://localhost:3306/servletcrud","root","root1");
				             // Statement stmt = con.createStatement();
				             System.out.println("Created DB Connection....");
				         } catch (ClassNotFoundException e) {
				             // TODO Auto-generated catch block
				             e.printStackTrace();
				         } catch (SQLException e) {
				             // TODO Auto-generated catch block
				             e.printStackTrace();
				         }
	        return con;
				     }
}
