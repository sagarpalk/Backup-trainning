<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>

<form name="f1" action="gouserbook.jsp" method="get">
<%
        String source=request.getParameter("source");
        String destination=request.getParameter("destination");
		String godate=request.getParameter("god");
		String returndate=request.getParameter("red");
        //out.print(source);
		//out.print(destination); 
		//out.print(godate);

           
           String s,d,gd,rd;
           int x=0;

           try
           {
		       Connection con=null;
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");

               Statement st=con.createStatement();
               String query="select *from GoFlight";
               ResultSet rs=st.executeQuery(query);
			   	%>
					 <table border="1" align="center">
					 <tr>
					 <th>Select
					 <th>Source
					 <th>Destination
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
                    s=rs.getString(1);
                    d=rs.getString(2);
					gd=rs.getString(3);
                    rd=rs.getString(4);
					
                     if(source.equals(s) && destination.equals(d))
                     {	
                  	
                		out.print("<tr>");
						out.print("<td>");
						%>
						<a href=gouserbook.jsp?id=<%=rs.getString(9)%>>Select</a>
					
						<%						
						out.print("<td>");
						out.print(s);
						out.print("<td>");
						out.print(d);
						out.print("<td>");
						out.print(gd);
						out.print("<td>");
						out.print(rd);
						out.print("<td>");
						out.print(rs.getString(5));
						out.print("<td>");
						out.print(rs.getString(6));
						out.print("<td>");
						out.print(rs.getString(7));
						out.print("<td>");
						out.print(rs.getString(8));
						out.print("</tr>");
					
		
						

            
						
				
                     }
					
                    

          
				}out.print("</table>");
				%>
					<table align="center" border="1">
					<tr>
					<td>
					<input type="submit" value="submit">
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
