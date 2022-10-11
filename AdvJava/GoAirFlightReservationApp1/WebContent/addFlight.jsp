<%-- <%@page import="com.cybage.model.Flight"%>
<%@page import="com.cybage.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/addFlight.css" rel="stylesheet" type="text/css">
</head>
<body>
<table>
<form action="AddFlightController2" method="post">

//flightNo:<input type="number"  name="flight_No"/><br>
//TotalSeats:<input type="number"  name="flight_total_no_seats"/><br>
//AvaliableSeats:<input type="number"  name="flight_avaliable_seats"/><br>
//FlightName:<input type="text"  name="flight_name"/><br>
//flightSource:<input type="text"  name="flight_source"/><br>
//flightDestination:<input type="text"  name="flight_destination"/><br>
//flightType:<input type="text"  name="flight_type"/><br>
flightTime:<input type="time"  name="flight_time"/><br>
flightDate:<input type="date"  name="flight_date"/><br>
//flightPrice:<input type="number"  name="flight_price"/><br>
<input type="submit" value="submit">
<%session.getAttribute("flight"); %>
</form>
</table>
</body>
</html> --%>






 
 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>add flight</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>

</head>
<body>
	<header>
		<nav class="navbar navbar-dark bg-info navbar-fixed-top">
			<div>
				<h4>Flight Booking: admin</h4>
			</div>
			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>addFlight.jsp"
					class="btn btn-warning btn-sm">Add flight</a></li>
			</ul>
			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>deleteFlight.jsp"
					class="btn btn-dark btn-sm">Delete flight</a></li>
			</ul>
			<ul class="navbar-nav ">
				<li><a href="<%=request.getContextPath()%>/logout"
					class="btn btn-danger btn-sm">Logout</a></li>
			</ul>
		</nav>
	</header>

	<div class="container col-md-5 my-md-5">
		<div class="card " >
			<div class="card-body bg bg-warning border border-danger rounded">
				<form action="AddFlightController2" method="post">
					<h1>Add Flight</h1>

				
					
					    <fieldset class="form-group">
							<label>Flight Name</label> <input type="text"
								class="form-control" name="flight_name">
						</fieldset>

						<fieldset class="form-group">
							<label>flight No.</label> <input type="number"
								class="form-control" name="flight_No">
						</fieldset>

						<fieldset class="form-group">
							<label>Flight Type</label> <input type="text"
								class="form-control" name="flight_type">
						</fieldset>

						<fieldset class="form-group">
							<label>Total Seats</label> <input type="number"
								class="form-control" name="flight_total_no_seats">
						</fieldset>

						<fieldset class="form-group">
							<label>Available Seats</label>
							 <input type="text"
								class="form-control" name="flight_avaliable_seats">
						</fieldset>

						<fieldset class="form-group">
							<label>Economic Class Seat's Price: </label> 
							<input type="number" class="form-control"
								name="economicPrice">
						</fieldset>

						<fieldset class="form-group">
							<label>Flight From....</label> <input type="text"
								class="form-control" name="flight_source">
						</fieldset>

						<fieldset class="form-group">
							<label>Flight To....</label> <input type="text"
								class="form-control" name="flight_destination">
						</fieldset>
						
						<fieldset class="form-group">
							<label>Flight Date</label> <input type="date"
								class="form-control" name="flight_date">
						</fieldset>
						
						<fieldset class="form-group">
							<label>Flight Time</label> <input type="time"
								class="form-control" name="flight_time">
						</fieldset>
						
						 <div class="col text-center">
                                <button type="submit" value="add" class="btn btn-success center">
							Add Flight</button>
                       </div>

						
				</form>
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
 