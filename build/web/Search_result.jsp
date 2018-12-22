<%-- 
    Document   : Search_result
    Created on : Dec 17, 2017, 8:09:48 PM
    Author     : Lenovo
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel = "stylesheet"
              type = "text/css"
              href = "myStyle.css" />
        <title>JSP Page</title>
        <style>
            h1 {
                color: blue;
            }

            h3
            {
                color : pink;
            }

            #panel, #flip {
                padding: 5px;
                text-align: center;
                background-color: #e5eecc;
                border: solid 1px #c3c3c3;
            }

        </style>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script>
            $(document).ready(function () {
                $("#flip").click(function () {
                    $("#panel").slideDown("slow");
                });
            });
        </script>
    </head>
    <body>
        <h1>Your Search results</h1>

        <h3>Description:</h3>
        <%= request.getAttribute("desc")%>

        <h3>Size:</h3>
        <%= request.getAttribute("size")%>

        <h3>Floor:</h3>
        <%= request.getAttribute("floor")%>

        <h3>Status:</h3>
        <%= request.getAttribute("stat")%>

        <h3>Type:</h3>
        <%= request.getAttribute("type")%>

       

        <br><br><a href="<%= request.getAttribute("loc")%>">Location</a>

        <h3>Options:</h3>
        <%= request.getAttribute("rrs")%>
        
      
        <br><br>
        <a id="flip" href="Contact_information">Request Contact Information for this advertisment</a>
        <br>
        
         
            
            <% 
//                 int userid = (int) request.getAttribute("userid");
//                 out.println(userid);
//               HttpSession Result_Session = request.getSession();
//                Result_Session.setAttribute("uid",userid);
            %>

 
       

    </body>
</html>
