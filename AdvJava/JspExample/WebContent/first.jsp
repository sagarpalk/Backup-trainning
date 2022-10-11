<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
    <jsp:include page="Hello.jsp"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int counter=0; %>
<%!int add(int n1,int n2){
	return n1+n2;
	}
%>



<%=new Date() %>
<%="HEllo From jsp" %>
<%=counter++ %>
<%
int a=10;
int b=20;
out.println((a+b));
out.print(add(5,3));
%>
</body>
</html>