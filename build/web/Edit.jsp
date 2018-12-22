<%-- 
    Document   : Edit
    Created on : Dec 10, 2017, 8:46:25 PM
    Author     : usr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    
     
    <head>
        
        <style>
            
                        input[type=text] {
                                width: 30%; /* Full width */
                                padding: 12px; /* Some padding */  
                                border: 1px solid #ccc; /* Gray border */
                                border-radius: 4px; /* Rounded borders */
                                box-sizing: border-box; /* Make sure that padding and width stays in place */
                                margin-top: 6px; /* Add a top margin */
                                margin-bottom: 16px; /* Bottom margin */
                                resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */
                            }

            
            
            
                             input[type=submit] {
                                        background-color: #4CAF50;
                                        color: white;
                                        padding: 12px 20px;
                                        border: none;
                                        border-radius: 4px;
                                        cursor: pointer;
                                         
                                         }
                                .edit {
                                  border-radius: 5px;
                                  background-color: #f2f2f2;
                                     padding: 20px;
                                     margin-top: 6px;
                                   
                                }
                                
                                
                                img { 
                                    width:20%; 
                                }
                                </style>


        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel = "stylesheet"
              type = "text/css"
              href = "myStyle.css" />
    </head>
    <body>
        <div class="edit">
        
        
        <form action="edit" method="post" enctype="multipart/form-data">
         
            
        <label for="profilepicture">Profile Picture</label><br>
         <input type="file" name="pic" required="required"/><br/><br/>
         

            
         <label for="username">User Name</label><br>
         <input type="text" id="username" name="user-name" ><br>

          <label for="email">E-mail</label><br>
          <input type="text" id="email" name="e-mail" ><br>
          
          
          <label for="pass">New Password</label><br>
          <input type="text" id="password" name="Password" ><br>
         
          
          <label for="add">Address</label><br>
          <input type="text" id="address" name="Address" ><br>
          
         <label for="phonenumber">Phone Number</label><br>
         <input type="text" id="phonenumber" name="phone-number" ><br>
         
         
         
         <input type="submit" value="Submit"><br>
      
        
        
        </form>
         </div>
          
    
      

    </body>
</html>

<%
            //get sesstion here 
             HttpSession mySession = request.getSession();
             mySession.getAttribute("userid");
             
            
            %> 
    