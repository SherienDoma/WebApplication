package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Post_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            input[type=text] {\n");
      out.write("                width: 30%; /* Full width */\n");
      out.write("                padding: 12px; /* Some padding */  \n");
      out.write("                border: 1px solid #ccc; /* Gray border */\n");
      out.write("                border-radius: 4px; /* Rounded borders */\n");
      out.write("                box-sizing: border-box; /* Make sure that padding and width stays in place */\n");
      out.write("                margin-top: 6px; /* Add a top margin */\n");
      out.write("                margin-bottom: 16px; /* Bottom margin */\n");
      out.write("                resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            input[type=submit] {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .post {\n");
      out.write("                border-radius: 5px;\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("                padding: 20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"post\">\n");
      out.write("            \n");
      out.write("            <label for=\"loc\">Location</label><br>\n");
      out.write("            <button onclick=\"getLocation()\">Add your house location</button> \n");
      out.write("\n");
      out.write("            <p id=\"demo\"></p>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                var x = document.getElementById(\"demo\");\n");
      out.write("\n");
      out.write("                function getLocation() {\n");
      out.write("                    if (navigator.geolocation) {\n");
      out.write("                        navigator.geolocation.getCurrentPosition(showPosition);\n");
      out.write("                    } else {\n");
      out.write("                        x.innerHTML = \"Geolocation is not supported by this browser.\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function showPosition(position) {\n");
      out.write("                    //x.innerHTML = \"Latitude: \" + position.coords.latitude +\n");
      out.write("                           // \"<br>Longitude: \" + position.coords.longitude;\n");
      out.write("                     document.getElementById(\"loc\").value = \"https://www.google.com/maps/?q=loc:\" + position.coords.latitude + \",\" + position.coords.longitude;\n");
      out.write("                    //x.innerHTML = \"https://www.google.com/maps/?q=loc:\" + position.coords.latitude + \",\" + position.coords.longitude;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            </script>\n");
      out.write("            \n");
      out.write("            <form action=\"posting\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                <input type=\"text\" id=\"loc\" name=\"location\"> <br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <label for=\"size\">Size – Space </label><br>\n");
      out.write("                <input type=\"text\" id=\"space\" name=\"Space\" ><br>\n");
      out.write("\n");
      out.write("                <label for=\"des\">Description</label><br>\n");
      out.write("                <input type=\"text\" id=\"description\" name=\"Description\" ><br>\n");
      out.write("\n");
      out.write("                <label for=\"fl\">Floor </label><br>\n");
      out.write("                <input type=\"text\" id=\"floor \" name=\"Floor\" ><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <label for=\"st\"> Status </label><br>\n");
      out.write("                <input type=\"text\" id=\"status\" name=\"Status\" ><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <label for=\"t\">Type </label><br>\n");
      out.write("                <input type=\"text\" id=\"type\" name=\"Type\" ><br>\n");
      out.write("                \n");
      out.write("               <label for=\"housepicture\">House picture</label><br>\n");
      out.write("               <!-- <input type=\"file\" name=\"pic\" accept=\"image/*\"><br>-->\n");
      out.write("                \n");
      out.write("                 <input type=\"file\" name=\"pic\" required=\"required\"/><br/><br/>\n");
      out.write("                 \n");
      out.write("                <!--<img src=\"e.jpg\">-->\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Submit\"><br>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

            //get sesstion here 
            HttpSession mySession = request.getSession();
            mySession.getAttribute("userid");


        
      out.write(" \n");
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
