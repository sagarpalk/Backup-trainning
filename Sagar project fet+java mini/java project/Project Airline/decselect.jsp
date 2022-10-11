<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<%
  Connection con=null;
           String s,s1;
           int x=0;

           try
           {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");

               Statement st=con.createStatement();
               String query="select * from DeccanBook";
               ResultSet rs=st.executeQuery(query)
			
			
			
	out.print("<table border=1 cellpadding=5 cellspacing=5>");
	out.print("<th> FullName");; 	
	out.print("<th> Address");
	out.print("<th> City");
	out.print("<th> PhoneNo");
	out.print("<th> MobileNo");	
	out.print("<th> From");	
	out.print("<th> To");	
	out.print("<th> Departure Date");
	out.print("<th> Return Date");	
	out.print("<th> Person");
	out.print("<th> Total Rs");
	out.print("<th> Received");
	out.print<th> Update");
	while(rs.next())
	{
		out.print("<tr>");
		out.print(rs.getString(2));
		out.print(rs.getString(3));
		out.print(rs.getString(4));
		out.print(rs.getString(5));
		out.print(rs.getString(6));
		out.print(rs.getString(7));
		out.print(rs.getString(8));
		out.print(rs.getString(9));
		out.print(rs.getString(10));
		out.print(rs.getString(11));
		out.print(rs.getString(12));
		echo "<td>".$row['Received'];
		out.print(rs.getString());
		
		out.print("<td><a href=deccview.php?FullName=rs.getString(2)>Update</a></td>");
		out.print("</tr>");
	}
}
catch(Exception e)
			{
				out.print(e);
			}
 %>  
</body>
</html>
