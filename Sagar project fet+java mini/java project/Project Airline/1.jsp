<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script language="javascript" >
function dt()
{
document.wtrite(date());
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<form name="f1" action="deccansearch.jsp" method="get">
Find your Flight....
<table align="center" bgcolor="#999999" border="1">
<tr>
<td>Source:<td><select name="source" size="1">
  <option value="Rajkot">Rajkot</option>
  <option value="Delhi">Delhi</option>
  <option value="Mumbai">Mumbai</option>
  <option value="Ahemdabad">Ahemdabad</option>
  <option value="Jamnager">Jamnagar</option>
  <option value="Jaipur">Jaipur</option>
		
			</select>
			
<td>Destination<td><select name="destination" size="1">
  <option value="Rajkot">Rajkot</option>
  <option value="Ahemdabad">Ahemdabad</option>
  <option value="Delhi">Delhi</option>
  <option value="Jamnager">Jamnager</option>
  <option value="Mumbai">Mumbai</option>
  <option value="Jaipur">Jaipur</option>

				</select>
				
</tr>
<tr>
		<td>Go Date<td><input type="text" name="god">
		<td>Return Date<td><input type="text" name="red>
		
</tr>
</table>

<table border="2" bgcolor="#333333" align="center">
<tr>
<td><input type="submit" value="Search">
</tr>
</table>
</form>					 
								
				

</body>
</html>
