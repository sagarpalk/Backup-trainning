<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Wel come to Airline Reservation...</title>
</head>

<body>
<table width="885" border="0" cellpadding="0" cellspacing="0" align="center"  bgcolor="#33CCFF">
  <!--DWLayoutTable-->
  <tr>
    <td width="6" height="172"></td>
    <td colspan="4" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
      <!--DWLayoutTable-->
      <tr>
        <td width="869" height="172">&nbsp; <%@include file="deccanlogo.jsp" %></td>
        </tr>
    </table></td>
    <td width="10"></td>
  </tr>
  <tr>
    <td height="15"></td>
    <td width="168" rowspan="5" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" >
      <!--DWLayoutTable-->
      <tr>
        <td width="168" height="255">&nbsp; <%@include file="deccanleftmenu.jsp" %></td>
        </tr>
      

      
      
      
      
      
      
    </table></td>
    <td width="23"></td>
    <td width="8"></td>
    <td width="670"></td>
    <td></td>
  </tr>
  
  
  
  
  
  
  <tr>
    <td height="45"></td>
    <td></td>
    <td colspan="2" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" >
      <!--DWLayoutTable-->
      <tr>
        <td width="676" height="45">&nbsp;<%@include file="deccantoplogo.jsp" %></td>
      </tr>
    </table></td>
    <td></td>
  </tr>
  
  
  
  <tr>
    <td height="14"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="162"></td>
    <td></td>
    <td></td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="yellow">
      <!--DWLayoutTable-->
      <tr>
        <td width="670" height="162"><%@include file="deccanflash.jsp" %>		</td>
      </tr>
    </table></td>
    <td></td>
  </tr>
  <tr>
    <td height="19"></td>
    <td></td>
    <td></td>
    <td>&nbsp;</td>
    <td></td>
  </tr>
  
  <tr>
    <td height="17"></td>
    <td></td>
    <td></td>
    <td colspan="2" rowspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="blue">
      <!--DWLayoutTable-->
      <tr>
        <td width="4"></td>
          <td width="674" height="400" valign="top"> welcome to....<%session.removeValue("login");%>&nbsp;</p>
            <center>
			    <h3> <font face=Arial, Arial, Helvetica color=#FFFFFF> <font 	face=Book Antiqua size=5> <b> Login</b></font></font></h3><font face=Arial, Arial, Helvetica></font>
	<table border=2 bordercolorlight=#999999 bordercolordark=#000000>
  <form name="f1" method="get" action="gologin111.jsp">
	<tr><td><font face=Arial, Arial, Helvetica><font face=Book Antiqua><b>Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp:</b></font></font></td><td><font face=Arial, Arial, Helvetica><span style=background-color: #0000FF><b>
	<input name="username" type="text"></b></span></font></tr>
	<tr><td><font face=Arial, Arial, Helvetica><font face=Book Antiqua><b>
	Password&nbsp; :</b></font></font></td><td><font face=Arial, Arial, Helvetica><b>
	<input name="password" type="password"></b></font></tr>
	<tr><td><font face=Arial, Arial, Helvetica><font face=Book Antiqua><b>
	<input type="Submit" value="Sign In">
	</b></font></font></tr>
</form>
</table>
            </center>
<p>&nbsp; &nbsp; &nbsp;</p>
          <p>&nbsp;</p></td>
        </tr>
      
    </table></td>
    <td></td>
  </tr>
  <tr>
    <td height="203"></td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="168" height="203"><%@include file="deccannews.jsp" %></td>
      </tr>
    </table>
    </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="180"></td>
    <td>&nbsp;</td>
    <td></td>
    <td></td>
  </tr>
  
  <tr>
    <td height="23"></td>
    <td></td>
    <td></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td></td>
  </tr>
</table>
</body>
</html>
