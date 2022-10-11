<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListOffers</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<%
		request.getSession().getAttribute("currentUser");
	%>

	<%
		String currentuser = (String) request.getSession().getAttribute("currentUser");
	%>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Offers</h3>
			<hr>
			<div class="container text-left">
				<c:if test="${currentuser != null}">
					<a href="addOffer.jsp" class="btn btn-success">AddNew Offer</a>
					<a href="updateOffer.jsp" class="btn btn-info">Update Offer</a>
				</c:if>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Offer id</th>
						<th>Offer name</th>
						<th>Offer rate</th>
						<c:if test="${currentuser != null}">
							<th>Action</th>
						</c:if>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="offer" items="${listOffer}">
						<tr>
							<td><c:out value="${offer.o_offerid}" /></td>
							<td><c:out value="${offer.o_name}" /></td>
							<td><c:out value="${offer.o_rate}" /></td>

							<c:if test="${currentuser != null}">
								<td><a
									href="updateOffer.jsp?o_offerid=<c:out value='${offer.o_offerid}'/>"
									class="btn btn-warning" name="o_offerid">Update </a>
									&nbsp;&nbsp;&nbsp;&nbsp; <a
									href="deleteOffer?o_offerid=<c:out value='${offer.o_offerid}'/>"
									class="btn btn-danger" name="o_offerid">Delete </a></td>
							</c:if>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>