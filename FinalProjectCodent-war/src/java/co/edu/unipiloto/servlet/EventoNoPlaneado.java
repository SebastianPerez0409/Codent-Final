/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.entitys.Eventonoplaneado;
import co.edu.unipiloto.entitys.Pmv;
import co.edu.unipiloto.season.EventonoplaneadoFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ingse
 */
@WebServlet(name = "EventoNoPlaneado", urlPatterns = {"/EventoNoPlaneado"})
public class EventoNoPlaneado extends HttpServlet {

    @EJB
    private EventonoplaneadoFacadeLocal eventonoplaneadoFacade;

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");
        String id = request.getParameter("idEvento");
        int idInt = Integer.parseInt(id);
        if ("GENERAR EVENTO ALEATORIO".equalsIgnoreCase(action)) {
            eventonoplaneadoFacade.create(new Eventonoplaneado(idInt, eventonoplaneadoFacade.generarDescAleatoria(), eventonoplaneadoFacade.generarViaAleatoria(), eventonoplaneadoFacade.generarSensorAleatorio() + "", "Activo"));
        }

        response.setContentType("text/html;charset=UTF-8");

        List<Eventonoplaneado> prueba = new ArrayList();
        prueba.add(eventonoplaneadoFacade.find(idInt));
        request.setAttribute("allEvento", prueba);

        request.getRequestDispatcher("eventonoplaneado.jsp").forward(request, response);
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
