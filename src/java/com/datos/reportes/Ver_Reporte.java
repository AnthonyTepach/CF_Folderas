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
package com.datos.reportes;

import com.datos.db.ConexionBD;
import java.io.File;
import java.util.HashMap;
import javax.servlet.ServletContext;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author TI
 */
public class Ver_Reporte extends ConexionBD{
    public JasperPrint  CreaReporte(ServletContext servletContext,int id) throws JRException{
        File f=new File(servletContext.getRealPath("/Foldera.jasper"));
        
        JasperReport jr =(JasperReport) JRLoader.loadObject(f);
        
        HashMap hm=new HashMap();
        hm.put("formaN",id);
        
        JasperPrint jp = JasperFillManager.fillReport(jr,hm,OpenDB());
        
        return jp;
    }
}
