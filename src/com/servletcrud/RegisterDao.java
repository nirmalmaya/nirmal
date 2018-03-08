package com.servletcrud;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDao 
{
	public static int save(User u)
	{
		 int status=0; 
		 try{  
	            Connection con=DBConnection.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into userdetails(uname,uemail,upassword,ucpassword,umobileno,uage,ugender) values (?,?,?,?,?,?,?)");  
	            ps.setString(1,u.getUname());
	            ps.setString(2,u.getUemail());  
	            ps.setString(3,u.getUpassword());  
	            ps.setString(4,u.getUcpassword());  
	            ps.setString(5,u.getUmobileno()); 
	            ps.setString(6,u.getUage()); 
	            ps.setString(7,u.getUgender());
	            
	             
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
}
