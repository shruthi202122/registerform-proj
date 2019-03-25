<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<c:import url="header.html"/>
<div>
 
<%--if(request.getAttribute("err-msg")!=null) {%>
	<%=request.getAttribute("err-msg")%>
<%} --%>

<c:if test="${not empty requestScope.errmsg}">
<c:out value="${errmsg}"/></c:if>

</div>
<c:import url="landing.jsp"/>

</body>
</html>