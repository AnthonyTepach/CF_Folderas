/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datos.servlet;

import com.datos.modelos.M_Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TI
 */
public class ClienteNuevo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String a, b, c, d, e, f, g, h;
    Hashtable<String, String> contenedor = new Hashtable<String, String>();
    M_Cliente m=new M_Cliente();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
        a = request.getParameter("txtrfc");
        b = request.getParameter("txtcliente");
        c = request.getParameter("txtdomi");
        d = request.getParameter("txtcui");
        e = request.getParameter("txtEstado");
        f = request.getParameter("txttel");
        g = request.getParameter("txtdep");
        h = request.getParameter("txtatiende");
        contenedor.put("rfc", a);
        contenedor.put("nombre", b);
        contenedor.put("domi", c);
        contenedor.put("ciudad", d);
        contenedor.put("estado", e);
        contenedor.put("tel", f);
        contenedor.put("dep", g);
        contenedor.put("aten", h);
        String aaa=m.setCliente(contenedor);
        response.sendRedirect("Orden.jsp?MSJ="+aaa);
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
