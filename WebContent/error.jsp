<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
<body>
<%@ include file="header.html"%>
<div> 
<%if(request.getAttribute("err-msg")!=null) {%>
	<%=request.getAttribute("err-msg")%>
<%} %>
</div>
<%@ include file="landing.jsp"%>

</body>
</html>