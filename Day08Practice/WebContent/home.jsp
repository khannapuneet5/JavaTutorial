<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<h1 style="text-decoration: underline;text-align: center">Hello <%= request.getAttribute("username") %></h1>
	<h2><a href="index.jsp">Logout</a></h2>
</body>
</html>