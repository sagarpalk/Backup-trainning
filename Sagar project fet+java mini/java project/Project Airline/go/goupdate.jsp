<%-- 
    Document   : decupdate
    Created on : Oct 1, 2010, 11:13:53 AM
    Author     : nit
--%>


<%@page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
	<META http-equiv="Page-Enter" CONTENT="RevealTrans(Duration=1,Transition=22)">
<script language="Javascript">

function insert1()
{
	alert("record...");
	f1.action="goticketupdate1.jsp";
	f1.method="GET";
	f1.submit();
}

function cancel1()
{
	f1.action="decupdate.jsp";
	f1.method="get"
	f1.submit();
	
}
</script>
        
        <title>JSP Page</title>
    </head>
    <body>
     <form name="f1">
        <%
			
			
        	Connection con=null;



               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");

               Statement st=con.createStatement();
			   int i=(Integer.parseInt(request.getParameter("id")));

        	    out.print(i);

               String s=("select * from GoBook where PhoneNo="+i+"");

               ResultSet rs=st.executeQuery(s);


            out.print("<table border=1 cellpadding=5 cellspacing=5 align=center>");
            
          while(rs.next())
          {

            %>
                <tr>
                <td>
                Full Name:<td><input type="text" name="FullName" value=<%=rs.getString(2)%>>
                </tr>
				<tr>
				<td>
                Address :<td><input type="text" name="Address" value=<%=rs.getString(3)%>>
                </tr>
				<tr>
                <td>
                City:<td><input type="text" name="City" value=<%=rs.getString(4)%>>
                </tr>
				
				<tr>
                <td>
                Phone NO:<td><input type="text" name="PhoneNo" value=<%=rs.getString(5)%>>
                </tr>
				
				<tr>
                <td>
                Mobile NO:<td><input type="text" name="MobileNo" value=<%=rs.getString(6)%>>
                </tr>
				
				<tr>
                <td>
                 From:<td><input type="text" name="From1" value=<%=rs.getString(7)%>>
                </tr>
				
				<tr>
                <td>
                 To:<td><input type="text" name="To1" value=<%=rs.getString(8)%>>
                </tr>
				
				<tr>
                <td>
                Departure Date:<td><input type="text" name="DepartureDt" value=<%=rs.getString(9)%>>
                </tr>
				
				<tr>
                <td>
                Return Date:<td><input type="text" name="ReturnDt" value=<%=rs.getString(10)%>>
                </tr>
				
				<tr>
                <td>
                Person:<td><input type="text" name="Person" value=<%=rs.getString(11)%>>
                </tr>
				
				<tr>
                <td>
                Total:<td><input type="text" name="TotalRs" value=<%=rs.getString(12)%>>
                </tr>
				
				
              











                 <%	}

            out.print("</table>");
			%>
			<table align="center">
			<tr>
			<td><input type="submit" value="submit"  onClick="insert1()">
			
			</tr>
			</table>
			</form>
    </body>
</html>
