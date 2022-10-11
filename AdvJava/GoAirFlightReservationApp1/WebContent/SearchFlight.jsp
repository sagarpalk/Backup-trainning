<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
    <sql:setDataSource var="myDS" driver="com.mysql.jdbc.Driver"
  url="jdbc:mysql://localhost:3306/airlinebooking" user="root" password="root" />
 <sql:query dataSource="${myDS}" var="pro">
      SELECT * from flight;
        </sql:query>
    
       
<form action="SearchFlightBySourceAndDestinationController" method="post" >
 
 
  <label for="Flights">source:</label>
  <select name="flights_select_name" id="flights_select">
   
  </select>
  
  <label for="Flights">source:</label>
     <select name="flights_select_source" id="flights_select">
    
  <c:forEach var="row" items="${pro.rows}">   
        <option name="option_source" value='<c:out value="${row.flight_source}"/>'><c:out value="${row.flight_source}" /></option>

</c:forEach>
 </select>
  
    <label for="Flights">Destination:</label>
     <select name="flights_select_destination" id="flights_select">
    
  <c:forEach var="row" items="${pro.rows}">   
        <option name="option_destination" value='<c:out value="${row.flight_destination}"/>'><c:out value="${row.flight_destination}" /></option>

</c:forEach>
 </select>
  <br><br>
  <input type="submit" value="Submit">
</form>

</body>
</html>