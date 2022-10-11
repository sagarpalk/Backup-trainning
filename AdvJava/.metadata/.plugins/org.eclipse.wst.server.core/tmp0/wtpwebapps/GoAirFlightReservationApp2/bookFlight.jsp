<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>&lt;sql:dateParam&gt; Demo</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<sql:setDataSource var="myDS" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/airlinebooking" user="root"
		password="root" />
	<table border="1">
		<!-- <tr>
			<th>Flight_No</th>
			<th>Flight_name</th>
			<th>Flight _price</th>
		</tr> -->
		<c:forEach var="row" items="${pro.rows}">
			<tr>
				<td><c:out value="${row.flight_No}" /></td>
				<td><c:out value="${row.flight_name}" /></td>
				<td><c:out value="${row.flight_price}" /></td>

			</tr>
		</c:forEach>


	</table>
	<div class="container col-md-5 my-md-5">
		<div class="card ">
			<div class="card-body bg bg-warning border border-danger rounded">

				<h1>Book Flight</h1>

				<form action="TicketBookingController" method="post">

					<div class="form-group">
						<label for="uname">Flight No:</label> <input type="number"
							class="form-control" id="flight_No" placeholder="flight nol"
							name=flight_No required>
					</div>

					<div class="form-group">
						<label for="uname">Departure_date:</label> <input type="date"
							class="form-control" id="flight_date" placeholder="date"
							name="flight_date" required>
					</div>
					<div class="form-group">
						<label for="uname">flight_time:</label> <input type="time"
							class="form-control" id="flight_date" placeholder="date"
							name="flight_time" required>
					</div>
					<div class="form-group">
						<label for="flight_class">class:</label> <select
							name="flights_class_name" id="flights_class">
							<option value="First Class">First Class</option>
							<option value=" Business Class">Business Class</option>
						</select>
					</div>
					<div class="form-group">
						<label for="uname"> Price:</label> <input type="number"
							class="form-control" id="flight_No" placeholder="No of seats"
							name="price" required>
					</div>
					<div class="form-group">
						<label for="uname"> No of seats:</label> <input type="number"
							class="form-control" id="flight_No" placeholder="No of seats"
							name="no_of_seats" required>
					</div>

					<div class="col text-center">
						<button type="submit" value="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>