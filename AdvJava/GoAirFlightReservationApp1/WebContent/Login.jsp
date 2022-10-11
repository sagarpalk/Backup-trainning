<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Login Form</title>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style >
   .card{
   color: blue;
   background-color:pink;
   border-color:pink ;
   border-width:8px;
  
   }
   #div{
     border-color:pink ;
   border-width:8px;
   }
</style>

</head>
<body style="background-image: url(login.jfif)">
<form action="LoginCheck" method="post">

<section class="vh-100 gradient-custom">
<h2 class="fw-bold mb-2 text-uppercase text-white" style="text-align:center">Login Form</h2>
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-black text-red" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">

              
              <p class="text-dark-50 mb-5"></p>

              <div class="form-outline form-red mb-4">
               <label class="form-label" for="user_email">Email</label>
                <input type="email"  name="user_email"class="form-control form-control-lg" placeholder="abc@gmail.com" />
              </div>
              

              <div class="form-outline form-white mb-4">
              <label class="form-label" for="user_password" >Password</label>
                <input type="password" name="user_password"class="form-control form-control-lg"  />
              </div>
              <button class="btn btn-outline-dark btn-lg  px-5 " type="submit">Login</button>
              

              
            </div>

            <div>
              <p class="mb-0">Don't have an account? <a href="registration.jsp" class="text-dark-50 fw-bold">Sign Up</a>
              </p>
            </div>

          </div>
        </div>
      </div>
    </div>
  </div>
</section> 
</form>
</body>
</html> --%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>loginPage</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>


	<nav class="navbar  navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="Login.jsp">GoAir Flight Booking App</a>

			<form class="d-flex">

				<a href="registration.jsp" class="btn btn-danger">Signup</a>
					
			</form>

		</div>
	</nav>
	<div class="container col-md-5 my-md-5">
		<div class="card ">
			<div class="card-body bg bg-warning border border-danger rounded">
			
				<h1>Login Form</h1>
				<!--<form action="<%=request.getContextPath()%>/login" method="post">  -->
				<form action="LoginCheck" method="post">

					<div class="form-group">
						<label for="uname">User email:</label> <input type="text"
							class="form-control" id="email" placeholder="User email"
							name="email" required>
					</div>

					<div class="form-group">
						<label for="uname">Password:</label> <input type="password"
							class="form-control" id="password" placeholder="password"
							name="password" required>
					</div>
					 <div class="col text-center">
						<button type="submit" value="login" class="btn btn-primary">Login</button>
					</div> 
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>