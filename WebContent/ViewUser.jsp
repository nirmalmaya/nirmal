<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<%@ page import="com.servletcrud.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View User</title>
</head>
<body>
<h1 style="color:blue; ">User List</h1>
<% 
Connection con=DBConnection.getConnection(); 

            Statement statement = con.createStatement() ;
            ResultSet resultset = 
                statement.executeQuery("select * from userdetails") ; 
        %>
         <TABLE BORDER="1">
            <TR>
                <TH>id</TH>
                <TH>uname</TH>
                <TH>uemail</TH>
                <TH>upassword</TH>
                <TH>ucpassword</TH>
                <TH>umobileno</TH>
                 <TH>uage</TH>
                  <TH>ugendr</TH>
                  <TH>edit</TH>
                  <TH>delete</TH>
                  
            </TR>
            <% while(resultset.next()){ %>
            <TR>
            <TD> <%= resultset.getString(1) %></td>
                <TD> <%= resultset.getString(2) %></td>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
                <TD> <%= resultset.getString(5) %></TD>
                <TD> <%= resultset.getString(6) %></TD>
                 <TD> <%= resultset.getString(7) %></TD>
                  <TD> <%= resultset.getString(8) %></TD>
                  <td><a href='EditServlet?id="+u.getId()+"'>edit</a></td> 
                   <td><a href='DeleteServlet?id="+u.getId()+"'>delete</a></td></tr>   
            </TR>
            <% } %>
        </TABLE>
</body>
</html>