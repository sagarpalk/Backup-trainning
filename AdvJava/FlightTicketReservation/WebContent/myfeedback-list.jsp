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
<jsp:include page="userDashBoard.jsp"></jsp:include>
	   
	
	</header>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">My feedback history</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/feedback/new"
					class="btn btn-danger">Add New Feedback</a>
					
					<a href="<%=request.getContextPath()%>/myfeedbacklist"
					class="btn btn-warning">Watch my Feedbacks</a>
					
					
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
					<c:forEach var="myFeed" items="${myFeedback}">

						<tr>
							<td><c:out value="${myFeed.fd_feedbackid}" /></td>
							<td><c:out value="${myFeed.fd_feedback}" /></td>
							<td><c:out value="${myFeed.fd_rating}" /></td>
							<td><c:out value="${myFeed.fd_flightid}" /></td>
							<td><c:out value="${myFeed.fd_userid}" /></td>
							
                
							<td>
							<a href="edit?fd_feedbackid=<c:out value='${myFeed.fd_feedbackid}'/>"class="btn btn-warning" >Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp;
								 <a href="delete?fd_feedbackid=<c:out value='${myFeed.fd_feedbackid}'/>"class="btn btn-danger" name="fd_feedbackid" >Delete</a>
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
