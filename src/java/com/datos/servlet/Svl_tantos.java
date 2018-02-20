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

import com.datos.modelos.M_tantos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TI
 */
public class Svl_tantos extends HttpServlet {
    String pleca,carretilla,idf;
    String tiro[],color[],peso[],calidad[],carbon[],ancho[],largo[],perfh[],perfv[],cambios[],tiram[],nomM[],ubicam[];
     HashMap<String, String> data = new HashMap<String, String>();
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
        M_tantos mt=new M_tantos();
       response.setContentType("text/html;charset=UTF-8");
       idf =request.getParameter("txtidf");
       pleca =request.getParameter("txtpleca");
       carretilla=request.getParameter("txtcarr");
       tiro=request.getParameterValues("txttiros");
       color=request.getParameterValues("txtcolor");
       peso=request.getParameterValues("txtpeso");
       calidad=request.getParameterValues("txtcalidad");
       carbon=request.getParameterValues("selcarbon");
       ancho=request.getParameterValues("txtancho");
       largo=request.getParameterValues("txtlargo");
       perfh=request.getParameterValues("txtph");
       perfv=request.getParameterValues("txtpv");
       cambios=request.getParameterValues("txtcambio");
       tiram=request.getParameterValues("seltiras");
       nomM=request.getParameterValues("txtnomM");
       ubicam=request.getParameterValues("txtubica");
       data.put("1", idf);
       data.put("2", pleca);
       data.put("3", carretilla);
       
        for (int i = 0; i < tiro.length; i++) {
            data.put("4", tiro[i]);
             data.put("5", color[i]);
            data.put("6", peso[i]);
            data.put("7", calidad[i]);
            data.put("8", carbon[i]);
            data.put("9", ancho[i]);
            data.put("10", largo[i]);
            data.put("11", perfh[i]);
            data.put("12", perfv[i]);
            data.put("13", cambios[i]);
            data.put("14", tiram[i]);
            data.put("15", nomM[i]);
            data.put("16", ubicam[i]);
            System.out.println(mt.setTanto(data));
            mt.CloseDB();
            
        }
      response.sendRedirect("/Folderas/Ver_ordenes.jsp");
          
      
        
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
