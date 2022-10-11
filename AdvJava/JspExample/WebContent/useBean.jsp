<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.cybage.bean.User" ></jsp:useBean>
<%-- <jsp:setProperty property="*"   name="user" /> --%>

<jsp:setProperty property="name" param="name1" name="user"/>
<jsp:setProperty property="address" param="address1" name="user"/>
<jsp:setProperty property="email" param="email1" name="user"/>

<jsp:getProperty property="name" name="user"/>
<jsp:getProperty property="address" name="user"/>
<jsp:getProperty property="email" name="user"/>
</body>
</html>