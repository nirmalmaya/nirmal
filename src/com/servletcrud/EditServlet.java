package com.servletcrud;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditServlet")  
public class EditServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Employee</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        User u=new User();
          
        out.print("<form action='EditServlet2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+u.getId()+"'/></td></tr>");  
       
        out.print("<tr><td>Name:</td><td><input type='text' name='username' value='"+u.getUname()+"'/></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='email' name='useremail' value='"+u.getUemail()+"'/></td></tr>");  

        out.print("<tr><td>Password:</td><td><input type='password' name='userpassword' value='"+u.getUpassword()+"'/></td></tr>");   
        out.print("<tr><td>ConfirmPassword:</td><td><input type='password' name='usercpassword' value='"+u.getUcpassword()+"'/></td></tr>");   
        
        out.print("<tr><td>MobileNo:</td><td><input type='text' name='usermobileno' value='"+u.getUmobileno()+"'/></td></tr>");  
        out.print("<tr><td>Age:</td><td><input type='text' name='userage' value='"+u.getUage()+"'/></td></tr>");  
        out.print("<tr><td>Gendr:</td><td><input type='radio' name='usergender' value='"+u.getUgender()+"'/></td></tr>");  

        out.print("</td></tr>");  
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
}  