/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datos.modelos;

import com.datos.db.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;


/**
 *
 * @author TI
 */
public class M_Cliente extends ConexionBD {

    public ResultSet getClientes() {
        try {
            Pst = OpenDB().prepareStatement("SELECT * FROM tb_clinte");
            Rs = Pst.executeQuery();
            return Rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Rs;
    }

    public ResultSet getCLiente(int id) {
        int i = 0;
        try {
            Pst = OpenDB().prepareCall("SELECT * FROM  tb_clinte WHERE id_cleinte = ?");
            Pst.setInt(1, id);
            Rs = Pst.executeQuery();
            return Rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Rs;
    }

    public String setCliente(Hashtable d) {
        String mensaje = null;
        try {
            String SQL = "INSERT INTO tb_clinte VALUES(NULL,?,?,?,?,?,?,?,?)";
            Pst = OpenDB().prepareCall(SQL);
            Pst.setString(1, (String) d.get("rfc"));
            Pst.setString(2, (String) d.get("nombre"));
            Pst.setString(3, (String) d.get("domi"));
            Pst.setString(4, (String) d.get("ciudad"));
            Pst.setString(5, (String) d.get("estado"));
            Pst.setString(6, (String) d.get("tel"));
            Pst.setString(7, (String) d.get("dep"));
            Pst.setString(8, (String) d.get("aten"));
            Pst.execute();
            mensaje = "Exito, puedes continuar";
            return mensaje;
        } catch (SQLException ex) {

            if (ex.getMessage().contains("Duplicate entry")) {
                mensaje = "El R.F.C " + d.get("rfc") + " ingresado ya existe en la base de datos";
                return mensaje;
            }
        }
        mensaje = "Error, no se pudo ingresar";
        return mensaje;
    }

}
