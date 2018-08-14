/*
 * Copyright (C) 2018 TSU.AnthonyTepach
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
 * @author AnthonyTepach
 */
public class M_Acabado extends ConexionBD {

    public int id_acabado(HashMap<String, String> data) {
        int a = 0;
        String sql = "INSERT INTO tb_acabado(tipo_acabado,id_forma) VALUES(?,?)";
        try {
            Pst = OpenDB().prepareStatement(sql);
            Pst.setString(1, data.get("tipo_acabado"));
            Pst.setInt(2, Integer.parseInt(data.get("id_forma")));
            Pst.execute();
            CloseDB();
            St = null;
            St = OpenDB().createStatement();
            Rs = St.executeQuery("select max(id_acabado) from tb_acabado where id_forma=" + data.get("id_forma"));
            while (Rs.next()) {
                a = Rs.getInt(1);
            }
            CloseDB();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            CloseDB();
        }
        return a;
    }

    public void setAcabado(HashMap<String, String> data) {
        String tip = data.get("tipo_acabado"), SQL;
        int id_acabado = id_acabado(data);
        if (tip.contains("block")) {
            try {
                SQL = "INSERT INTO tb_block VALUES(?,?,?,?,?,?)";
                Pst = OpenDB().prepareStatement(SQL);
                Pst.setInt(1, id_acabado);
                Pst.setString(2, data.get("b_cantidad"));
                Pst.setString(3, data.get("b_goma"));
                Pst.setString(4, data.get("b_tapa"));
                Pst.setString(5, data.get("b_material"));
                Pst.setString(6, data.get("b_medida"));
                Pst.execute();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                CloseDB();
            }
        } else if (tip.contains("simple")) {
            try {
                SQL = "INSERT INTO tb_simple VALUES(?,?,?,?)";
                Pst = OpenDB().prepareStatement(SQL);
                Pst.setInt(1, id_acabado);
                Pst.setString(2, data.get("s_ancho"));
                Pst.setString(3, data.get("s_paso"));
                Pst.setString(4, data.get("s_doblado"));
                Pst.execute();
                CloseDB();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                CloseDB();
            }
        } else if (tip.contains("rapido")) {
            try {
                SQL="INSERT INTO tb_rapida VALUES(?,?,?,?,?,?,?)";
                Pst=OpenDB().prepareStatement(SQL);
                Pst.setInt(1, id_acabado);
                Pst.setString(2, data.get("r_tiras"));
                Pst.setString(3, data.get("r_goma"));
                Pst.setString(4, data.get("r_engrapado"));
                Pst.setString(5, data.get("r_talon"));
                Pst.setString(6, data.get("r_material"));
                Pst.setString(7, data.get("r_medida"));
                Pst.execute();
                CloseDB();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                CloseDB();
            }

        } else if (tip.contains("rollo")) {
            try {
                  SQL="INSERT INTO tb_rollo VALUES(?,?,?,?,?,?,?)";
                Pst=OpenDB().prepareStatement(SQL);
                Pst.setInt(1, id_acabado);
                Pst.setString(2, data.get("rl_diametro"));
                Pst.setString(3, data.get("rl_cono"));
                Pst.setString(4, data.get("rl_cantidad"));
                Pst.setString(5, data.get("rl_ancho"));
                Pst.setString(6, data.get("rl_alancho"));
                Pst.setString(7, data.get("rl_tapa"));
                Pst.execute();
                CloseDB();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                CloseDB();
            }
        } else if (tip.contains("continua")) {
            try {
            } catch (Exception ex) {
            } finally {
                CloseDB();
            }
        }
    }

    public static void main(String[] args) {
        M_Acabado ma = new M_Acabado();
        HashMap<String, String> data = new HashMap<>();
        data.put("tipo_acabado", "rollo");
        data.put("id_forma", "47");
        data.put("rl_diametro", "20");
        data.put("rl_cono", "Arriba");
        data.put("rl_cantidad", "Tapa");
        data.put("rl_ancho", "Tapa");
        data.put("rl_alancho", "minagris");
        data.put("rl_tapa", "SI");
        ma.setAcabado(data);
    }
}
