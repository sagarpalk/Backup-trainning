<%-- 
    Document   : login
    Created on : Feb 2, 2018, 2:52:09 AM
    Author     : admin pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rasoi</title>
        <style>
            .p1{
                width:450px;
                margin:auto;
                margin-top:100px;
                background:purple;
                opacity:.8;
                padding:10px;
                text-align:center;
                font-size:24px;
                color:white;
            }
            .t1{
                width:350px;
                font-size:18px;
                padding:5px;
                border-radius:5px;
                margin-left:20px;
                margin-bottom:5px;
            }
            .t2{ width:365px;
                font-size:18px;
                padding:5px;
                border-radius:5px;
                margin-left:20px;
                margin-bottom:5px;
            }
            </style>
    </head>
    <body>
      
        <form action="ucheck.jsp" class="p1">
           Firm Registration Form
            <input type="text" name="un" placeholder="Enter Userid "  class="t1"/>
            <input type="password" name="ps" placeholder="Enter Passowrd "  class="t1"/>
            <input type="submit"  class="t2" value="SignIn"/>
              <%
            if(request.getParameter("msg")!=null)
            out.println(request.getParameter("msg"));
        
        %>
        <BR>
        <a href="index.jsp" style="color:white;text-decoration:none;">Home</a>
        </form>
    </body>
</html>
