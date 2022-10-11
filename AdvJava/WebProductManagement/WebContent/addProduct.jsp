<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product</h1>
	<hr />

	<form action="/ProductController"<%-- "${pageContext.request.contextPath}/ProductController" --%>
		method="post">
		<table>
			<tr>
				<td>Product Id:</td>
				<td><input type="number" name="id" required></td>
			</tr>
			<tr>
				<td>Product Name:</td>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<td>Product Price:</td>
				<td><input type="number" name="price" required></td>
			</tr>

		</table>
		<br>
		<button type="submit">Add Product</button>
	</form>
</body>
</html>