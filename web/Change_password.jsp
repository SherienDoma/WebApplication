<%-- 
    Document   : Change_password
    Created on : Dec 18, 2017, 6:17:08 PM
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
        <style>
            h3 {
                color: blue;
            }
        </style>
    </head>
    <body>
        <h1>Change your password</h1>
        
        <h3>Enter your new password:</h3>
        <form action="change_password">
            <input type="password" name="new_password">
            <input type="submit" value="Submit Password">
        </form>
        
        <%
             HttpSession mySession = request.getSession();
             mySession.getAttribute("userid");
            %>
    </body>
</html>
