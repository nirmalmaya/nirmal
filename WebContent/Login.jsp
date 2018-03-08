<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LogIn Page</title>
</head>
<body>
	<%
		String msg = request.getParameter("status");
		if (msg == null) {
			msg = "";
		}
	%>

<p style="color: red;">
		<%=msg%>
	</p>
	
	<form action="LoginServlet" method="post">
		 <h3>new user <a class="linkfont" href="http://localhost:8080/ServletCURD/Signup.html">Signup</a> here</h3>
	
		UserName<br/>
		<input type="text" name="username"><br> 
		Password<br/>
		<input type="password" name="userpassword"><br></br> 
		<input type="submit" value="Login">
		 <input type="reset" value="Cancel"><br/>
    <span class="psw" align="center"><a href="#">ForgotPassword?</a></span>
	</form>
</body>
</html>