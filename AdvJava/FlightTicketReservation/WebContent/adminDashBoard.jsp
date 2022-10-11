
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
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
				class="btn btn-warning btn-sm">Add flights</a> 

				<a href="<%=request.getContextPath()%>/ScheduleFlight.jsp"
				class="btn btn-warning btn-sm">Schedule flight</a> 

				<a href="<%=request.getContextPath()%>/feedback-list.jsp"
					class="btn btn-warning btn-sm">User Feedbacks</a>
					
				<a href="<%=request.getContextPath()%>/complaint-list.jsp"
					class="btn btn-warning btn-sm">Complaints</a>
					
					<form class="flex-d">

					 <a
					href="<%=request.getContextPath()%>index.jsp"
				     class="btn btn-warning btn-sm">LogOut</a> &nbsp;
					
					</form>


		</div>
	</nav>
	<br>


	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

//admin can booking info for shceduled flihgts by using....fidshceduleid.jsp   
