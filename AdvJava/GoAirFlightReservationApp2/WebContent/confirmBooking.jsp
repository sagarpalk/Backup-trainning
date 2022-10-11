<%@page import="com.cybage.model.Flight"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
Confirm the Booking...

	<table class="table table-striped">
		<tr>
			
			<th>FlightNo</th>
			<th>Flight Price</th>
			<th>Class</th>			
			<th>Date</th>
			<th>Action</th>
		
		</tr>
		<c:forEach items="${requestScope.flights}" var="flight">
		<tr>
			<td><c:out value="${flight.flight_No}"/></td>			
			<td><c:out value="${flight.flight_price}"/></td>
			<td><c:out value="${flight.flight_type}"/></td>
			<td><c:out value="${flight.flight_date}"/></td>
			
			<td>
				<a href="BookTicketConfirm?flight_No=${flight.flight_No}"><button class="btn btn-warning">Book Ticket Confirm</button></a>
				&nbsp;	
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>