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
package com.datos.modelos;

import com.datos.db.ConexionBD;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author TI
 */
public class M_AplicacionesE extends ConexionBD{
    public  String getAP(int clave){
    String m=null;
        if (clave==0) {
            m="Escribe una clave existente";
        }
        try {
            Pst = OpenDB().prepareCall("Select Aplicación from tb_aplicacionese where id_aplicacion = ?");
            Pst.setInt(1, clave);
            Rs= Pst.executeQuery();
            while (Rs.next()) {
                m=Rs.getString(1);
            }
            if (m==null || m.isEmpty()||m==""||m=="null" || m=="Null") {
                m = "Escribe una clave existente";
            }
        } catch (SQLException e) {
            m=e.getMessage();
        }
    return m;
    }
    
    public String setAE(HashMap data){
    String mensaje = null;
    try{
        Cst= OpenDB().prepareCall("{call cs_setAP (?,?,?,?,?,?,?,?)}");
        Cst.setString(1, (String) data.get("idform"));
        Cst.setString(2, (String) data.get("clave"));
        Cst.setString(3, (String) data.get("desc"));
        Cst.setString(4, (String) data.get("ancho"));
        Cst.setString(5, (String) data.get("largo"));
        Cst.setString(6, (String) data.get("cantidad"));
        Cst.setString(7, (String) data.get("obs"));
        Cst.setString(8, (String) data.get("cliente"));
        
        
        Cst.execute();
        mensaje="Exito";
    }catch(SQLException e){
        mensaje = e.getMessage();
    }
    return mensaje;
    }
    
   
}
