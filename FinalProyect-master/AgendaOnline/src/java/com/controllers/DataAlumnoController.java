
package com.controllers;

import com.models.DataDAO;
import com.models.DataPOJO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DataAlumnoController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            DataDAO daoA = new DataDAO();
            DataPOJO dtoA = new DataPOJO();
            HttpSession session = request.getSession();
            
            String action = request.getParameter("action");
            String materiatxt = request.getParameter("materiaAlum");
            String fechatxt = request.getParameter("fechaAlum");
            
            dtoA.setMateria(materiatxt);
            dtoA.setFecha(fechatxt);
        
            if(action.equals("buscar")){
                dtoA.setMateria(materiatxt);
                dtoA.setFecha(fechatxt);
                ArrayList<DataPOJO> deberesA = daoA.buscar(dtoA);
                session.setAttribute("DeberesA", deberesA);
                response.sendRedirect("ProfileAlumno.jsp");
            }else{
             
            }
        
            
            
            
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
        processRequest(request, response);
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
        processRequest(request, response);
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
