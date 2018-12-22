<%-- 
    Document   : Admin_Features
    Created on : Dec 18, 2017, 5:27:59 PM
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
            h2 {
                color: blue;
            }
        </style>
    </head>
    <body>
       
<!--        <a  href="active" id="show" ><h2>Show active advertisement</h2></a> -->
        <button name="show" id="show">Show active advertisement</button> 
         <div id="messageDiv" style="display:none;"></div>
        <a  href="admin_password.jsp" ><h2>Change user password</h2></a> 
        
        
    </body>
</html>
