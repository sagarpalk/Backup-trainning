<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>feed_form</title>

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
	<div class="container col-md-5 my-md-5">
		<div class="card ">
			<div class="card-body bg bg-warning border border-danger rounded">
			
				<c:if test="${feedbackform != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${feedbackform == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${feedbackform != null}">
            		 	Edit feedback
            		</c:if>
						<c:if test="${feedbackform == null}">
            			 Add New feedback
            		</c:if>
					</h2>
				</caption>
				
				
				<c:if test="${feedbackform != null}">
					<input type="hidden" name="fd_feedbackid"
						value="<c:out value='${feedbackform.fd_feedbackid}' />" />
				</c:if>
				<fieldset class="form-group">
					<label> Write feedback </label> <input  
					 type="text" 	" class="form-control"
						value="<c:out value='${feedbackform.fd_feedback}' />"
						name="fd_feedback" required="required">
						
						 
				</fieldset>

				<fieldset class="form-group">
					<label> Rating(out of 10):</label> <input type="text"
						value="<c:out value='${feedbackform.fd_rating}' />"
						class="form-control" name="fd_rating">
				</fieldset>

				<c:if test="${feedbackform == null}">
					<fieldset class="form-group">
						<label>Flight id:</label> <input type="text"
							value="<c:out value='${feedbackform.fd_flightid}' />"
							class="form-control" name="fd_flightid">
					</fieldset>
					<fieldset class="form-group">
						<label> User id:</label> <input type="text"
							value="<c:out value='${feedbackform.fd_userid}' />"
							class="form-control" name="fd_userid">
					</fieldset>
				</c:if>
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
