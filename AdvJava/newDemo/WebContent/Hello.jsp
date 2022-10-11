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
<%-- <c:url value="/forEach.jsp" var="helloUrl"></c:url>
<h4><a href="${helloUrl}">Click</a></h4>
<c:out value="Hello From JSTL"/><br/>

<c:import var="webData" url="https://www.cybage.com/"/>
<c:out value="${webData}" escapeXml="false"/> --%>


<c:catch var="exception">
	<%int x=5/0; %>
</c:catch>

<c:if test="${exception ne null}">
<p>exception is:${exception}<br>
   exception Message:${exception.message}
</p>
</c:if>








<%-- <c:set var="num1" value="101"></c:set>
<c:set var="age" value="26"></c:set>

<c:out value="${age}"/><br/>

<c:if test="${age >= 18}">
<c:out value="You are eligible for voting"/>
</c:if>

<c:if test="${age < 18}">
<c:out value="You are not eligible for voting"/>
</c:if> --%>
</body>
</html>