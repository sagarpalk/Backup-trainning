<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<style>
@media (min-width: 1025px) {
	.h-custom {
	height: 100vh !important;
	}
	}

</style>
</head>

<body>

  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-1">
          <img src="./img/background.jpg"
            class="w-100"  style="border-top-left-radius:10px; border-top-right-radius:10px; height:500px"
            alt="Sample photo">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Registration Info</h3>

            <form action="register"<%-- <% request.getContextPath(); %>/register --%>" method="post" class="px-md-2">

              <div class="form-outline mb-4">
                
                <label class="form-label" for="form3Example1q">Name</label>
                <input type="text" id="form3Example1q" name="name" class="form-control" />
              </div>
              
                <div class="form-outline mb-4">
               
                <label class="form-label" for="form3Example1q">Email</label>
                 <input type="email" id="form3Example1q" name="email" class="form-control" />
              </div> 
               <div class="form-outline mb-4">
                
                <label class="form-label" for="form3Example1q">Password</label>
                <input type="password" id="form3Example1q" name="password" class="form-control" />
              </div>
              
                <div class="form-outline mb-4">
                
                <label class="form-label" for="form3Example1q">Mobile No</label>
                <input type="number" id="form3Example1q" name="phoneNo" class="form-control" />
              </div>
              
               <div class="form-outline mb-4">
              
                <label class="form-label" for="form3Example1q">Role</label>
                  <input type="text" id="form3Example1q" class="form-control" name="role" />
              </div>
              
               
              </div>
              <a href="login.jsp"><button type="submit" class="btn btn-primary btn-lg mb-1">Register</button></a>

            </form>

          </div>
        </div>
      </div>
    </div>
  </div>

</body>
</html>