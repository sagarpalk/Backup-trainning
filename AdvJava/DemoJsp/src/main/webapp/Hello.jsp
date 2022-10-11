<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="Hello From JSTL"/><br/>

<c:set var="num1" value="101"></c:set>
<c:set var="age" value="26"></c:set>

<c:out value="${age}"/><br/>

<c:if test="${age >= 18}">
<c:out value="You are eligible for voting"/>
</c:if>

<c:if test="${age < 18}">
<c:out value="You are not eligible for voting"/>
</c:if>
</body>
</html>