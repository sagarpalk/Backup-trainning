
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@page import="java.sql.*,io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<%
        String  username=request.getParameter("username");
        String password=request.getParameter("password");
         session.setAttribute("username", username);

           Connection con=null;
           String s,s1;
           int x=0;

           try
           {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               con=DriverManager.getConnection("jdbc:odbc:login");
               out.print("conection is open");

               Statement st=con.createStatement();
               String query="select * from Login";
               ResultSet rs=st.executeQuery(query);
               while(rs.next())
                {
                    s=rs.getString(1);
                    s1=rs.getString(2);
                     if(username.equals(s) && password.equals(s1))
                     {
                  
                                x=1;
                                break;
                     }
                    else
                     {
                              response.sendRedirect("jetlogin11.jsp");

                     }

              }
               if(x==1)
               {
							response.sendRedirect("jetadmin.jsp");
                   
               }

           
              

            }
             catch(Exception e)
             {

               out.print(e);
             }
         %>
    
</body>
</html>
