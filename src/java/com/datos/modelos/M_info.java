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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TI
 */
public class M_info extends ConexionBD {

    public ResultSet getInfo(String tipo) {
        String sql = "SELECT \n"
                
                + "	        	F1.nombre_forma,\n"
                + "	        	F1.Tiempo_entrega,\n"
                + "	        	F1.agente,\n"
                + "	        	F1.cantidad,\n"
                + "	        	F1.Unidad,\n"
                + "	        	SF1.nombre_subfamilia,\n"
                + "	        	FF1.nombre_familia ,  \n"
                + "	        	C1.Nombre_cliente,\n"
                + "	        	C1.rfc_cliente,\n"
                + "	        	OP1.no_prod,\n"
                + "	        	OP1.status,"
                + "OP1.id_op,OP1.f_autorizacion,\n"
                + "	F1.id_forma        	\n"
                + "	        FROM\n"
                + "	        	tb_formas F1\n"
                + "	        	INNER JOIN\n"
                + "	        	 	tb_subfamilia_formato SF1 ON F1.id_sformato = SF1.id_sformato\n"
                + "	        	INNER JOIN\n"
                + "	      			tb_familia_formato FF1 ON SF1.id_fformato = FF1.id_fformato\n"
                + "	      		INNER JOIN\n"
                + "	      			tb_clinte C1 ON F1.id_cleinte= C1.id_cleinte\n"
                + "	      		INNER JOIN \n"
                + "	      			tb_op OP1 ON  OP1.id_forma=F1.id_forma\n"
                + "	      	WHERE  OP1.status = ? order by( F1.id_forma )";
        try {
            Pst = OpenDB().prepareCall(sql);
            Pst.setString(1, tipo);

            Rs = Pst.executeQuery();

        } catch (Exception e) {
            Rs = null;
            CloseDB();
        }

        return Rs;
    }

    public ResultSet getInfo(String nom, String tipo) {
        String sql = "SELECT \n"
                + "	        	F1.nombre_forma,\n"
                + "	        	F1.Tiempo_entrega,\n"
                + "	        	F1.agente,\n"
                + "	        	F1.cantidad,\n"
                + "	        	F1.Unidad,\n"
                + "	        	SF1.nombre_subfamilia,\n"
                + "	        	FF1.nombre_familia ,  \n"
                + "	        	C1.Nombre_cliente,\n"
                + "	        	C1.rfc_cliente,\n"
                + "	        	OP1.no_prod,\n"
                + "	        	OP1.status,OP1.id_op,\n"
                + "	  F1.id_forma      	\n"
                + "	        FROM\n"
                + "	        	tb_formas F1\n"
                + "	        	INNER JOIN\n"
                + "	        	 	tb_subfamilia_formato SF1 ON F1.id_sformato = SF1.id_sformato\n"
                + "	        	INNER JOIN\n"
                + "	      			tb_familia_formato FF1 ON SF1.id_fformato = FF1.id_fformato\n"
                + "	      		INNER JOIN\n"
                + "	      			tb_clinte C1 ON F1.id_cleinte= C1.id_cleinte\n"
                + "	      		INNER JOIN \n"
                + "	      			tb_op OP1 ON  OP1.id_forma=F1.id_forma\n"
                + "	      	WHERE F1.agente= ? and OP1.status = ? order by( F1.id_forma )" ;
        try {
            Pst = OpenDB().prepareCall(sql);
            Pst.setString(1, nom);
            Pst.setString(2, tipo);
            Rs = Pst.executeQuery();

        } catch (Exception e) {
            Rs = null;
            CloseDB();
        }

        return Rs;
    }

    public void UpdInfo(ArrayList<String> a) {
        try {
            Pst = OpenDB().prepareCall("UPDATE tb_op SET no_prod =?, tipo_op = ?, f_registro =? ,f_autorizacion =?,f_produccion=?,f_cliente =?,status= ? WHERE id_op = ?");
            Pst.setString(1, a.get(0));
            Pst.setString(2, a.get(1));
            Pst.setString(3, a.get(2));
            Pst.setString(4, a.get(3));
            Pst.setString(5, a.get(4));
            Pst.setString(6, a.get(5));
            Pst.setString(7, a.get(6));
            Pst.setString(8, a.get(7));
            Pst.execute();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            M_info aaa = new M_info();
            aaa.getInfo("AnthonyTepach");
            ResultSet q = aaa.getInfo("AnthonyTepach", "Por autorizar");
            while (q.next()) {
                System.out.println(q.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_info.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
