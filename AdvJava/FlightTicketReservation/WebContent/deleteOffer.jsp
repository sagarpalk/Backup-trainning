<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeleteOffer</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-dark bg-info">

			<div>
				<h4>Online Flight Reservation System(ADMIN)</h4>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/listOffer"
					class="nav-link"><h4>List All Offers</h4></a></li>
			</ul>
			<!-- 
			<ul class="navbar-nav navbar-collapse justify-content-end">
				<li><a href="<%=request.getContextPath()%>/logout"
					class="nav-link">Logout</a></li>
			</ul>   -->
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<form method="post" action="deleteOffer">

					<fieldset class="form-group">
						<label> Offer ID</label> <input type="number" class="form-control"
							name="del_offer_id" required="required">
					</fieldset>

					<button type="submit" class="btn btn-success">submit</button>

				</form>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
<!--  
	<form method="post" action="deleteOffer">
		<h1>Delete Offer</h1>
		<br>
		<h5>Offer rate</h5>
		<br> <input type="number" name="del_offer_id"><br> <br>
		<br> <input type="submit" value="delete">
	</form>
	-->
</body>
</html>