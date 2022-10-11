<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>&lt;sql:dateParam&gt; Demo</title>
    <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
  </head>
  <body>
  <header>
		<nav class="navbar navbar-dark bg-info navbar-fixed-top">
			<div>
				<h4>GoAir Flight Booking App</h4>
			</div>
			<ul class="navbar-nav">
			
			</ul>
			<ul class="navbar-nav">
				
			</ul>
			<ul class="navbar-nav ">
				<li><a href="<%=request.getContextPath()%>/logout"
					class="btn btn-danger btn-sm">Logout</a></li>
			</ul>
		</nav>
	</header>
  

     
    <sql:setDataSource var="myDS" driver="com.mysql.jdbc.Driver"
  url="jdbc:mysql://localhost:3306/airlinebooking" user="root" password="root" />
         
    <c:choose>
 <%--   <c:when test="${not empty param.flight_No  && not empty param.flight_total_no_seats && not empty param.flight_avaliable_seats && not empty param.flight_price  && not empty param.flight_name && not empty param.flight_source && not empty param.flight_destination && not empty param.flight_type && not empty param.flight_time && not empty param.flight_date}">       
  --%>       
        
        <c:when test="${not empty param.flight_No }">       
    
        <sql:update dataSource="${myDS}" var="pro">
            INSERT INTO flight VALUES  (?, ?, ?)           
            <sql:param value="${param.flight_No}" />
           <%--  <sql:param value="${param.name}" />
            <sql:param value="${param.price}"/> --%>   
                    
        </sql:update>
    </c:when>
    <c:otherwise>
        <font color="#cc0000">Please enter mandatory information.</font>
    </c:otherwise>
    </c:choose>
      --%>
    <br/><br/>
    <sql:query dataSource="${myDS}" var="pro">
        SELECT * from flight;
    </sql:query>
    <table class="table table-dark">
    <tr>
    <th>Flight_No</th>
    <th>Flight_name</th>
    <th>Flight_price</th>
  
    </tr>
        <c:forEach var="row" items="${pro.rows}">
            <tr>               
                <td><c:out value="${row.flight_No}" /></td>
                <td><c:out value="${row.flight_name}" /></td>
                <td><c:out value="${row.flight_price}" /></td>  
               <td>
                <%--  <a href="TicketBookingController?flight_No=${row.flight_No}">Book Flight</a><br> --%>
              <%--<%--  <a href="${pageContext.request.contextPath }/DeleteFlightController?action=EDIT&id=${flight.flight_No}">Delete</a> --%>
             <%--     <a href="${pageContext.request.contextPath }/DeleteFlightController?action=EDIT&id=${flight.flight_No}">Delete</a> --%>
               </td>
             </tr>
        </c:forEach>
        
    </table>
    </body>
</html>