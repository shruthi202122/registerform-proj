<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div{
color:green;
}

</style>
</head>
<body>
<%@ include file="header.html"%>
<%--if(request.getAttribute("success-msg")!=null){
	out.println(request.getAttribute("success-msg"));
	
  }	--%>
  <div>
 <c:if test="${not empty requestScope.successmsg}">
 	<c:out value="${successmsg}"/>
 </c:if>
  
  </div>
<%@ include file="landing.jsp" %>

</body>
</html>