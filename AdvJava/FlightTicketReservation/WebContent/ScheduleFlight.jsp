
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>schedule flight</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
</head>
<body>
		<nav class="navbar  navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/">Flight Booking(admin) </a>
			
			<a href="<%=request.getContextPath()%>/ScheduleFlight.jsp"
				class="btn btn-warning btn-sm">Booked flights</a> 
				
				<a href="<%=request.getContextPath()%>/ScheduleFlight.jsp"
				class="btn btn-warning btn-sm">Passengers</a> 

				<a href="<%=request.getContextPath()%>/AddNewFlilght.jsp"
				class="btn btn-warning btn-sm">Manage flights</a> 

				<a href="<%=request.getContextPath()%>/ScheduleFlight.jsp"
				class="btn btn-warning btn-sm">Schedule flight</a> 

				<a href="<%=request.getContextPath()%>/feedback-list.jsp"
					class="btn btn-warning btn-sm">User Feedbacks</a>
					
				<a href="<%=request.getContextPath()%>/complaint-list.jsp"
					class="btn btn-warning btn-sm">Complaints</a>
					
					<form class="flex-d">
					
					 <a
					href="<%=request.getContextPath()%>/logout"
				     class="btn btn-warning btn-sm">LogOut</a> &nbsp;
					
					</form>


		</div>
	</nav>
	<div class="container col-md-5 my-md-5">
		<div class="card " >
			<div class="card-body bg bg-warning border border-danger rounded">
				
				
  
  <form action="scheduleFlight" method="post">
   
		<h1>Schedule the Flight</h1>
		
		
		 <fieldset class="form-group">
		<label>Flight id</label>
		 <input type="text" name="flight_id" class="form-control" >
		 </fieldset>
		 
		
		 <fieldset class="form-group">
		<label>Arrival date</label>
		 <input type="date" placeholder="yyyy-MM-dd"
			name="flight_arrival_date" class="form-control" >
			</fieldset>
			
			<!-- <input  id="appt-time"
					 type="time"  step="2"	" class="form-control"
						value="<c:out value='${feedback.fd_feedback}' />"
						name="fd_feedback" required="required"> -->
			
			
			 <fieldset class="form-group">
		<label>Arrival Time</label>
		 <input id="appt-time"
					 type="time"  step="2"	
			name="flight_arrival_time" class="form-control" >
			</fieldset>
			
			
			 <fieldset class="form-group">
	      	<label>Departure Date</label>
		 <input type="date" placeholder="yyyy-MM-dd"
			name="flight_departure_date" class="form-control" >
			</fieldset>
			
			
			 <fieldset class="form-group">
		<label>Departure Time</label><input 
		id="appt-time" type="time"  step="2"	
			name="flight_departure_time" class="form-control">
			</fieldset>
			
			
			 <fieldset class="form-group">
		<label>Stop Type:-</label>
		<select name="flight_stop_types" class="form-control" >
			<option value="Non-Stop">Non-Stop</option>
			<option value="With-Stop">With-Stop</option>
		</select>
		</fieldset>
		
		
		 <fieldset class="form-group">
		<label>Route id</label>
		 <input type="text" name="flight_routeid" class="form-control" >
		 </fieldset>
		 
		
		 <fieldset class="form-group">
		<label>Offer id</label>
		 <input type="text" name="flight_offerid" class="form-control" >
		 <fieldset class="form-group">
		 </fieldset>
		 
		 
		 <fieldset class="form-group">
		<label>Availibility Status</label>
		
		 <fieldset class="form-group">
		<select name="flight_availibility_status" class="form-control" >
			<option value="available">Available</option>
			<option value="Cancelled">Cancelled</option>
			
		</select> 
		</fieldset>
		       <div class="col text-center">
                                <button type="submit" value="add" class="btn btn-success center">
							Add </button>
                       </div>
	</form>
				
					
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
