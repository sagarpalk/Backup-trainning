<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>feedbacklist</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

</head>
<body>
	<header>

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
	</header>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of collected Feedbacks</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new"
					class="btn btn-success">Add New Feedback</a>
					
					<a href="<%=request.getContextPath()%>/list"
					class="btn btn-info">Watch Feedbacks</a>
					
					
			</div>
			
			
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Feedback id</th>
						<th>feedback description</th>
						<th>Rating:</th>
						<th>Flight id:</th>
						<th>User id:</th>
						<th>Action</th>
						
					</tr>
				</thead>
				<tbody>
<!-- fd_feedback
fd_feedbackid
fd_flightid
fd_rating
fd_userid -->
					<c:forEach var="feedback" items="${listFeedback}">

						<tr>
							<td><c:out value="${feedback.fd_feedbackid}" /></td>
							<td><c:out value="${feedback.fd_feedback}" /></td>
							<td><c:out value="${feedback.fd_rating}" /></td>
							<td><c:out value="${feedback.fd_flightid}" /></td>
							<td><c:out value="${feedback.fd_userid}" /></td>
							
                
							<td>
							<a href="edit?fd_feedbackid=<c:out value='${feedback.fd_feedbackid}'/>"class="btn btn-warning" >Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp;
								 <a href="delete?fd_feedbackid=<c:out value='${feedback.fd_feedbackid}'/>"class="btn btn-danger" name="fd_feedbackid" >Delete</a>
								 </td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
	
</body>
</html>
