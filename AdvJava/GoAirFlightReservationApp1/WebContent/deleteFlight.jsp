<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DeleteFlightController" method="post">
flightNo:<input type="number"  name="flight_No"/><br>

<input type="submit" value="delete">

</body>
</html> --%>



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
			<a class="navbar-brand" href="deleteFlight.jsp">GoAir Flight Booking App</a>

			

		</div>
	</nav>
	<div class="container col-md-5 my-md-5">
		<div class="card ">
			<div class="card-body bg bg-warning border border-danger rounded">
			
				<h1>Delete Flight</h1>
				
				<form action="DeleteFlightController" method="post">

					<div class="form-group">
						<label for="uname">FlightNo :</label> <input type="number"
							class="form-control" id="id" placeholder="FlightNo"
							name="flight_No" required>
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