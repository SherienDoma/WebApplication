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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
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
 * @author usr
 */
@WebServlet(urlPatterns = {"/Rigester"})
@MultipartConfig(maxFileSize = 16177216)

//in this page we will enter the user data into database
public class Rigester extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *
     */
    static final String DB_URL = "jdbc:mysql://localhost:3306/ia";
    static final String IA = "root";
    static final String pass = "root";
    private Object respond;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("name");
        String password = request.getParameter("password");
        String Address = request.getParameter("address");
        String Email = request.getParameter("email");
        String phone = request.getParameter("phone");
        Part part = request.getPart("pic");

        /* request.setAttribute("username", username);
         RequestDispatcher rd; 
         rd = request.getRequestDispatcher("Enter.jsp");
         rd.forward(request, response);*/
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int userID = -1;

            Class.forName("com.mysql.jdbc.Driver");
            Connection Con = (Connection) DriverManager.getConnection(DB_URL, IA, pass);
            String insertTableSQL = "INSERT INTO user_info (username,password,Address,Email,phone,picture) values (?,?,?,?,?,?)";
            PreparedStatement ps = Con.prepareStatement(insertTableSQL);

            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, Address);
            ps.setString(4, Email);
            ps.setString(5, phone);
            InputStream is = part.getInputStream();
	    ps.setBlob(6, is);

            int i = ps.executeUpdate();
            System.out.println("hello?");
            if (i > 0) {
                out.print("You're succefully register");
                response.sendRedirect("Home.jsp");

            }
            String insertTableSQL2 = "SELECT id where username=?";
            PreparedStatement ps2 = Con.prepareStatement(insertTableSQL2);

            ps2.setString(1, username);

            ResultSet result = ps2.executeQuery();
            while (result.next()) //get all row.
            {
                userID = result.getInt("id");
            }
            out.close();
            //add user to session by getting his id 
            HttpSession mySession = request.getSession();
            mySession.setAttribute("userid", userID);

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
            Logger.getLogger(Rigester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rigester.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Rigester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rigester.class.getName()).log(Level.SEVERE, null, ex);
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
