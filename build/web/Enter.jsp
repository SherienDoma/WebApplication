<%-- 
    Document   : Enter
    Created on : Dec 8, 2017, 9:48:27 PM
    Author     : usr
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            
        /// hena ha3mel ajax el mafrod bas afhmo el awel 
        ArrayList<String> a = new ArrayList<String>();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ia","root","root");
        PreparedStatement ps = con.prepareStatement("SELECT username FROM user_info");
        ResultSet rs = ps.executeQuery();

        while(rs.next())
        {   
            a.add(rs.getString(1));
        }
        
        out.print(a);
        //ajax
        // in log in i have to hndle the alert massage out.print("The username and password you entered did not match our records. Please double-check and try again.");

        try {
        
         String username=request.getParameter("name");
         for(int i=0;i<a.size();i++){
         if(username.equals("a[i]"))
                 {
                     out.print("name is already take enter other one");
                     break;
                 }
         
         else 
         {
             out.print("username is valid");
         }
         }
        }finally
        {
            out.close();
        }
         

            %>
           
        
    </body> 
</html>
