<%-- 
    Document   : alogout
    Created on : Feb 7, 2018, 3:19:02 AM
    Author     : admin pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="ahead.jsp" %>
        <%
           session.invalidate();
           response.sendRedirect("login.jsp");
        
        %>
    </body>
</html>
