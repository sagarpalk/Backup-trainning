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
<jsp:include page="userDashboard.jsp"></jsp:include>

	<div align="center">
		<h1>User Update Form</h1>
		<form action="updateUserDetails" method="post">
			<table>
				<tr>
					<td>User ID :</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>First Name :</td>
					<td><input type="text" name="firstName"></td>
				</tr>
				<tr>
					<td>Last Name :</td>
					<td><input type="text" name="lastName"></td>
				</tr>

				<tr>
					<td>password :</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Update"></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="/productList.jsp">Product List</a></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>
--%>



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

			<form class="d-flex">

				<a href="login.jsp"
					class="btn btn-warning">Login</a> &nbsp;&nbsp;&nbsp; <a
					
					href="userRegistration.jsp"
					class="btn btn-danger">Signup</a>
					
			</form>

		</div>
	</nav>
	<div class="container col-md-5 my-md-5">
		<div class="card ">
			<div class="card-body bg bg-warning border border-danger rounded">
			
				<h1>Update User Profile</h1>
				
				<form action="updateUserDetails" method="post">

					<div class="form-group">
						<label for="uname">User Id :</label> <input type="text"
							class="form-control" id="id" placeholder="User Id"
							name="id" required>
					</div>
					
					<div class="form-group">
						<label for="uname">First Name:</label> <input type="text"
							class="form-control" id="firstName" placeholder="First Name"
							name="firstName" required>
					</div>
					
					<div class="form-group">
						<label for="uname">Last Name:</label> <input type="text"
							class="form-control" id="lastName" placeholder="Last Name"
							name="lastName" required>
					</div>
					
					<div class="form-group">
						<label for="uname">Password:</label> <input type="text"
							class="form-control" id="password" placeholder="password"
							name="password" required>
					</div>
					<div class="col text-center">
						<button type="submit" value="login" class="btn btn-primary">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html> 
