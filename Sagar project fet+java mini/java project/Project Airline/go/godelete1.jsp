<%@ page  language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>

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
        
       
       
             Connection con1=null;

           try
           {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con1=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");
			   int phoneno=(Integer.parseInt(request.getParameter("id")));
               Statement st=con1.createStatement();
               String query= "delete from GoBook where PhoneNo="+phoneno+"";
               st.executeUpdate(query);
			   
			  

               
             }
             catch(Exception e)
             {

               out.print(e);
             }
			 
			
         %>
		 
	
		<%@include file="godelete.jsp" %> 

    </body>
</html>

</body>
</html>
