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
            .bar1,photo {
                /*margin: 0 auto;*/
                padding: 0 10px;
                padding-left: 0px;
                width: 940px;
                /*position: fixed;*/


            }
            .ads
            {   border: 2px solid white;
                border-radius: 40%;
                padding-left: 450px;
                background-color:white; 
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
                /*                float: right;*/
                padding-left:700px;
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

            .vertical-menu {
                width: 200px;
                height: 150px;
                overflow-y: auto;
            }

            .vertical-menu a {
                background-color: #eee;
                color: black;
                display: block;
                padding: 12px;
                text-decoration: none;
            }

            .vertical-menu a:hover {
                background-color: #ccc;
            }

            .vertical-menu .active {
                background-color: #4CAF50;
                color: white;
            }
            .search {
                padding-left: 950px;
                padding-top:50px;

            }
            .rate_house {
                border:     1px solid #CCC;
                overflow:   visible;
                padding:    10px;
                position:   relative;
                width:      180px;
                height:     32px;
                float: right;
            }
            .ratings_stars {
                background: url('star_empty.png') no-repeat ;
                float:      left;
                height:     28px;
                padding:    2px;
                width:      32px;
            }

            .ratings_vote {
                background: url('star_full.png') no-repeat;
                float:      left;
                height:     28px;
                padding:    2px;
                width:      32px;
            }
            .ratings_over {
                background: url('star_highlight.png') no-repeat;
                float:      left;
                height:     28px;
                padding:    2px;
                width:      32px;
            }

            .house {
                font: 10px verdana, sans-serif;
                /*                margin: 0 auto 40px auto;*/
                padding-left: 20px;
                width: 180px;
            }

            .textbox {  
                /*                float: right;*/
                border: 1px;
                outline:0; 
                height:32px; 
                width: 180px;
                padding-bottom: 70px;
            } 

            #admin
            {
                padding-top: 20px;
            }

        </style>

        <script src="http://code.jquery.com/jquery-latest.min.js"></script>

        <script>
            $(document).ready(function () {
                $('.ratings_stars').hover(
                        // Handles the mouseover
                                function () {
                                    $(this).prevAll().andSelf().addClass('ratings_over');
                                    $(this).nextAll().removeClass('ratings_vote');
                                },
                                // Handles the mouseout
                                        function () {
                                            $(this).prevAll().andSelf().removeClass('ratings_over');
                                            //set_votes($(this).parent());
                                        }
                                );

                                $('.ratings_stars').click(
                                        // Handles the mouseclick
                                                function () {
                                                    $(this).prevAll().andSelf().addClass('ratings_vote');
                                                    $(this).nextAll().removeClass('ratings_over');
                                                },
                                                );
                                    });
        </script>
    </head>
    <body>
        <img class="logo" src="logo.png" alt="logo">
        <!--        <input type="text" name="search" placeholder="Search..">-->
        <header>
            <div class="bar1">

                <h1>Houses<span class="color">..</span></h1>
                <nav>
                    <ul>

                        <li><a href="checkAdmin" id="admin">Admin features</a></li>
                        <li><a href="Profile.jsp">My Profile</a></li>
                        <li><a href="logout">Logout</a></li>
                        <!--                        <li><a href="Search.jsp">Search</a></li>-->

                        <script src="http://code.jquery.com/jquery-latest.min.js"></script>



                    </ul>

                </nav>
            </div>

            <div class="search">
                <button>Search</button>
                <div class="vertical-menu" id="tag">

                    <form action="Search">
                        <a  href="#" >Size</a>   
                        <input name="size" type="text">

                        <a href="#" >Type</a>
                        <input name="type" type="text">
                        <a href="#" >Floor</a>
                        <input name="floor" type="text">
                        <a href="#">Status</a>
                        <input name="status" type="text">
                        <a href="#">Rent or Sell</a> 
                        <input name="rs" type="text">

                        <input type="submit" value="Search" id="link1"class="active">
                    </form>
                    <script>
                            $(document).ready(function () {
                                $("button").click(function () {
                                    $("#tag").toggle();
                                });
                            });
                    </script>

                    <script>
//                                        $(document).ready(function () {
                                        $("#link1").click(function () {
                                            $("#show").show();
                                        });
//                                        });
                    </script>


                </div>
            </div>
        </header>


        <div id="hero-image">
            <div class="photo">
                <img src="katameya.jpg" alt="House">
                <h2>Villa..4,200 sqm..LE 230 Million..<br/></h2>
                <div class='house'>
                    Rate: Rating of house properties
                    <div id="r1" class="rate_house">
                        <div class="star_1 ratings_stars"></div>
                        <div class="star_2 ratings_stars"></div>
                        <div class="star_3 ratings_stars"></div>
                        <div class="star_4 ratings_stars"></div>
                        <div class="star_5 ratings_stars"></div>


                    </div>
                </div>

                <br> <br>
                [
                <img src="kataeya.jpg" alt="House">
                <h2>Villa..LE 140,000,000..with 5 bedrooms and bathrooms <br/></h2>
                <div class='house'>
                    Rate: Rating of house properties
                    <div id="r1" class="rate_house">
                        <div class="star_1 ratings_stars"></div>
                        <div class="star_2 ratings_stars"></div>
                        <div class="star_3 ratings_stars"></div>
                        <div class="star_4 ratings_stars"></div>
                        <div class="star_5 ratings_stars"></div>


                    </div>
                </div>

               

            </div>
        </div>


        <%
            //get sesstion here 
            HttpSession mySession = request.getSession();
            mySession.getAttribute("userid");


        %> 

    </body>
</html>
