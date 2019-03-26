<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
	div{
		color:red;
	}
</style>

</head>
<body >
<div>
<c:if test="${not empty errmsg}">
	<c:out value="${errmsg}"/>
</c:if>
</div>
<%@ include file="register.jsp"%>

</body>
</html>