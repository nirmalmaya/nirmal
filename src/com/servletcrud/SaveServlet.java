package com.servletcrud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String uname=request.getParameter("username");
	        System.out.println(uname);
	        String uemail=request.getParameter("useremail");  
	        String upassword=request.getParameter("userpassword");  
	        String ucpassword=request.getParameter("usercpassword"); 
	        String umobileno =request.getParameter("usermobileno");
	        System.out.println(umobileno);
	        String uage=request.getParameter("userage");
	        String ugender=request.getParameter("usergender");
	          
	        User u=new User();  
	        u.setUname(uname);  
	        u.setUemail(uemail);  
	        u.setUpassword(upassword);  
	        u.setUcpassword(ucpassword);
	        u.setUmobileno(umobileno);
	        u.setUage(uage);
	        u.setUgender(ugender);
	          
	        int status=RegisterDao.save(u);  
	        if(status>0){  
	            out.print("<p> You Are Signup Successfully!Login Here..</p>");  
	            request.getRequestDispatcher("Login.jsp").include(request, response);
	            
	           // response.sendRedirect("Login.jsp");
	        }else{  
	            out.println("Sorry! unable to save record"); 
	            request.getRequestDispatcher("Signup.html").include(request, response);
	        }  
	          
	        out.close();  

	}

}
