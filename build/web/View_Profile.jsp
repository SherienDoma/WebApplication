<%-- 
    Document   : View_Profile
    Created on : Dec 16, 2017, 7:11:55 PM
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
            h3 {
                color: blue;
            }
            
            .photo{
                width: 300px;
                height: 500px;
            }
        </style>
    </head>
    
        
    <body>
        <h3>Name: </h3>
        <%String name= (String)request.getAttribute("name");
        
        out.print(name);%>
        
        <h3>Email: </h3>
        <%= request.getAttribute("email")%>
        
         <h3>Phone: </h3>
        <%= request.getAttribute("phone")%>
        
         <h3>Address: </h3>
        <%= request.getAttribute("add")%>
        
        <h1>Profile Picture:</h1>
<!--        <img src="‪E:\image1.png" alt="profile">
        <a href="../image1.png"></a>-->

        <img class ="photo" src="../../image1.png" alt="profile"/>
        
        

    </body>  
</html>
