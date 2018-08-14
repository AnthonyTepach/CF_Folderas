/*
 * Copyright (C) 2018 inspector
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.datos.servlet;

import com.datos.modelos.M_tintas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author inspector
 */
public class Svl_tintas extends HttpServlet {
HashMap<String,String> data=new HashMap();
M_tintas mt=new M_tintas();
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
        String tanto[] = request.getParameterValues("txttanto");
        String frente[]=request.getParameterValues("txtfrente");
        String reverso[]=request.getParameterValues("txtreverso");
        String barniz[]=request.getParameterValues("txtbarniz");
        String pantalla[]=request.getParameterValues("txtpantalla");
        String id=request.getParameter("idforma");
        data.put("idforma", id);
        for (int i = 0; i < tanto.length; i++) {
            data.put("tanto", tanto[i]);
            data.put("fr", frente[i]);
            data.put("rv", reverso[i]);
            data.put("barniz", barniz[i]);
            data.put("pantalla", pantalla[i]);
            mt.setData(data);
            mt.CloseDB();
        }
        try (PrintWriter out = response.getWriter()) {
            out.print("<div class='alert alert-primary' role='alert'>");
            out.print("<h1>Guardando</h1>");
            out.print("Forma:" +id);
            
            for (int i = 0; i < tanto.length; i++) {
                
                out.print("<p>");
                out.print("Tanto: "+tanto[i]+"<br>");
                out.print("N° Pantone frontal: "+frente[i]+"<br>");
                out.print("N° Pantone reverso: "+reverso[i]+"<br>");
                out.print("Barniz: "+barniz[i]+"<br>");
                out.print("Pantalla: "+pantalla[i]);
                out.print("</p>");
            }
            out.print("</div>");
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
