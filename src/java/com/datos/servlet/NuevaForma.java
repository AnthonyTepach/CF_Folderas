/*
 * Copyright (C) 2018 TI
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

import com.datos.modelos.M_Formas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TI
 */
public class NuevaForma extends HttpServlet {

    Hashtable<String, String> data = new Hashtable<String, String>();
    String a, b, c, d, e, f, g, h, i, j,l ,k,tient;

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
        tient=request.getParameter("tipentr");
        
        a = request.getParameter("idcliente");
        b = request.getParameter("idFamily");
        c = request.getParameter("idsubFamily");
        d = request.getParameter("txtnom");
        e = request.getParameter("txtancho");
        f = request.getParameter("txtlargo");
        g = request.getParameter("txtagente");
        h = request.getParameter("txtelaboro");
        i = request.getParameter("txtopa");
        j = request.getParameter("txtcoti");
        k = request.getParameter("canti");
   l = request.getParameter("unidad");
        M_Formas m=new M_Formas();
         HttpSession sesion = request.getSession();
        data.put("nom", d);
        data.put("tien", tient);
        data.put("anc", e);
        data.put("alt", f);
        data.put("sfa", c);
        data.put("idc", a);
        data.put("ela", h);
        data.put("age", g);
        data.put("coti", j);
        data.put("opa", i);
        data.put("canti", k);
        data.put("uni", l);
         String mensajes= m.setForma(data);
        
     
        int idforma=m.getidFoA((String) sesion.getAttribute("Usuario"));
        m.CloseDB();
        
       response.sendRedirect("AEspeciales.jsp?m="+mensajes+"&ic="+a+"&if="+idforma);
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
