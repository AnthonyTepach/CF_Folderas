package com.datos.modelos;

import com.datos.db.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class M_Users extends ConexionBD {

    public ArrayList gerUser(String u, String p) {
        ArrayList<String> user = new ArrayList<>();

        try {
            Pst = OpenDB().prepareStatement("SELECT USER_NAME, PASSWORD FROM USER WHERE USER_NAME = ? AND PASSWORD = ?");
            Pst.setString(1, u);
            Pst.setString(2, p);
            Rs = Pst.executeQuery();
            while (Rs.next()) {
                user.add(Rs.getString(1));

            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        }
        return user;
    }

    public ArrayList gerPass(String u, String p) {

        ArrayList<String> pass = new ArrayList<>();
        try {
            Pst = OpenDB().prepareStatement("SELECT USER_NAME, PASSWORD FROM USER WHERE USER_NAME = ? AND PASSWORD = ?");
            Pst.setString(1, u);
            Pst.setString(2, p);
            Rs = Pst.executeQuery();
            while (Rs.next()) {

                pass.add(Rs.getString(2));
            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        }
        return pass;
    }
    
    public ArrayList gerTipo(String u, String p) {

        ArrayList<String> tipo = new ArrayList<>();
        try {
            Pst = OpenDB().prepareStatement("SELECT USER_NAME, PASSWORD, AREA FROM USER WHERE USER_NAME = ? AND PASSWORD = ?");
            Pst.setString(1, u);
            Pst.setString(2, p);
            Rs = Pst.executeQuery();
            while (Rs.next()) {

                tipo.add(Rs.getString(3));
            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        }
        return tipo;
    }

}
