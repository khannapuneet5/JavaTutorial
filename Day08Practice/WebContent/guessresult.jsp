<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<h1>Welcome to guessig game. Enter a number between 1 and 100</h1>
	<form action="guessgame" method="post">
		Guess<input type="text" name="guess"><br/>
		<input type="submit" value="Play">
		<input type='hidden' name='gameInProgress' value='yes'>
		<input type='hidden' name='target' value='<% request.getAttribute("target"); %>'>
		<input type='hidden' name='attempts' value='<% request.getAttribute("attempts"); %>'>
	</form>
	<h2><%= request.getAttribute("message") %><br/>Attempts : <% request.getAttribute("attempts");%></h2>
	
</body>
</html>