/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/Search"})
public class Search extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static final String DB_URL = "jdbc:mysql://localhost:3306/ia";
    static final String IA = "root";
    static final String pass = "root";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection Con = (Connection) DriverManager.getConnection(DB_URL, IA, pass);
            
            
            String size = request.getParameter("size");
            String type = request.getParameter("type");
            String floor = request.getParameter("floor");
            String status = request.getParameter("status");
            String rs = request.getParameter("rs");
            
            Boolean s = false , t=false , f =false, ss=false ;
            Boolean r_s = false;
            //int counter = 0;
            Boolean first=false;
            if(!size.equals(""))
            {
                s = true;
                //counter++;
            }
            if(!type.equals(""))
            {
                t=true;
                //counter++;
            }
            if(!floor.equals(""))
            {
                f=true;
               // counter++;
            }
            if(!status.equals(""))
            {
                ss=true;
                //counter++;
            }
            if(!rs.equals(""))
            {
                r_s=true;
                //counter++;
            }
            
            
            String insertTableSQL = "SELECT * from ads where";
            if (s==true)
            {  
               String result =" size='"+size+"'";
               insertTableSQL = insertTableSQL + result;
               first=true;
            }
            if(t==true)
            {
                if (first==true)
                {
                    String result1=" AND type='"+type+"'";
                    insertTableSQL=insertTableSQL+result1;  
                }
                else {
                    String result1=" type='"+type+"'";
                    insertTableSQL=insertTableSQL+result1;
                    first=true;
                }
            }
            
            if( f==true)
            {
                if(first==true)
                {
                    String result1=" AND floor='"+floor+"'";
                    insertTableSQL=insertTableSQL+result1;  
                }
                else {
                    String result1=" floor='"+floor+"'";
                    insertTableSQL=insertTableSQL+result1;
                    first=true;
                }
                
            }
            if( ss==true)
            {
                if(first==true)
                {
                    String result1=" AND status='"+status+"'";
                    insertTableSQL=insertTableSQL+result1;  
                }
                else {
                    String result1=" status='"+status+"'";
                    insertTableSQL=insertTableSQL+result1;
                    first=true;
                }
                
            }
            
            if(r_s == true)
            {
                if(first=true)
                    {
                    String result1=" AND 7aga='"+rs+"'";
                    insertTableSQL=insertTableSQL+result1;  
                }
                else {
                    String result1=" 7aga='"+rs+"'";
                    insertTableSQL=insertTableSQL+result1;
                    first=true;
                }
            }
            PreparedStatement ps = Con.prepareStatement(insertTableSQL);
           // ps.setString(1, size);
            ResultSet resultset;
            resultset = ps.executeQuery();
            
            String ssize= null;
            String ttype = null;
            String ffloor = null;
            String desc = null;
            String rrs = null;
            String loc = null;
            String stat = null;
            int userid = 0;
            
            while (resultset.next())
            {
                ssize=resultset.getString("size");
                ttype=resultset.getString("type");
                ffloor=resultset.getString("floor");
                desc = resultset.getString("description");
                rrs=resultset.getString("7aga");
                loc = resultset.getString("location");
                stat = resultset.getString("status");
                userid = resultset.getInt("user_id");
//                out.println(ssize);
//                out.println(desc);
            }
            request.setAttribute("type", ttype);
            request.setAttribute("size", ssize);
            request.setAttribute("floor", ffloor);
            request.setAttribute("desc", desc);
            request.setAttribute("rrs", rrs);
            request.setAttribute("loc", loc);
            request.setAttribute("stat", stat);
            request.setAttribute("userid", userid);
            
            HttpSession Result_Session = request.getSession();
            Result_Session.setAttribute("uid",userid);

            RequestDispatcher rd = request.getRequestDispatcher("Search_result.jsp");
            rd.forward(request, response);
             
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
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
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
