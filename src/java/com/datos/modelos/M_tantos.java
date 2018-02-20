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
public class M_tantos extends ConexionBD{
    
    /**
     *
     * @param a
     * @return
     */
    public String setTanto(HashMap<String, String> data){
    String mensaje =null;
        try {
            Pst =OpenDB().prepareCall("INSERT INTO tb_tantos VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            Pst.setInt(1,Integer.parseInt(data.get("1")) );
            Pst.setString(2,  data.get("2"));
            Pst.setString(3,  data.get("3"));
            Pst.setString(4,  data.get("4"));
            Pst.setString(5,  data.get("5"));
            Pst.setString(6,  data.get("6"));
            Pst.setString(7,  data.get("7"));
            Pst.setString(8,  data.get("8"));
            Pst.setString(9,  data.get("9"));
            Pst.setString(10, data.get("10"));
            Pst.setString(11, data.get("11"));
            Pst.setString(12, data.get("12"));
            Pst.setString(13, data.get("13"));
            Pst.setString(14, data.get("14"));
            Pst.setString(15, data.get("15"));
            Pst.setString(16, data.get("16"));
            Pst.execute();
            mensaje = "Exito";
        } catch (SQLException ex) {
            mensaje=ex.getMessage();
        }
    return mensaje;
    }
}
