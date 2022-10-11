<%@ page  language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<%
        String flightno=request.getParameter("FlightNo");
		String  fullname=request.getParameter("FullName");
        String address=request.getParameter("Address");
        String city=request.getParameter("City");
		String phoneno=request.getParameter("PhoneNo");
		String mobileno=request.getParameter("MobileNo");
		
        String from1=request.getParameter("From1");
        String to1=request.getParameter("To1");
        String departuredt=request.getParameter("DepartureDt");
        String returndt=request.getParameter("ReturnDt");
        String amt=request.getParameter("Amt");
        String person=request.getParameter("Person");
        String totalrs=request.getParameter("TotalRs");
       
             Connection con=null;

           try
           {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");

               Statement st=con.createStatement();
               String query="insert into JetBook(No,FullName,Address,City,PhoneNo,MobileNo,From1,To1,DepartureDt,ReturnDt,Person,TotalRs,Received) values('"+flightno+"','"+fullname+"','"+address+"','"+city+"','"+phoneno+"','"+mobileno+"','"+from1+"','"+to1+"','"+departuredt+"','"+returndt+"','"+person+"','"+amt+"','"+totalrs+"')";
               st.executeUpdate(query);

               out.print("data update");
			   
			   %>
			   		<h3><center>your Ticket Information</center></h3>
			         <table align="center" border="1" bgcolor="#CCCCCC" height="300" width="300">
					<%
					out.print("<tr>");
					out.print("<td>");
					out.print("FlightNo");
					out.print("<td>");
					out.print(flightno);
					out.print("</tr>");
					
					out.print("<tr>");
					out.print("<td>");
					out.print("FullName");
					out.print("<td>");
					out.print(fullname);
					out.print("</tr>");
					
					out.print("<tr>");
					out.print("<td>");
					out.print("Address");
					out.print("<td>");
					out.print(address);
					out.print("</tr>");
					
					out.print("<tr>");
					out.print("<td>");
					out.print("City");
					out.print("<td>");
					out.print(city);
					out.print("</tr>");
					
					out.print("<tr>");
					out.print("<td>");
					out.print("Form");
					out.print("<td>");
					out.print(from1);
					out.print("</tr>");
					
					out.print("<tr>");
					out.print("<td>");
					out.print("To");
					out.print("<td>");
					out.print(to1);
					out.print("</tr>");
					
					out.print("<tr>");
					out.print("<td>");
					out.print("Departure Date");
					out.print("<td>");
					out.print(departuredt);
					out.print("</tr>");
					
					out.print("<tr>");
					out.print("<td>");
					out.print("Return Date");
					out.print("<td>");
					out.print(returndt);
					out.print("</tr>");
					
					out.print("<tr>");
					out.print("<td>");
					out.print("Amount per");
					out.print("<td>");
					out.print(amt);
					out.print("</tr>");
					
					out.print("<tr>");
					out.print("<td>");
					out.print("Total Person");
					out.print("<td>");
					out.print(person);
					out.print("</tr>");
					
					out.print("<tr>");
					out.print("<td>");
					out.print("Total Amount");
					out.print("<td>");
					out.print(totalrs);
					out.print("</tr>");


					
					
					out.print("</table>");
					
					%>
						  <h6><center> your Ticket is Comfirm Plz Enjoy With Airline</center></h6>
						  <h4><center> your Ticket Sent sortly.....plz Collect</center></h4>
					
					<%
					
					
			  
             }
             catch(Exception e)
             {

               out.print(e);
             }
         %>

</body>
</html>
