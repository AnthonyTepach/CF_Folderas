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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.ir.BreakNode;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author AnthonyTepach
 */
public class M_Pruebas extends ConexionBD {

    public void nuevodato(String dato, int a) {
        String UUID = crearUUID();
        try {
            Pst = OpenDB().prepareCall("INSERT INTO tb_pruebas VALUES(?,?,?)");
            Pst.setString(1, UUID);
            Pst.setString(2, dato);
            Pst.setInt(3, a);
            Pst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public static void main(String[] args) {
        
        M_Pruebas a = new M_Pruebas();
        for (int i = 0; i < 900; i++) {

            a.nuevodato(RandomStringUtils.randomAlphanumeric(8).toUpperCase()+"-"+RandomStringUtils.randomAlphanumeric(4).toUpperCase()+"-"+RandomStringUtils.randomAlphanumeric(4).toUpperCase()+"-"+RandomStringUtils.randomAlphanumeric(4).toUpperCase()+"-"+RandomStringUtils.randomAlphanumeric(12).toUpperCase(), new Random().nextInt());
            a.CloseDB();

        }
        System.out.println("fin");
    }
    
}
