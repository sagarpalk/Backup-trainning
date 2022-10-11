
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   
    <body>
      <h1>&lt;c:forEach&gt; Demo</h1>
      <form name="forEachForm" action="${pageContext.request.contextPath}/language.jsp" method="POST">
    Select your programming companions: <br/>
     C <input type="checkbox" name="langChoice" value="C"/><br/>
             C++<input type="checkbox" name="langChoice" value="C++"/><br/>
             Java<input type="checkbox" name="langChoice" value="Java"/><br/>
             C#<input type="checkbox" name="langChoice" value="C#"/><br/>
             PHP<input type="checkbox" name="langChoice" value="PHP"/><br/>
             Ruby<input type="checkbox" name="langChoice" value="Ruby"/><br/>
             jQuery<input type="checkbox" name="langChoice" value="jQuery"/><br/>
          <input type="submit" value="Submit"/>
   </form>
  <br/>
  <br/>
   You selected:
   <c:forEach var="lang" items="${paramValues.langChoice}">
	
   <font color="#00CC00"><c:out value="${lang}"/>,</font>
   </c:forEach>
   </body>
   </html>
