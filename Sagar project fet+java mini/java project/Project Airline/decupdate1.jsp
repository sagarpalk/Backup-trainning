
<%@page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>

        <META http-equiv="Page-Enter" CONTENT="RevealTrans(Duration=1,Transition=22)">
        <title>JSP Page</title>
	
    </head>
    <body>

        <%
        String fullname=request.getParameter("FullName");
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
       
       
             Connection con1=null;

           try
           {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con1=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");

               Statement st=con1.createStatement();
               String query= "update DeccanBook  set  FullName='"+fullname+"', Address='"+address+"', City='"+city+"', MobileNo='"+mobileno+"', From1='"+from1+"',To1='"+to1+"' , DepartureDt='"+departuredt+"', ReturnDt='"+returndt+"', Person='"+person+"', TotalRs='"+totalrs+"' where PhoneNo="+phoneno+"";
               st.executeUpdate(query);
			   
			  

               
             }
             catch(Exception e)
             {

               out.print(e);
             }
			 
			
         %>
		 
	
		<%@include file="decmodify.jsp" %> 

    </body>
</html>
