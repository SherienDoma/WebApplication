<%-- 
    Document   : admin_password
    Created on : Dec 18, 2017, 6:49:57 PM
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
        <h1>Change user password!</h1>
        
        
        <form action="admin_password">
            <h3>Enter the username:</h3>
            <input type="text" name="username">
            <h3>Enter your new password:</h3>
            <input type="password" name="new_password">
            <input type="submit" value="Submit Password">
        </form>
    </body>
</html>
