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
import java.util.Hashtable;

/**
 *
 * @author TI
 */
public class M_Formas extends ConexionBD {

    public String setForma(Hashtable data) {
        String Mensaje = null;
        try {
            Cst = OpenDB().prepareCall("{call cs_setNforma(?,?,?,?,?,?,?,?,?,?,?,?)}");
            Cst.setString(1, (String) data.get("nom"));
            Cst.setString(2, (String) data.get("tien"));
            Cst.setString(3, (String) data.get("anc"));
            Cst.setString(4, (String) data.get("alt"));
            Cst.setString(5, (String) data.get("age"));
            Cst.setString(6, (String) data.get("ela"));
            Cst.setString(7, (String) data.get("coti"));
            Cst.setString(8, (String) data.get("opa"));
            Cst.setString(9, (String) data.get("canti"));
            Cst.setString(10, (String) data.get("uni"));
            Cst.setString(11, (String) data.get("sfa"));

            Cst.setString(12, (String) data.get("idc"));
            
            Cst.execute();

            Mensaje = "Exito";
            return Mensaje;
        } catch (SQLException sqle) {
            Mensaje = sqle.getMessage();
        }
        return Mensaje;
    }

    public int getidFoA(String agente) {
        int i = 0;
        try {
            Pst = OpenDB().prepareCall("select max(id_forma) from tb_formas where agente=?");
            Pst.setString(1, agente);
            Rs = Pst.executeQuery();
            while (Rs.next()) {
                i = Rs.getInt(1);
            }
            return i;
        } catch (SQLException sqle) {
            i = sqle.getErrorCode();
        }
        return i;
    }

}
