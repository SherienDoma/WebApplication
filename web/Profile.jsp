<%-- 
    Document   : Profile
    Created on : Dec 10, 2017, 7:15:18 PM
    Author     : usr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel = "stylesheet"
              type = "text/css"
              href = "myStyle.css" />
       <style>
        
     
                     body {
                        background-color: #fff;
                        color: #777;
                        font: normal 15px "Helvetica Neue", Arial, Helvetica, Geneva, sans-serif;
                         }
                      p {
                            line-height: 20px;
                             margin-bottom: 20px;
                                      }
                       h1 {
                                      font-family: 'Crete Round', serif;
                                     font-weight: bold;
                                   color: #444;
                                  font-size: 45px;
                            margin-bottom: 20px;
                          }
                          h2 {
                                font-size: 24px;
                                color: #444;
                                font-weight: bold;
                                text-transform: uppercase;
                                margin-bottom: 20px;
                            }
                        .bar1 {
                               margin: 0 auto;
                               padding: 0 10px;
                                width: 940px;
                                 position: fixed;
                              }
                              header {
                                    height: 120px;
                                }
                                header h1 {
                                    float: left;
                                    margin-top: 32px;
                                }
                                header h1 .color {
                                    color: #02b8dd;
                                }
                                header nav {
                                    float: right;
                                }
                                header nav ul li {
                                    float: left;
                                    display: inline-block;
                                    margin-top: 50px;
                                }
                                header nav ul li a {
                                    color: #444;
                                    text-transform: uppercase;
                                    font-weight: bold;
                                    display: block;
                                    margin-right: 20px;
                                }
                                .feature{
                                        margin: 0 auto;
                                        padding: 0 10px;
                                        width: 940px;
                                    }
       </style>
        </head>
    <body>
         
        <header>
       <div class="bar1">
        
        <h1>Houses<span class="color">..</span></h1>
        <nav>
            <ul>
                <li><a href="homepage.html">Home</a></li>
                <li><a href="profile.html">My Profile</a></li>
                  <li><a href="logout">Logout</a></li>
                
            </ul>
        </nav>
    </div>
  </header>
         
        <div class="feature">
        <ul>
            <li><a href="View_Profile"> <h2>View your profile</h2></a></li>
            
            <li><a href="Edit.jsp"> <h2>Edit your profile</h2></a>
            </li> 
            
            <li><a href="Change_password.jsp"> <h2>Change your password</h2></a></li>
            <li><a href="Post.jsp"><h2>Post an Advertisement</h2></a></li>
         
          </ul>
          </div>
         <%
            //get sesstion here 
             HttpSession mySession = request.getSession();
             mySession.getAttribute("userID");
             
            
            %> 

            
            </body>
</html>
