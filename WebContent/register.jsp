<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <head>
 
<script type="text/javascript" src="validations.js"></script>
 </head>

<body style="background-color:violet">
<c:import url="header.html"/>

<%--if(request.getAttribute("err-msg")!=null){
	out.println(request.getAttribute("err-msg"));
} 
--%>
<form action="Register" method="post" id="registerForm">
	FullName:<br/>
	<input type="text" name="uname" id="uname" required></input><br/><span id="unameErr" style="display:none; color:red;">enter FullName</span><br><br>
	Age:<br/>
	<input type="text" name="age" id="age"></input><br/><span id="ageErr" style="display:none; color:red;">enter age</span><br><br>
	Gender:<br/>
	<input type="radio" name="gender" value="female" id="gender">Female<br/>
	<input type="radio" name="gender" value="male" id="gender">Male<br/><span id="genderErr" style="display:none; color:red;">click gender</span><br><br>
	Mobile no:<br/>
	<input type="text" name="no" id="no"><br/><span id="mbnoErr" style="display:none; color:red;">enter your mobile number</span><br><br>
	Enter Password:<br/>
	<input type="password" name="pwd1" id="pwd1"><br/><span id="pwd1Err" style="display:none; color:red;">enter password must contain 3 or more letters</span><br><br>
	Confirm Password:<br/>
	<input type="password" name="pwd" id="pwd2"><br/><span id="pwd2Err" style="display:none; color:red;">enter password and confirmPassword must be same</span><br><br>
	Click on <input type="button" onclick="myFunction()" value="OK">
</form>
</body>
