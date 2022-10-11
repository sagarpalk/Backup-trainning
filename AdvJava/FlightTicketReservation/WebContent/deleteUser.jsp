<%-- 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>User Login Form</h1>
		<form action="deleteUser" method="post">
			<table>
				<tr>
					<td>Enter Your ID</td>
					<td><input type="text" name="id"></td>
				</tr>
				
				<tr>
					<td></td>
					<td><input type="submit" value="Delete"></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>  --%>>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>loginPg</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>


	<nav class="navbar  navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/">Online Flight Reservation System</a>

			

		</div>
	</nav>
	<div class="container col-md-5 my-md-5">
		<div class="card ">
			<div class="card-body bg bg-warning border border-danger rounded">
			
				<h1>Delete User Profile</h1>
				
				<form action="deleteUser" method="post">

					<div class="form-group">
						<label for="uname">User Id :</label> <input type="text"
							class="form-control" id="id" placeholder="User Id"
							name="id" required>
					</div>
					
					
					<div class="col text-center">
						<button type="submit" value="login" class="btn btn-primary">Delete</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>