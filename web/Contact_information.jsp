<%-- 
    Document   : Contact_information
    Created on : Dec 18, 2017, 2:22:23 PM
    Author     : Lenovo
--%>

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


        </style>
    </head>
    <body>
        <h1>Contact Information</h1>

        <h3>Name:</h3>
        <%= request.getAttribute("username")%>

        <h3>Phone:</h3>
        <%= request.getAttribute("phone")%>

        <h3>Email:</h3>
        <%= request.getAttribute("email")%>

        <h3>Address:</h3>
        <%= request.getAttribute("address")%>

        

    </body>
</html>
