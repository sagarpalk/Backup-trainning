<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>
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
	
   %>
	<%!	int vat=0,dis=0,netamt=0; %>
	
    <%  
	   int total=Integer.parseInt(request.getParameter("TotalRs"));
	        vat=(total*3)/100;
		dis=(total*1)/100;
		netamt=((total + vat) - dis);       
   %>
<table bgcolor="#FFFFFF" border="2" align="center" width="400" height="=400">
 information of customer Ticket
<tr> <td>Full Name</td>
     <td><%=fullname%><td>
</tr>

<tr> <td>Address</td>
     <td><%=address%><td>
</tr>

<tr> <td>City</td>
     <td><%=city%><td>
</tr>

<tr> <td>Phone no</td>
     <td><%=phoneno%><td>
</tr>

<tr> <td>Mobile no</td>
     <td><%=mobileno%><td>
</tr>

<tr> <td>From</td>
     <td><%=from1%><td>
</tr>

<tr> <td>To</td>
     <td><%=to1%><td>
</tr>

<tr> <td>Departure Date</td>
     <td><%=departuredt%><td>
</tr>

<tr> <td>return Date</td>
     <td><%=returndt%><td>
</tr>

<tr> <td>Total person</td>
     <td><%=person%><td>
</tr>

<tr> <td>Amout per Person</td>
     <td><%=totalrs%><td>
</tr>


<tr> <td> Total Amout </td>
     <td><%=received%><td>
</tr>

<tr> <td> Vat </td>
     <td><%=vat%><td>
</tr>

<tr> <td> Discount </td>
     <td><%=dis%><td>
</tr>

<tr> <td> Net Amount  </td>
     <td><%=netamt%><td>
</tr>





</table>

<a href="gobooking.jsp">Back</a>
<body>
</body>
</html>
