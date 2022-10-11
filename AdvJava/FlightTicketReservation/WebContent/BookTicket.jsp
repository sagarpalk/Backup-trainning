<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="BookTicket">
		<h1>Book Flight</h1>
		<br>
		<h5>Flight Schedule Id</h5>
		<br> <input type="text" name="scheduleId"><br>
		<h5>Passport Id</h5>
		<br> <input type="text" name="passportId"><br>
		   
	    <select name="classType">
	    //change here
			<option value="child">Child</option>
			<option value="adult">Adult</option>
			</select>
			<h5>Seat Type</h5>
			 <select name="classType">
	    
			<option value="child">Child</option>
			<option value="adult">Adult</option>
			</select>
		<h5>Number Of Tickets</h5>
		<br> <input type="text" name="numTickets"><br>
		<h5>Status</h5>
		<br> <input type="text" name="status"  value="booked" Readonly><br>
		<h5>User Id</h5>
		<br> <input type="text" name="userId"><br>
		<br> <br> <input type="submit" value="Book Ticket">
	</form>

</body>
</html>