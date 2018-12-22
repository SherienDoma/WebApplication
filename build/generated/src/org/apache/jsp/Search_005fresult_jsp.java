package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Search_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            h1 {\n");
      out.write("                color: blue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h3\n");
      out.write("            {\n");
      out.write("                color : pink;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #panel, #flip {\n");
      out.write("                padding: 5px;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #e5eecc;\n");
      out.write("                border: solid 1px #c3c3c3;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#flip\").click(function () {\n");
      out.write("                    $(\"#panel\").slideDown(\"slow\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Your Search results</h1>\n");
      out.write("\n");
      out.write("        <h3>Description:</h3>\n");
      out.write("        ");
      out.print( request.getAttribute("desc"));
      out.write("\n");
      out.write("\n");
      out.write("        <h3>Size:</h3>\n");
      out.write("        ");
      out.print( request.getAttribute("size"));
      out.write("\n");
      out.write("\n");
      out.write("        <h3>Floor:</h3>\n");
      out.write("        ");
      out.print( request.getAttribute("floor"));
      out.write("\n");
      out.write("\n");
      out.write("        <h3>Status:</h3>\n");
      out.write("        ");
      out.print( request.getAttribute("stat"));
      out.write("\n");
      out.write("\n");
      out.write("        <h3>Type:</h3>\n");
      out.write("        ");
      out.print( request.getAttribute("type"));
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <br><br><a href=\"");
      out.print( request.getAttribute("loc"));
      out.write("\">Location</a>\n");
      out.write("\n");
      out.write("        <h3>Options:</h3>\n");
      out.write("        ");
      out.print( request.getAttribute("rrs"));
      out.write("\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <br><br>\n");
      out.write("        <a id=\"flip\" href=\"Contact_information\">Request Contact Information for this advertisment</a>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("            \n");
      out.write("            ");
 
//                 int userid = (int) request.getAttribute("userid");
//                 out.println(userid);
//               HttpSession Result_Session = request.getSession();
//                Result_Session.setAttribute("uid",userid);
            
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("       \n");
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
