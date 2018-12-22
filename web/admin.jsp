<%-- 
    Document   : admin
    Created on : Dec 19, 2017, 1:40:44 PM
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

    </head>
    <body>

        <button name="show" id="show">Show active advertisement</button> 
        <div id="bigClass"></div>
        <a  href="admin_password.jsp" ><h2>Change user password</h2></a> 

        <script src="http://code.jquery.com/jquery-latest.min.js"></script>

        <script>
            $(document).ready(function () {
            $("#show").click(function () {
            $.get("features", null, function (Advertisements) {

            for (var i = 0; i < Advertisements.length; i++)
            {
            var id = Advertisements[i]["id"];
                    $("#bigClass").prepend('<div id = "' + id + '" ></div>');
                    $('#' + id).prepend('<ul id = "ulCard" ></ul>');
                    //# id of the list
                    // var descripttion =  Advertisements[i]["descripttion"];

                    var descripttion = '<li> Description <strong>' + Advertisements[i]["descripttion"] + '</strong> </li>';
                    var status = '<li>  Status <strong>' + Advertisements[i]["status"] + '</strong> </li>';
                    var size = '<li>  Size <strong>' + Advertisements[i]["size"] + '</strong> </li>';
                    var floor = '<li>  Floor <strong>' + Advertisements[i]["floor"] + '</strong> </li>';
                    var type = '<li>  type <strong>' + Advertisements[i]["type"] + '</strong> </li>';
                    var location = '<li> <a href=' + Advertisements[i]["location"] + '> Location </a> </li>';
                    var rs = '<li>  Rent/For sale <strong>' + Advertisements[i]["RentorSale"] + '</strong> </li>';
                    var deleteBtn = '<button name="submit" type="submit"   id = "deleteBtn" value = "' + Advertisements[i]["id"] + '" >Delete </button>';
                    var suspendBtn = '<button name="submit" type="submit"   id = "suspenedBtn" value = "' + Advertisements[i]["id"] + '"> Suspend</button>';
                    $("#ulCard").append(descripttion);
                    $("#ulCard").append(status);
                    $("#ulCard").append(size);
                    $("#ulCard").append(floor);
                    $("#ulCard").append(type);
                    $("#ulCard").append(location);
                    $("#ulCard").append(rs);
                    $("#ulCard").append(deleteBtn);
                    $("#ulCard").append(suspendBtn);
            }

            });
            });
                    $(document).on('click', '#deleteBtn', function () {

            var id = $(this).val();
                    $.get("RemoveAd", "id=" + id, function () {
                    $('#' + id).remove();
                    });
            });
            
                    $(document).on('click', '#suspenedBtn', function(){
                    var id = $(this).val();
                    $.get("SuspepndAd", "id=" + id, function () {
                    $('#' + id).add();
                    var suspend = "Suspended";
                    $("#" + id).append(suspend);
                      });
                    });
                    
                    
                  });
           
             
           






        </script>
    </body>
</html>
