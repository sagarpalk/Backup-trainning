<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
</head>
<body>
	<nav class="navbar  navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="registration.jsp">GoAir Flight booking App</a>
			<form class="d-flex">
				<a href="Login.jsp" class="btn btn-warning">Login</a> &nbsp;&nbsp;&nbsp;
					class="btn btn-danger">Signup</a> -->
			</form>
		</div>
	</nav>
	<div class="container col-md-5 my-md-5">
		<div class="card ">
			<div class="card-body bg bg-warning border border-danger rounded">
				<h2>User Register Form</h2>
				<div class="alert alert-primary center bg bg-warning" role="alert">
					<h4>${REGI}</h4>
				</div>
				<form action="Registration" method="post">
					<div class="form-group">
						<label for="uname">First Name:</label> <input type="text"
							class="form-control" id="uname" placeholder="First Name"
							name="firstName" required>
					</div>
					<div class="form-group">
						<label for="uname"> Email:</label> <input type="email"
							class="form-control" id="username" placeholder="your email"
							name="email" required>
					</div>
					<div class="form-group">
						<label for="uname">Password:</label> <input type="password"
							class="form-control" id="password" placeholder="Password"
							name="password" required>
					</div>
					<div class="form-group">
						<label for="uname">Contact:</label> <input type="number"
							class="form-control" id="contact" placeholder="Contact"
							name="contact" required>
					</div>
						<div class="form-group">
						<label for="uname">Address:</label> <input type="text"
							class="form-control" id="address" placeholder="address"
							name="address" required>
					</div>
						<div class="form-group">
						<label for="uname">Age:</label> <input type="number"
							class="form-control" id="age" placeholder="age"
							name="age" required>
					</div>
					<div>
					<p>Gender :</p>
                        <input type="radio" name="gender" value="male"> Male
                        <input type="radio" name="gender" value="female"> Female
                     </div> 
                        
					<div class="form-group">
						<label for="role">Role:</label> <input type="text"
							class="form-control" id="role" value="user" name="role" Readonly>
					</div>
					<div class="col text-center">
						<button type="submit" value="Register" class="btn btn-primary">Register</button>
					</div>
				</form>

			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>