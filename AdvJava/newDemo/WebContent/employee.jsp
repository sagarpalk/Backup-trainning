<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>

		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Role</th>
		</tr>
		<c:forEach items="${applicationScope.empList}" var="emp">
			<tr>
				<td><c:out value="${emp.id}"></c:out></td>
				<td><c:out value="${emp.name}"></c:out></td>
				<td><c:out value="${emp.role}"></c:out></td>
			</tr>
		</c:forEach>

	</table>
	<br>
	<br>
	<%-- simple c:if and c:out example with HTML escaping --%>
	
	<c:if test="${requestScope.htmlTagData ne null }">
		<c:out value="${requestScope.htmlTagData}"></c:out>
	</c:if>
	<br>
	<br>
	<%-- c:set example to set variable value --%>
	<c:set var="id" value="5" scope="request"></c:set>
	<c:out value="${requestScope.id }"></c:out>
	<br>
	<br>


	<%-- c:url example --%>
	<a href="<c:url value="${requestScope.url }"></c:url>">Cybage</a>
</body>
</html>