<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<body style="background-color:violet">
<%@ include file="header.html"%>
<form action="Register" method="post">
	FullName:<br/>
	<input type="text" name="uname"></input><br/><br/>
	Age:<br/>
	<input type="text" name="age"></input><br/><br/>
	Gender:<br/>
	<input type="radio" name="gender" value="female">Female<br/>
	<input type="radio" name="gender" value="male">Male<br/><br/>
	Mobile no:<br/>
	<input type="text" name="no"><br/><br/>
	Enter Password:<br/>
	<input type="password" name="pwd1"><br/><br/>
	Confirm Password:<br/>
	<input type="password" name="pwd"><br/><br/>
	Click on <input type="submit" value="OK">
</form>
</body>
