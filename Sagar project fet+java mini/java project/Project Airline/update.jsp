<%-- 
    Document   : decupdate
    Created on : Oct 1, 2010, 11:13:53 AM
    Author     : nit
--%>

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
        
        Connection con=null;



               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");

               Statement st=con.createStatement();
               String s="select *from DeccanBook where FullName='ffs'";

               ResultSet rs=st.executeQuery(s);


            out.print("<table border=1 cellpadding=5 cellspacing=5>");
            out.print("<th> FullName");
            out.print("<th> Address");
            out.print("<th> City");
            out.print("<th> PhoneNo");
            out.print("<th> MobileNo");
            out.print("<th> From");
            out.print("<th> To");
            out.print("<th> Departure Date");
            out.print("<th> Return Date");
            out.print("<th> Person");
            out.print("<th> Total ");

          while(rs.next())

			{

                out.print("<tr>");
                out.print("<td>");
				out.print(rs.getString(2));
                out.print("<td>");
                out.print(rs.getString(3));
                out.print("<td>");
                out.print(rs.getString(4));
                out.print("<td>");
                out.print(rs.getString(5));
                out.print("<td>");
                out.print(rs.getString(6));
                out.print("<td>");
                out.print(rs.getString(7));
                out.print("<td>");
                out.print(rs.getString(8));
                out.print("<td>");
                out.print(rs.getString(9));
                out.print("<td>");
                out.print(rs.getString(10));
                out.print("<td>");
                out.print(rs.getString(11));
                out.print("<td>");
                out.print(rs.getString(12));






                 out.print("</tr>");
			}

            out.print("</table>");


        %>
    </body>
</html>
