<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>complaint_list</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>

</head>
<body>
	<header>
		<p>
			<%
				request.getSession().getAttribute("currentUser");
			%>
			
			<%
				String currentuser = (String) request.getSession().getAttribute("currentUser");
			%>

		</p>
		<nav class="navbar  navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="/">Flight Booking(admin) </a> <a
					href="<%=request.getContextPath()%>/ScheduleFlight.jsp"
					class="btn btn-warning btn-sm">Booked flights</a> <a
					href="<%=request.getContextPath()%>/ScheduleFlight.jsp"
					class="btn btn-warning btn-sm">Passengers</a> <a
					href="<%=request.getContextPath()%>/AddNewFlilght.jsp"
					class="btn btn-warning btn-sm">Manage flights</a> <a
					href="<%=request.getContextPath()%>/ScheduleFlight.jsp"
					class="btn btn-warning btn-sm">Schedule flight</a> <a
					href="<%=request.getContextPath()%>/feedback-list.jsp"
					class="btn btn-warning btn-sm">User Feedbacks</a> <a
					href="<%=request.getContextPath()%>/complaint-list.jsp"
					class="btn btn-warning btn-sm">Complaints</a>

				<form class="flex-d">

					<a href="<%=request.getContextPath()%>/logout"
						class="btn btn-warning btn-sm">LogOut</a> &nbsp;

				</form>


			</div>
		</nav>
	</header>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of collected complaints</h3>
			<hr>
			<div class="container text-center">

				 <a href="<%=request.getContextPath()%>/clist"
					class="btn btn-info">Watch Complaints</a>


			</div>
			<br>
			<table class="table table-dark ">
				<thead>
					<tr>
						<th>Complaint id</th>
						<th>Complaint description</th>
						<th>Flight Id:</th>
						<th>User id:</th>
						<th>Status :</th>
						<th>Action</th>

					</tr>
				</thead>
				<c:forEach var="comp" items="${listComplaints}">

					<tr>
						<td><c:out value="${comp.c_complaintid}" /></td>
						<td><c:out value="${comp.c_complaint}" /></td>


						<td><c:out value="${comp.c_flightid}" /></td>
						<td><c:out value="${comp.c_userid}" /></td>

						<c:if test="${comp.c_status eq 'unresolved'}">
							<td class="bg bg-danger"><c:out value="${comp.c_status}" /></td>
						</c:if>

						<c:if test="${comp.c_status eq 'resolved'}">
							<td class="bg bg-success"><c:out value="${comp.c_status}" /></td>
						</c:if>

						<td><a
							href="edit_complaint?c_complaintid=<c:out value='${comp.c_complaintid}'/>"
							class="btn btn-warning"> <c:if test="${currentuser !=null}">
								Send Reminder to Admin 
								</c:if> <c:if test="${currentuser ==null}">
							     Change status for user
								</c:if>
						</a>
								 </td>
								
						

						</td>
						
					</tr>
				</c:forEach>

				</tbody>
			</table>
		</div>
	</div>



</body>
</html>





