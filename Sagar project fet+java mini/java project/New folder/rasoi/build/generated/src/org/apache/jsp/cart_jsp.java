package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import pkg.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Manal:Rasoi</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String custid=null;
        if(session.getAttribute("custid")!=null)
        custid=session.getAttribute("custid").toString();
        else
        {custid="cust"+(int)(Math.random()*10000);
        session.setAttribute("custid",custid);
        }
        String fid=request.getParameter("fid");
        int qty=Integer.parseInt(request.getParameter("qty"));

          MyCon x=new MyCon();
        Connection c=x.tcon();
    Connection c1=x.tcon();
        PreparedStatement pst=c.prepareStatement("insert into orders(custid,fid,doo,qty) values(?,?,sysdate(),?)");
        pst.setString(1,custid);
        pst.setString(2, fid);
        pst.setInt(3,qty);
        int r=pst.executeUpdate();
        if(r>0)
        {
            PreparedStatement pst1=c1.prepareStatement("select * from food,orders where food.fid=orders.fid and custid=?"); 
pst1.setString(1,custid);
        
        
        
      out.write("\n");
      out.write("    <tr\n");
      out.write("        <td>");
      out.print(custid);
      out.write("   </td>\n");
      out.write("        <td>");
      out.print(fid);
      out.write("</td>\n");
      out.write("        <td><a href=\"csfood.jsp\">Continue</a><BR>\n");
      out.write("            <a href=\"cehckout.jsp\">Checkout</a>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("        \n");
      out.write("       ");
 }
     else
        out.println("sdfsd");
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
