<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<script language="javascript">

function tot()
{
	var a=document.f1.Amt.value;
	var b=document.f1.Person.value;
	var c=a*b;
	document.f1.TotalRs.value=c;
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<form name="f1" action="gouserbookconform.jsp" method="get">
<%! int i=0; %>
<%

	


		Connection con=null;
		
		int id=Integer.parseInt(request.getParameter("id"));
		out.print(id);
        

           try
           {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");

               Statement st=con.createStatement();
               String query="select * from GoFlight where id="+id+"";
               ResultSet rs=st.executeQuery(query);
			   %>
			   <table border="1" align="center" bgcolor="#666666">
			   <tr>
					 
					 <th>From
					 <th>TO
					 <th>Go Date
					 <th>Return Date
					 <th>Depart Time
					 <th>Arrival Time
					 <th>Flight No
					 <th>Amount
				</tr>
			   <%
			   
			   while(rs.next())
			   {
			   		    
					    out.print("<tr>");
						out.print("<td>");					
						%>
						<input type="text" value="<%=rs.getString(1)%>"  name="From1" size="5"/>
						
						<td>
						<input type="text" value="<%=rs.getString(2)%>" name="To1"  size="5"/>
						
						<td>
						<input type="text" value="<%=rs.getString(3)%>" name="DepartureDt"  size="5"/>
						
						<td>
						<input type="text" value="<%=rs.getString(4)%>" name="ReturnDt" size="5"/>
						
						<td>
						<input type="text" value="<%=rs.getString(5)%>" size="5"/>
						
						<td>
						<input type="text" value="<%=rs.getString(6)%>"  size="5"/>
						
						<td>
						<input type="text" value="<%=rs.getString(7)%>" name="FlightNo"  size="5"/>
						
						<td>
						<input type="text" value="<%=rs.getString(8)%>"   size="5" name="Amt"/>
						
						<td>
						
				    <%
					    
			   	
			   }
              out.print("</table>");
			  
			  %>
			  		<b><center>Plz Fill Below Information</center></b>
					<table align="center" bgcolor="#CCCCCC" border="1">
					<tr>
					<td>FullName
					<td><input type="text" name="FullName">
					</tr>
					
					<tr>
					<td>Address
					<td><input type="text" name="Address">
					</tr>
					
					<tr>
					<td>City
					<td><input type="text" name="City">
					</tr>
					
					<tr>
					<td>Phone NO
					<td><input type="text" name="PhoneNo">
					</tr>
					
					<tr>
					<td>Mobile NO
					<td><input type="text" name="MobileNo">
					</tr>
					
					<tr>
					<td>Total Person
					<td><select name="Person" size="1" onchange="return tot();">
  							<option value="1">1</option>
  							<option value="2">2</option>
  							<option value="3">3</option>
  							<option value="4">4</option>
  							<option value="5">5</option>
  							<option value="6">6</option>

						</select>
					</tr>
				
					<tr>
					<td>Totoal Amout
					<td><input type="text" name="TotalRs">
					</tr>
					</table>
			  
				<b><center>Payment Information </center></c>
				<table  align="center" border="2" bgcolor="#666666">
				<tr>
				<th align="center" bgcolor="#FFFFFF"> Card Holder Information
				</tr>
				
				<tr>
				<td>First Name<td><input type="text" name="fn">
				<td>Last Name <td><input type="text" name="ln">
				</tr>
				
				<tr>
				<td>Full Addres<td><input type="text" name="ad">
				<td>City<td><input type="text" name="city">
				</tr>
				
				<tr>
				<td>PinCode<td><input type="text" name="pin">
				<td>Country<td><select name="con">
				  				<option value="india">India</option>
				  				<option value="USA">USA</option>
					  			<option value="UK">UK</option>
								
								</select>
				</tr>
				
				<tr>
				<td align="center" bgcolor="#FFFFFF">Cord Information
				</tr>
				
				<tr>
				<td>Cord Number<td><input type="text" name="cn">
				<td>Expiration Date<td><input type="text" name="ed">
				</tr>
				
				<tr>
				<td>Cord Type<td><select name="ct">
				  				<option value="Visa">Visa</option>
				  				<option value="MasterCord">Mastercord</option>
								
								</select>
				<td>CCV NUmber<td><input type="text" name="ccv">
				
				</tr>
				
				</table>
				<table border="3" align="center" bgcolor="#000000">
				<tr>
				<td><input type="submit" value="Submit Information" border="2">
				</tr>
				</table>
			<%	
			}
			catch(Exception e)
			{
				out.print(e);
			}
%>
</form>
</body>
</html>
