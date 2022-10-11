<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String  fullname=request.getParameter("FullName");
        String address=request.getParameter("Address");
        String city=request.getParameter("City");
        String phoneno=request.getParameter("PhoneNo");
        String mobileno=request.getParameter("MobileNo");
        String from1=request.getParameter("From1");
        String to1=request.getParameter("To1");
        String departuredt=request.getParameter("DepartureDt");
        String returndt=request.getParameter("ReturnDt");
        String person=request.getParameter("Person");
        String totalrs=request.getParameter("TotalRs");
        String received=request.getParameter("Received");
       
             Connection con=null;

           try
           {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");

               Statement st=con.createStatement();
               String query="insert into JetBook(FullName,Address,City,PhoneNO,MobileNo,From1,To1,DepartureDt,ReturnDt,Person,TotalRs,Received) values('"+fullname+"','"+address+"','"+city+"','"+phoneno+"','"+mobileno+"','"+from1+"','"+to1+"','"+departuredt+"','"+returndt+"','"+person+"','"+totalrs+"','"+received+"')";
               st.executeUpdate(query);

               out.print("data update");
             }
             catch(Exception e)
             {

               out.print(e);
             }
         %>

    </body>
</html>
