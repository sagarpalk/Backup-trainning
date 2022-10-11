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

					<form action="cinsert" method="post">
				<caption>
					<h2>					
            		 	
            			 Add New Complaint
           		
					</h2>
				</caption>
				
	
            
			
			
	<!-- c_complaintid
c_complaint
c_flightid
c_userid
c_status -->			
				
				<c:if test="${compp != null}">
					<input type="hidden" name="c_complaintid"
						value="<c:out value='${complaintform.c_complaintid}' />" />
				</c:if>
				
				<c:if test="${compp == null}">
				<fieldset class="form-group">
					<label> Write Comment </label> <input  
					 type="text" " class="form-control"
						value="<c:out value='${complaint.c_complaint}' />"
						name="c_complaint" required="required"> 
				</fieldset>

					<fieldset class="form-group">
						<label>Flight id:</label> <input type="text"
							value="<c:out value='${complaint.c_flightid}' />"
							class="form-control" name="c_flightid">
					</fieldset>
					
					
					<fieldset class="form-group">
						<label> User id:</label> <input type="text"
							value="<c:out value='${complaint.c_userid}' />"
							class="form-control" name="c_userid">
					</fieldset>
					</c:if>
					<fieldset class="form-group">
					<label>Complaint Status</label> <select class="form-control"
						name="c_status">
						<option value="unresolved">Not Resolved</option>
						<option value="resolved">Resolved</option>
					</select>
				</fieldset>
				
				 <div class="col text-center">
				<button type="submit" class="btn btn-success">submit</button>
				</div>
				
			  </form>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
			
		

		


