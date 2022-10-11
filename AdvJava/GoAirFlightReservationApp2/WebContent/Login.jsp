<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>loginPage</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>


	<nav class="navbar  navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="Login.jsp">GoAir Flight Booking App</a>

			<form class="d-flex">

				<a href="registration.jsp" class="btn btn-danger">Signup</a>

			</form>

		</div>
	</nav>
	<div class="container col-md-5 my-md-5">
		<div class="card ">
			<div class="card-body bg bg-warning border border-danger rounded">

				<h1>Login Form</h1>
				<form action="LoginCheck" method="post">
					<div class="form-group">
						<label for="uname">User email:</label> <input type="text"
							class="form-control" id="email" placeholder="User email"
							name="email" required>
					</div>
					<div class="form-group">
						<label for="uname">Password:</label> <input type="password"
							class="form-control" id="password" placeholder="password"
							name="password" required>
					</div>
					<div class="col text-center">
						<button type="submit" value="login" class="btn btn-primary">Login</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>