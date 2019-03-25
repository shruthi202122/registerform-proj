<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <head>
 <style>
	div{
		color:red;
	}
</style>
<script>
function myFunction(){
	console.log("inside myFunction()");
	var pwd1=document.getElementById("pwd1").value;
	console.log("pwd1="+pwd1);
	var pwd2=document.getElementById("pwd2").value;
	console.log("pwd2="+pwd2);
	if(pwd1==pwd2){
		document.getElementById("registerForm").submit();
	}
	else{
		window.alert("Password and ConfirmPassword not matched!");
	}
} 
</script>
 </head>

<body style="background-color:violet">
<c:import url="header.html"/>

<%--if(request.getAttribute("err-msg")!=null){
	out.println(request.getAttribute("err-msg"));
} 
--%>
<div>
<c:if test="${not empty errmsg}">
	<c:out value="${errmsg}"/>
</c:if>
</div>
<form action="Register" method="post" id="registerForm">
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
	<input type="password" name="pwd1" id="pwd1"><br/><br/>
	Confirm Password:<br/>
	<input type="password" name="pwd" id="pwd2"><br/><br/>
	Click on <input type="button" onclick="myFunction()" value="OK">
</form>
</body>
