<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Function Tag</title>
</head>
<body>
<c:set var="web" value="Welcome in the world of web application development"/>

Length of String :: ${fn:length(web)} <br>
Substring of String :: ${fn:substring(web,0,8)} <br>
Is it contains word "application" :: ${fn:contains(web,'application')}<br>
In UpperCase :: ${fn:toUpperCase(web)}
</body>
</html>
 