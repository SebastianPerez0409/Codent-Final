/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.entitys.Pmv;
import co.edu.unipiloto.season.PmvFacadeLocal;
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
@WebServlet(name = "PMVServlet", urlPatterns = {"/PMVServlet"})
public class PMVServlet extends HttpServlet {

    @EJB
    private PmvFacadeLocal pmvFacade;

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

        String idStr = request.getParameter("pmvId");
        int pmvid = 0;
        if (idStr != null && !idStr.equals("")) {
            pmvid = Integer.parseInt(idStr);
        }

        String ubicacionStr = request.getParameter("ubicacion");
        String mensajeStr = request.getParameter("mensaje");

        String estadoStr = request.getParameter("estado");
        boolean estem = false;
        if (estadoStr != null && !estadoStr.equals("")) {
            estem = Boolean.valueOf(estadoStr);
        }

        Pmv pmvs = new Pmv(pmvid, ubicacionStr, mensajeStr, estem);

        if ("Add".equalsIgnoreCase(action)) {
            pmvFacade.create(pmvs);
        } else if ("Search".equalsIgnoreCase(action)) {
            pmvFacade.find(pmvid);
        } else if ("Edit".equalsIgnoreCase(action)) {
            pmvFacade.edit(pmvs);
        } else if ("Delete".equalsIgnoreCase(action)) {
            pmvFacade.remove(pmvs);
        }

        //string de conexion nos vamos a persistence.xml en data source jdbc/estudiante
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("pmv", pmvs);
        if ("Add".equalsIgnoreCase(action) || "Edit".equalsIgnoreCase(action) || "Delete".equalsIgnoreCase(action)) {
            request.setAttribute("allPmvs", pmvFacade.findAll());
        } else {
            List<Pmv> prueba = new ArrayList();
            prueba.add(pmvFacade.find(pmvid));
            request.setAttribute("allPmvs", prueba);
        }
        request.getRequestDispatcher("PMVInfo.jsp").forward(request, response);
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
