package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel = \"stylesheet\"\n");
      out.write("              type = \"text/css\"\n");
      out.write("              href = \"myStyle.css\" />\n");
      out.write("       <style>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("                     body {\n");
      out.write("                        background-color: #fff;\n");
      out.write("                        color: #777;\n");
      out.write("                        font: normal 15px \"Helvetica Neue\", Arial, Helvetica, Geneva, sans-serif;\n");
      out.write("                         }\n");
      out.write("                      p {\n");
      out.write("                            line-height: 20px;\n");
      out.write("                             margin-bottom: 20px;\n");
      out.write("                                      }\n");
      out.write("                       h1 {\n");
      out.write("                                      font-family: 'Crete Round', serif;\n");
      out.write("                                     font-weight: bold;\n");
      out.write("                                   color: #444;\n");
      out.write("                                  font-size: 45px;\n");
      out.write("                            margin-bottom: 20px;\n");
      out.write("                          }\n");
      out.write("                          h2 {\n");
      out.write("                                font-size: 24px;\n");
      out.write("                                color: #444;\n");
      out.write("                                font-weight: bold;\n");
      out.write("                                text-transform: uppercase;\n");
      out.write("                                margin-bottom: 20px;\n");
      out.write("                            }\n");
      out.write("                        .bar1 {\n");
      out.write("                               margin: 0 auto;\n");
      out.write("                               padding: 0 10px;\n");
      out.write("                                width: 940px;\n");
      out.write("                                 position: fixed;\n");
      out.write("                              }\n");
      out.write("                              header {\n");
      out.write("                                    height: 120px;\n");
      out.write("                                }\n");
      out.write("                                header h1 {\n");
      out.write("                                    float: left;\n");
      out.write("                                    margin-top: 32px;\n");
      out.write("                                }\n");
      out.write("                                header h1 .color {\n");
      out.write("                                    color: #02b8dd;\n");
      out.write("                                }\n");
      out.write("                                header nav {\n");
      out.write("                                    float: right;\n");
      out.write("                                }\n");
      out.write("                                header nav ul li {\n");
      out.write("                                    float: left;\n");
      out.write("                                    display: inline-block;\n");
      out.write("                                    margin-top: 50px;\n");
      out.write("                                }\n");
      out.write("                                header nav ul li a {\n");
      out.write("                                    color: #444;\n");
      out.write("                                    text-transform: uppercase;\n");
      out.write("                                    font-weight: bold;\n");
      out.write("                                    display: block;\n");
      out.write("                                    margin-right: 20px;\n");
      out.write("                                }\n");
      out.write("                                .feature{\n");
      out.write("                                        margin: 0 auto;\n");
      out.write("                                        padding: 0 10px;\n");
      out.write("                                        width: 940px;\n");
      out.write("                                    }\n");
      out.write("       </style>\n");
      out.write("        </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        <header>\n");
      out.write("       <div class=\"bar1\">\n");
      out.write("        \n");
      out.write("        <h1>Houses<span class=\"color\">..</span></h1>\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"homepage.html\">Home</a></li>\n");
      out.write("                <li><a href=\"profile.html\">My Profile</a></li>\n");
      out.write("                  <li><a href=\"logout\">Logout</a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("         \n");
      out.write("        <div class=\"feature\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"View_Profile\"> <h2>View your profile</h2></a></li>\n");
      out.write("            \n");
      out.write("            <li><a href=\"Edit.jsp\"> <h2>Edit your profile</h2></a>\n");
      out.write("            </li> \n");
      out.write("            \n");
      out.write("            <li><a href=\"Change_password.jsp\"> <h2>Change your password</h2></a></li>\n");
      out.write("            <li><a href=\"Post.jsp\"><h2>Post an Advertisement</h2></a></li>\n");
      out.write("         \n");
      out.write("          </ul>\n");
      out.write("          </div>\n");
      out.write("         ");

            //get sesstion here 
             HttpSession mySession = request.getSession();
             mySession.getAttribute("userID");
             
            
            
      out.write(" \n");
      out.write("\n");
      out.write("            \n");
      out.write("            </body>\n");
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
