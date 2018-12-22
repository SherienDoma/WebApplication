<%-- 
    Document   : Post
    Created on : Dec 10, 2017, 8:09:30 PM
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

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel = "stylesheet"
              type = "text/css"
              href = "myStyle.css" />
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
            .post {
                border-radius: 5px;
                background-color: #f2f2f2;
                padding: 20px;

            }


        </style>
    </head>
    <body>
        <div class="post">
            
            <label for="loc">Location</label><br>
            <button onclick="getLocation()">Add your house location</button> 

            <p id="demo"></p>

            <script>
                var x = document.getElementById("demo");

                function getLocation() {
                    if (navigator.geolocation) {
                        navigator.geolocation.getCurrentPosition(showPosition);
                    } else {
                        x.innerHTML = "Geolocation is not supported by this browser.";
                    }
                }

                function showPosition(position) {
                    //x.innerHTML = "Latitude: " + position.coords.latitude +
                           // "<br>Longitude: " + position.coords.longitude;
                     document.getElementById("loc").value = "https://www.google.com/maps/?q=loc:" + position.coords.latitude + "," + position.coords.longitude;
                    //x.innerHTML = "https://www.google.com/maps/?q=loc:" + position.coords.latitude + "," + position.coords.longitude;

                }
                
            </script>
            
            <form action="posting" method="post" enctype="multipart/form-data">

                <input type="text" id="loc" name="location"> <br>
                
                
                <label for="size">Size – Space </label><br>
                <input type="text" id="space" name="Space" ><br>

                <label for="des">Description</label><br>
                <input type="text" id="description" name="Description" ><br>

                <label for="fl">Floor </label><br>
                <input type="text" id="floor " name="Floor" ><br>


                <label for="st"> Status </label><br>
                <input type="text" id="status" name="Status" ><br>


                <label for="t">Type </label><br>
                <input type="text" id="type" name="Type" ><br>
                
                <label for="t">Rent/Sell </label><br>
                <input type="text" id="type" name="for" ><br>
                
               <label for="housepicture">House picture</label><br>
               <!-- <input type="file" name="pic" accept="image/*"><br>-->
                
                 <input type="file" name="pic" required="required"/><br/><br/>
                 
                <!--<img src="e.jpg">-->

                <input type="submit" value="Submit"><br>

            </form>
        </div>

        <%
            //get sesstion here 
            HttpSession mySession = request.getSession();
            mySession.getAttribute("userid");


        %> 
    </body>
</html>
