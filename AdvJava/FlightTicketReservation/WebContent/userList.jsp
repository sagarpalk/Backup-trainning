<%--
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<th>First Name</th>                                
			<th>Last Name</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${requestScope.userList}" var="users">
		<tr>
			<td><c:out value="${users.id }"></c:out></td>
			<td><c:out value="${users.firstName }"></c:out></td>
			<td><c:out value="${users.lastName }"></c:out></td>
			<td><c:out value="${users.email }"></c:out></td>
		</tr>
			
		</c:forEach>
		
	</table>
</body>
</html>
 --%>>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>feedbacklist</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

</head>
<body>

	<div class="row">
		

		<div class="container">
			<h3 class="text-center">List of Users</h3>
					
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>First Name</th>                                
						<th>Last Name</th>
						<th>Email</th>
						<th>Action</th>
						
					</tr>
				</thead>
				<tbody>

					<c:forEach var="users" items="${requestScope.userList}">

						<tr>
							<td><c:out value="${users.id}" /></td>
							<td><c:out value="${users.firstName}" /></td>
							<td><c:out value="${users.lastName}" /></td>
							<td><c:out value="${users.email}" /></td>
							
							
                
							<td>
							<a href="update.jsp "class="btn btn-warning" >Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp;
								 <a href="deleteUser.jsp" class="btn btn-danger" name="id" >Delete</a>
								 </td>
						</tr>
					</c:forEach>
					
				</tbody>

			</table>
		</div>
	
	
</body>
</html>
