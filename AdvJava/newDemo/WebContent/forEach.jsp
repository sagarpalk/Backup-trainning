<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
<c:forEach var="iterator" begin="100" end="110">	
Count: <c:out value="${iterator}"/> <br>
</c:forEach><br>

<c:forEach var="i" items="1,4,6,8,5,2,6">
Items: <c:out value="No.${i}"/> <p>
</c:forEach>

<%
	List<String> numList=new ArrayList<String>();
	numList.add("Ron");
	numList.add("Don");
	numList.add("Tron");
	request.setAttribute("numList", numList);
%>

<c:forEach items="${numList}" var="item" varStatus="status">
		${status.count} ${item}<br/>
	</c:forEach>
<p>

</body>
</html>