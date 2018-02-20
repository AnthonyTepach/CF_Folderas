<%-- 
    Document   : Cliente
    Created on : 16/01/2018, 09:45:11 AM
    Author     : TI
--%>
<%@page import="com.datos.modelos.M_Cliente"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.datos.modelos.M_Formatos"%>
<%
    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("/Folderas");
    }
    M_Formatos mf = new M_Formatos();
    ResultSet Family = mf.getFamily();
    int sf = 0;
%>
<%
    String clie = request.getParameter("es");
    if (clie.contains("Nuevo")) {
%>
<form method="POST" action="ClienteNuevo">
    <input type="text"  class="form-control form-text" id="txtcliente"  name="txtcliente" placeholder="Nombre del cliente" required="">
    <input type="text"  class="form-control form-text" id="txtrfc"  name="txtrfc" placeholder="R.F.C" required="">
    <label>Domicilio</label>
    <input type="text"  class="form-control form-text" id="txtdomi"  name="txtdomi" placeholder="Domicilio" required="">
    <div class="row">
        <div class="col-sm">
            <input type="text"  class="form-control form-text" id="txtcui"  name="txtcui" placeholder="Ciudad" required="">
        </div>
        <div class="col-sm">
            <input type="text"  class="form-control form-text" id="txtEstado"  name="txtEstado" placeholder="Estado" required="">
        </div>
    </div>
    <div class="row">
        <div class="col-sm">
            <input type="tel"  class="form-control form-text" id="txttel"  name="txttel" placeholder="Télefono" required="">
        </div>
        <div class="col-sm">
            <input type="text"  class="form-control form-text" id="txtdep"  name="txtdep" placeholder="Departamento" required="">
        </div>
    </div>
    <input type="text"  class="form-control form-text" id="txtatiende"  name="txtatiende" placeholder="Atencion" required="">
    <br>
    <input type="submit" class="btn btn-primary btn-outline-primary" value="Guardar">
</form>
<%} else if (clie.contains("Existente")) {%>
<%
    M_Cliente mc = new M_Cliente();
    ResultSet rs = mc.getClientes();

%>
<script type=text/javascript>
    SubFamily();
</script>
<form method="Post" action="NuevaForma">
    <select class="custom-select mr-sm-2" id="idcliente" name='idcliente'>
        <%while (rs.next()) {%>
        <option value="<%= rs.getString(1)%>"><%=rs.getString(3)%></option>
        <%}
            mc.CloseDB();
        %>
    </select>
    <div class="row">
        <div class="col-sm">
            <fieldset>
                <div id="Familia" >
                    <legend>Formato</legend>
                    <select class="custom-select mr-sm-2" id="idFamily" name='idFamily' onchange="SubFamily();">
                        <%while (Family.next()) {%>
                        <option value="<%= Family.getString(2)%>"><%=Family.getString(2)%></option>
                        <%}
                            mf.CloseDB();
                        %>
                    </select>
                </div>
                <div id="destino">
                </div>
            </fieldset>
            <div class="row">
                <div class="col-sm">
                    <label>Nombre de la forma</label>
                    <input type="text"  class="form-control form-text" id="txtnom"  name="txtnom" placeholder="Nombre de la forma" required="">
                </div>
               
            </div>

            <div class="row">
                 <div class="col-sm">
                    <label>Tiempos de entrega</label>
                    <select class="custom-select mr-sm-2" id="tipentr" name='tipentr'>
                        <option value="Rush">Rush (24 a 72 hrs.)</option>
                        <option value="1 Semana">1 Semana</option>
                        <option value="2 Semanas">2 Semanas</option>
                        <option value="3 Semanas">3 Semanas</option>
                        <option value="Reproceso">Reproceso (sólo con autorización)</option>
                        
                    </select>
                </div>
                <div class="col-sm-3">
                    <label>Ancho</label>
                    <input type="text"  class="form-control form-text" id="txtancho"  name="txtancho" placeholder="Ancho" required="">
                </div>
                <div class="col-sm-3">
                    <label>Largo</label>
                    <input type="text" class="form-control form-text" id="txtlargo" name="txtlargo" placeholder="Largo" required="">
                </div>
            </div>
        </div>
        <div class="col-sm">
            <br>
            <div class="row">
                <div class="col-sm">
                    <div class="row">
                        <div class="col-sm">
                            <label>Nombre del agente</label>
                            <input type="text" class="form-control form-text" id="txtagente" name="txtagente" placeholder="Nombre del agente" required="" value="${sessionScope.Usuario}">
                        </div>
                        <div class="col-sm">
                            <label>Elaboro O.P</label>
                            <input type="text" class="form-control form-text" id="txtelaboro" name="txtelaboro" placeholder="Elaboro O.P" required="" value="${sessionScope.Usuario}">
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-sm">
                            <label>Orden de producción anterior</label>
                            <input type="text" class="form-control form-text" id="txtopa" name="txtopa" placeholder="O.P. Anterior" >
                        </div>
                        <div class="col-sm">
                            <label>N° Cotización</label>
                            <input type="text" onKeyPress="return soloNumeros(event)"  class="form-control form-text" id="txtcoti" name="txtcoti" placeholder="N°Cotización" required="">
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">

                <div class="col-sm">
                    <label>Cantidad</label>
                    <input type="text" onKeyPress="return soloNumeros(event)"  class="form-control form-text" id="txtcanti" name="canti" placeholder="Cantidad" required="">
                </div>
                <div class="col-sm">
                    <label>Unidad</label>
                    <select class="custom-select mr-sm-2" id="unidad" name='unidad'>
                        <option value="Millar(es)">Millar(es)</option>
                        <option value="Pieza(s) ">Pieza(s)</option>
                    </select>
                </div>
            </div>

            <br>
        </div>
    </div>
    <input type="submit" value="Siguiente" class="btn btn-outline-primary valid-tooltip">
</form>
<%}%>