package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/uhead.jsp");
    _jspx_dependants.add("/umenu.jsp");
  }

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
      out.write("        <title>Rasoi</title>\n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"engine1/style.css\" />\n");
      out.write("\t<script type=\"text/javascript\" src=\"engine1/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<style>\n");
      out.write("    .con{\n");
      out.write("        width:100%;\n");
      out.write("        background:url(img/ra1.jpg);\n");
      out.write("        height:100px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .c1{\n");
      out.write("        width:40%;\n");
      out.write("        font-size:72px;\n");
      out.write("        color:white;\n");
      out.write("        float:left;\n");
      out.write("        padding:10px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .c2{\n");
      out.write("        width:55%;\n");
      out.write("        \n");
      out.write("        color:white;\n");
      out.write("        float:right;\n");
      out.write("        text-align:right;\n");
      out.write("        padding:10px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("<div class=\"con\">\n");
      out.write("    \n");
      out.write("    <div class=\"c1\">Rasoi</div>\n");
      out.write("    <div class=\"c2\">");
      out.write("<style>\n");
      out.write("    .p1{\n");
      out.write("        width:90px;\n");
      out.write("      \n");
      out.write("        padding:5px;\n");
      out.write("        text-decoration:none;\n");
      out.write("        font-size:20px;\n");
      out.write("        margin-top:5px;\n");
      out.write("        color:white;\n");
      out.write("       \n");
      out.write("    }\n");
      out.write("    .p1:hover{\n");
      out.write("        width:90px;\n");
      out.write("      text-decoration:underline;\n");
      out.write("        padding:5px;\n");
      out.write("        text-decoration:none;\n");
      out.write("        font-size:20px;\n");
      out.write("        margin-top:5px;\n");
      out.write("        color:orange;\n");
      out.write("       \n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"index.jsp\" class=\"p1\">home</a>\n");
      out.write("<a href=\"register.jsp\" class=\"p1\">register</a>\n");
      out.write("<a href=\"srest.jsp\" class=\"p1\">Menu</a>\n");
      out.write("<a href=\"ulogin.jsp\" class=\"p1\">login</a>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("       <div id=\"wowslider-container1\">\n");
      out.write("\t<div class=\"ws_images\"><ul>\n");
      out.write("\t\t\n");
      out.write("<li><img src=\"data1/images/3.jpg\" alt=\"Rasoi....ghar ka khana\" title=\"Rasoi....ghar ka khana\" id=\"wows1_0\"/></li>\n");
      out.write("\t\t<li><img src=\"data1/images/4.jpg\" alt=\"4\" title=\"4\" id=\"wows1_1\"/></li>\n");
      out.write("\t\t<li><img src=\"data1/images/5.jpg\" alt=\"5\" title=\"5\" id=\"wows1_2\"/></li>\n");
      out.write("\t\t<li><img src=\"data1/images/6.jpg\" alt=\"6\" title=\"6\" id=\"wows1_3\"/></li>\n");
      out.write("\t\t<li><img src=\"data1/images/7.jpg\" alt=\"7\" title=\"7\" id=\"wows1_4\"/></li>\n");
      out.write("\t\t<li><img src=\"data1/images/8.jpg\" alt=\"8\" title=\"8\" id=\"wows1_5\"/></li>\n");
      out.write("\t\t<li><img src=\"data1/images/9.jpg\" alt=\"slider bootstrap\" title=\"9\" id=\"wows1_6\"/></li>\n");
      out.write("\t\t<li><img src=\"data1/images/fimg.png\" alt=\"fimg\" title=\"fimg\" id=\"wows1_7\"/></li>\n");
      out.write("\t</ul></div>\n");
      out.write("\t<div class=\"ws_bullets\"><div>\n");
      out.write("\t\t<a href=\"#\" title=\"Rasoi....ghar ka khana\"><span>\n");
      out.write("                        \n");
      out.write("                  <img src=\"data1/tooltips/3.jpg\" alt=\"Rasoi....ghar ka khana\"/>1</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"4\"><span><img src=\"data1/tooltips/4.jpg\" alt=\"4\"/>2</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"5\"><span><img src=\"data1/tooltips/5.jpg\" alt=\"5\"/>3</span></a>\n");
      out.write("\t\t\n");
      out.write("<a href=\"#\" title=\"6\"><span><img src=\"data1/tooltips/6.jpg\" alt=\"6\"/>4</span></a>\n");
      out.write("\n");
      out.write("\t\t<a href=\"#\" title=\"7\"><span><img src=\"data1/tooltips/7.jpg\" alt=\"7\"/>5</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"8\"><span><img src=\"data1/tooltips/8.jpg\" alt=\"8\"/>6</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"9\"><span><img src=\"data1/tooltips/9.jpg\" alt=\"9\"/>7</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"fimg\"><span><img src=\"data1/tooltips/fimg.png\" alt=\"fimg\"/>8</span></a>\n");
      out.write("\t</div></div>\n");
      out.write("\t<div class=\"ws_shadow\"></div>\n");
      out.write("\t</div>\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"engine1/wowslider.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"engine1/script.js\"></script>\n");
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
