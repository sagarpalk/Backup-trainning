<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script language=Javascript>
function a1()
{
	f1.action="AddTicket.jsp";
	f1.method="GET";
	f1.submit();
}

function b1()
{
	f1.action="decbooking.jsp";
	f1.method="get"
	f1.submit();
	
}
function v1()
{
  f1.action="Ticketview1.jsp"
  f1.method="get"
  f1.submit();
}

function tot()
{
	var a=document.f1.Person.value;
	var b=document.f1.TotalRs.value;
	var c=a*b;
	document.f1.Received.value=c;
}

function date()
{
var d=new Date();
var da=d.getDate();
var m=d.getMonth();
var y=d.getYear();
var x=da +'/'+ m +'/'+ y;
document.f1.BillDate.value=x;
}
</script>
<title>Untitled Document</title>
</head>

<body>
<p>&nbsp;</p>
<form name="f1">

  				
  				<table align="center" border="1">
<tr>
<td>Ticket No:
<td><input type=text name=TicketNo size=18 >
</tr>

<tr>
<td>Date:
<td><input type=text name=BillDate size=18 onfocus="return date();">
</tr>

<tr>
<td>Full Name:
<td><input type=text name=FullName size=40 >
</tr>

<tr>
<td> Address:
<td><input type=text name=Address size=40 width=30 >
</tr>

<tr>
<td>City:
<td><input type=text name=City size=18 >
</tr>

<tr>
<td>Phone No:
<td><input type=text name=PhoneNo size=18 >
</tr>

<tr>
<td>Mobile No:
<td><input type=text name=MobileNo size=18 >
</tr>

<tr>
<td> Air Deccan:
<td><input type=text name=AirlinesName size=18 value='Air Deccan'>
</tr>

<tr>
<td> Form:
<td><input type=text name=From1 size=18 >
</tr>

<tr>
<td>To:
<td><input type=text name=To1 size=18 >
</tr>

<tr>
<td>Departure Date
<td><input type=text name=DepartureDt size=18 >
</tr>

<tr>
<td>Return Date:
<td><input type=text name=ReturnDt size=18>
</tr>

<tr>
<td>Person:
<td><input type=text name="Person" size=18 >
</tr>     

<tr>
<td>Amount:
<td><input type=text name="TotalRs" size=18 >
</tr>

<tr>
<td>Tatal:
<td><input type=text name="Received" size=18  onfocus="return tot();"/>
</tr>
</table>

<table align="center" border="2">
<tr>
<td><input type="submit" value="Save" onClick="a1()">

<td> <input type="submit" value="View Ticket" onclick="v1()" />
 
<td> <input  type="submit" value="Back" onclick="b1()">
  
</tr>
</table>
</form>
</body>
</html>
