/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class M_Formatos extends ConexionBD {

    public ResultSet getFamily() {
        try {
            Pst = OpenDB().prepareStatement("SELECT * FROM tb_familia_formato");
            Rs = Pst.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Rs;
    }
    public ResultSet getSubFamily(int family) {
        try {
            Pst = OpenDB().prepareStatement("SELECT * FROM tb_subfamilia_formato where id_fformato = ?");
            Pst.setInt(1, family);
            Rs = Pst.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Rs;
    }
    public ResultSet getSubFamily(String family) {
        try {
            Pst = OpenDB().prepareStatement("SELECT * FROM tb_subfamilia_formato where id_fformato = (select id_fformato from tb_familia_formato where nombre_familia = ?  )");
            Pst.setString(1, family);
           
            Rs = Pst.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Rs;
    }
   
}
