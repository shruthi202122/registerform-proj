<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div{
		color:red;
	}
</style>

</head>
<body style="background-color:violet;">
<form action="Login" method="post">
	User Name:<br/>
	<input type="text" name="uname"></input><br><br>
	Password:<br/> 
	<input type="password" name="pwd"></input><br><br>
	<input type="submit" value="Login"></input><br/><br>
	new user can register here<a href="register.jsp">Register</a>
</form>

</body>
</html>
