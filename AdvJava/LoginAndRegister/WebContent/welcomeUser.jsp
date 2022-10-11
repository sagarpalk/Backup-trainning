<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
request.getSession(false);
if (session == null) { %>
  <a href="http://localhost:7070/login/home.jsp"> Home</a>
  <a href="http://localhost:7070/login.jsp"> Login</a>
  <% 
} else {
    // Already created.
    %>
  <a href="http://localhost7070/login/logout.jsp"> Logout</a><% 
}

String name = request.getParameter("name");
%>
<br><br>

<%

out.println("Welcome: "+name);
%>



</body>
</html>