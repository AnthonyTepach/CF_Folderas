<%-- 
    Document   : Dinamico
    Created on : 18/01/2018, 10:26:25 AM
    Author     : TI
--%>
<%@page import="com.datos.modelos.M_AplicacionesE"%>
<%@page import="java.util.HashMap"%>
<%
    String clave[] = request.getParameterValues("txtclave");
    String desc[] = request.getParameterValues("txtdesc");
    String ancho[] = request.getParameterValues("txtancho");
    String alcto[] = request.getParameterValues("txtalto");
    String canti[] = request.getParameterValues("txtcant");
    String obser[] = request.getParameterValues("txtobs");
    String cli = request.getParameter("txtnomcli");
    String id_forma = request.getParameter("idforma");
    HashMap<String, String> data = new HashMap<String, String>();
    M_AplicacionesE mae = new M_AplicacionesE();
    data.put("idform", id_forma);
    data.put("cliente", cli);

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>N° de Aplicaciones</th>
                    <th>Clave</th>
                    <th>Decripcion</th>
                    <th>Ancho</th>
                    <th>Largo</th>
                    <th>Cantidad</th>
                    <th>Observaciones</th>
                    <th>Cliente</th>
                    <th>Id_forma</th>

                </tr>
            </thead>
            <tbody>
                <%                    for (int i = 0; i < clave.length; i++) {
                        data.put("clave", clave[i]);
                        data.put("desc", desc[i]);
                        data.put("ancho", ancho[i]);
                        data.put("largo", alcto[i]);
                        data.put("cantidad", canti[i]);
                        data.put("obs", obser[i]);
                        //System.out.println(data);
                        System.out.println(mae.setAE(data));
                        mae.CloseDB();
                        
                %>

                <%}
                    response.sendRedirect("/Folderas/tantos.jsp?idf="+id_forma);
                %>
            </tbody>
        </table>


    </body>
</html>
