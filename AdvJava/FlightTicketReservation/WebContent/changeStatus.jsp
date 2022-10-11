<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>comp_form</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>

</head>
<body>
	<header>
		<nav class="navbar  navbar-dark bg-info">
			<div class="container-fluid">
				<a class="navbar-brand" href="/">Flight Booking(user) </a> <a
					href="<%=request.getContextPath()%>/AddNewFlilght.jsp"
					class="btn btn-warning btn-sm">BookTicket</a> <a
					href="<%=request.getContextPath()%>/ScheduleFlight.jsp"
					class="btn btn-warning btn-sm">Search Flight</a> <a
					href="<%=request.getContextPath()%>/Feeback"
					class="btn btn-warning btn-sm">My Ticket</a> <a
					href="<%=request.getContextPath()%>/feedback_form.jsp"
					class="btn btn-warning btn-sm">Give Feedback</a> <a
					href="<%=request.getContextPath()%>/myfeedback-list.jsp"
					class="btn btn-warning btn-sm"> My Feedbacks & Complaints</a> <a
					href="profile_page.jsp" class="btn btn-warning btn-sm">Profile</a>
				<a href="<%=request.getContextPath()%>/login"
					class="btn btn-warning btn-sm">Do Complaint</a>
				<form class="flex-d">
					<a href="index.jsp" class="btn btn-warning btn-sm">LogOut</a>
					&nbsp;
				</form>
				
				
				<!-- <a href="<%=request.getContextPath()%>/logout"class="nav-link">Logout</a> -->

			</div>
		</nav>

	</header>
	<div class="container col-md-5 mt-1">
		<div class="card ">
			<div class="card-body bg bg-warning border border-danger rounded">

				<form action="update_cStatus" method="post">
				
				
				<caption>
					<h2>
						
            			Change complaint status
            		
					</h2>
				</caption>
				
	
            <fieldset class="form-group">
					<label>Complaint user id</label> 
					
						<input type="text" name="c_complaintid" class="form-control"
						 />
					
				</fieldset>
									
			
					
				
			
					<fieldset class="form-group">
					<label>Complaint Status</label> <select class="form-control"
						name="c_status">
						<option value="unresolved">Not Resolved</option>
						<option value="resolved">Resolved</option>
					</select>
				</fieldset>
				
				 <div class="col text-center">
				<button type="submit" class="btn btn-success">change</button>
				</div>
				
			  </form>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
			
		

		


