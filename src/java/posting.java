/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/posting"})
@MultipartConfig(maxFileSize = 16177216)
public class posting extends HttpServlet {

    static final String DB_URL = "jdbc:mysql://localhost:3306/ia";
    static final String IA = "root";
    static final String pass = "root";
         
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        Part part = request.getPart("pic");
        
        
        // picture and user id fron the session 
        String size = request.getParameter("Space");
        String description = request.getParameter("Description");
        String floor = request.getParameter("Floor");
        String status = request.getParameter("Status");
        String type = request.getParameter("Type");
        HttpSession mySession = request.getSession();
            
        int user =  (int) mySession.getAttribute("userid");
        //String picture = request.getParameter("pic");
        
//        char pic[] = picture.toCharArray();
//        for (int i=0 ; i<picture.length() ; i++)
//        {
//            
//        }
       String forr = request.getParameter("for");
        
        String location = request.getParameter("location");
        String active = "active";

        try (PrintWriter out = response.getWriter()) {

            // HttpSession mySession = request.getSession();
            // String userID = (String) mySession.getAttribute("userID");
            Class.forName("com.mysql.jdbc.Driver");
            Connection Con = (Connection) DriverManager.getConnection(DB_URL, IA, pass);
            String insertTableSQL = "INSERT INTO ads (user_id,description,size,type,floor,status,path,location,7aga,check1) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = Con.prepareStatement(insertTableSQL);
            ps.setInt(1, user);
            ps.setString(2, description);
            ps.setString(3, size);
           // ps.setString(4, picture);
            ps.setString(4, type);
            ps.setString(5, floor);
            ps.setString(6, status);
            
            InputStream is = part.getInputStream();
	    ps.setBlob(7, is);
            
            ps.setString(8, location);
            ps.setString(9, forr);
            
            ps.setString(10, active);

            int i = ps.executeUpdate();
            
             System.out.println("hello?");
            if (i > 0) {
                out.println("You're succecfully add your advertisement");
               // out.println(picture);
                //out.println(location);
                

            }
            
//             PreparedStatement ps2 = Con.prepareStatement("insert into ads(path) values(?)");
//			    InputStream is = part.getInputStream();
//			    ps2.setBlob(7, is);
//			    int result = ps2.executeUpdate();
//
//            
//           
//            
//            		if(result > 0){
//	    	//response.sendRedirect("result.jsp?message=Image+Uploaded");
//                out.println("Image uploaded");
//	    }
//		else{
//		//response.sendRedirect("result.jsp?message=Some+Error+Occurred");
//                out.println("Error occured");
//		}

        } catch (Exception e2) {
            System.out.println(e2);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posting.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posting.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
