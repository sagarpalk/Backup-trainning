
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
.active, .btn:hover {
  background-color: #666;
  color: white;
}
</style>
</head>
<body>
<div class="container-fluid">
		<h1 class="text-center">Online flight reservation System</h1>
	</div>
<nav class="navbar navbar-expand-lg  navbar-dark bg-info">
  <div class="container-fluid"  id="myDIV">
  
    <a class="navbar-brand  btnbtn-warning btn" href="#">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
     
				
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
     
          <a
				href="<%=request.getContextPath()%>/ScheduleFlight.jsp"
				class="btn btn-warning btn">Search Flight</a>  &nbsp;
        </li>
        <li class="nav-item">
     
          <a href="<%=request.getContextPath()%>/AddNewFlilght.jsp"
				class="btn btn-warning ">BookTicket</a>  &nbsp;
        </li>
        
        <li class="nav-item">
          <a
				href="<%=request.getContextPath()%>/myTicket.jsp"
				class="btn btn-warning btn">My Ticket</a> &nbsp;
        </li>
        <li class="nav-item">
     
          <a
				href="<%=request.getContextPath()%>/listOffer"
				class="btn btn-warning btn">Ongoing Offers</a>  &nbsp;
        </li>
         <li class="nav-item">
     
        <a
				href="profile_page.jsp" class="btn btn-warning">Profile</a>  &nbsp;
        </li>
       
        <li class="nav-item">
     
         <a
				href="<%=request.getContextPath()%>/feedback_form.jsp"
				class="btn btn-warning ">Give Feedback</a>  &nbsp;
        </li>
        
        
         
        
          <li class="nav-item">
     
        <a
				href="<%=request.getContextPath()%>/complaint_form.jsp"
				class="btn btn-warning">Do Complaint</a>  &nbsp;
        </li>
        
       
       
				 <li class="nav-item">
				 
				 <div class="dropdown">
					<button class="btn btn-warning dropdown-toggle" type="button"
						id="dropdownMenuButton2" data-bs-toggle="dropdown"
						aria-expanded="false">
						My History
					</button>
					<ul class="dropdown-menu dropdown-menu-dark"
						aria-labelledby="dropdownMenuButton2">
						<li><a class="dropdown-item active" href="mycomplaint-list.jsp">My Complaint History
								</a></li>
						<li><a class="dropdown-item" href="myfeedback-list.jsp">My Feedbacks History</a></li>
						
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="index.jsp">Logout</a></li>
					</ul>
				</div>
     
    
        </li>
        </ul>
        	<form class="flex-d">
				<div class="dropdown">
					<button class="btn btn-danger dropdown-toggle" type="button"
						id="dropdownMenuButton2" data-bs-toggle="dropdown"
						aria-expanded="false">
						<%=request.getSession().getAttribute("currentUser")%>
					</button>
					<ul class="dropdown-menu dropdown-menu-dark"
						aria-labelledby="dropdownMenuButton2">
						<li><a class="dropdown-item active" href="user.jsp">Update
								Profile</a></li>
												
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="index.jsp">Logout</a></li>
					</ul>
				</div>



			</form>
    </div>
  </div>
</nav>
		


<script>
// Add active class to the current button (highlight it)
var header = document.getElementById("myDIV");
var btns = header.getElementsByClassName("btn");
for (var i = 0; i < btns.length; i++) {
  btns[i].addEventListener("click", function() {
  var current = document.getElementsByClassName("active");
  current[0].className = current[0].className.replace(" active", "");
  this.className += " active";
  });
}
</script>
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
