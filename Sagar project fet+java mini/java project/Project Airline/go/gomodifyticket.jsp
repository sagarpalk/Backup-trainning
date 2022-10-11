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



             	Connection con=null;

           try
           {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");

               Statement st=con.createStatement();
               String s="select *from GoBook";

               ResultSet rs=st.executeQuery(s);

				


            out.print("<table border=1 cellpadding=5 cellspacing=5>");
            out.print("<th> FullName");
            out.print("<th> Address");
            out.print("<th> City");
            out.print("<th> MobileNo");
            out.print("<th> From");
            out.print("<th> To");
            out.print("<th> Departure Date");
            out.print("<th> Return Date");
            out.print("<th> Person");
            out.print("<th> Total ");

            out.print("<th> Edit");

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

                out.print("<td>");
                %>
                 
                 <a href=goticketupdate.jsp?id=<%=rs.getString(5)%>>Edit</a>
                 <%



                 out.print("</tr>");

            }
            out.print("</table>");
		
			

          }
           catch(Exception e)
           {
                out.print(e);

           }




      %>

      
	  </body>
	  </html>
