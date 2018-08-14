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
package com.datos.modelos;

import com.datos.db.ConexionBD;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author inspector
 */
public class M_tintas extends ConexionBD {

    public void setData(HashMap<String,String> datos) {
        try {
            Pst = OpenDB().prepareCall("INSERT INTO tb_tintas VALUES(null,?,?,?,?,?,?)");
            Pst.setString(1, datos.get("idforma"));
            Pst.setString(2, datos.get("tanto"));
            Pst.setString(3, datos.get("fr"));
            Pst.setString(4, datos.get("rv"));
            Pst.setString(5, datos.get("barniz"));
            Pst.setString(6, datos.get("pantalla"));
            Pst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
