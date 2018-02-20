<%-- 
    Document   : Ver_ordenes
    Created on : 19/01/2018, 11:15:41 AM
    Author     : TI
--%>
<%@page import="com.datos.ejemplos.GenerarNumero"%>
<%@page import="com.datos.modelos.M_info"%>
<%@page import="java.sql.ResultSet"%>
<%
    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("/Folderas");

    } else {
        String t = String.valueOf(session.getAttribute("Tipo"));
        if (t.contentEquals("Administrador") || t.contentEquals("Admin")) {

        } else if (t.contentEquals("Vendedor")) {

        } else {
            response.sendRedirect("Principal.jsp");
        }

    }
    String usuario = String.valueOf(session.getAttribute("Usuario"));
    String tipo = String.valueOf(session.getAttribute("Tipo"));
    M_info mi = new M_info();
    ResultSet admin_autorizada = mi.getInfo("Autorizada");
    ResultSet admin_noautorizada = mi.getInfo("Por autorizar");
    ResultSet rs = mi.getInfo(usuario, "Por autorizar");
    ResultSet rsAuto = mi.getInfo(usuario, "Autorizada");
    GenerarNumero nop = new GenerarNumero();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>setTimeout('document.location.reload()', 60000);</script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver mis ordenes</title>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
        <jsp:include page="header.jsp" />  
        <script type="text/javascript">
            function confirma() {
             
              var a= confirm("Esta seguro");
              if(a){
                    $("#fmodal").submit();
                  }
          


            }


        </script>
    </head>
    <body>
        <nav class="navbar navbar-dark " style="background-color: #F8F8FF;">
            <!-- Navbar content -->
            <a class="navbar-brand" href="Nueva Orden.jsp">
                <img src="img/logo.png" width="300px"  alt="Responsive image">
            </a>
            <span class="navbar-text" style="color: black;">
                <a href="Principal.jsp"><button type="button" class="btn btn-primary">Regresar</button></a>
                <div class="btn-group dropleft ">
                    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        ${sessionScope.Usuario}
                    </button>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" style="color: black;" href="Logout">Cerrar Sesión</a>
                    </div>
                </div>

            </span>
        </nav>
        <div class="container">

            <br>
            <%if (tipo.contentEquals("Vendedor")) {%>

            <div class="row">
                <div class="col-sm">
                    <!--Por autorizar-->
                    <!--Fin Por autorizar-->
                </div>
                <div class="col-sm">
                    <!--Autorizadas-->
                </div>
            </div>
            <div class="table-responsive table-hover table-light">
                
                <table class="table" > 
                    <thead>
                        <tr class="badge-dark">
                            <th colspan="10"><center>Ordenes por autorizar</center></th>
                    </tr>
                    <tr class="">
                        <th>Nombre de la forma</th>
                        <th>Tipo</th>
                        <th>Agente</th>
                        <th>Cantidad</th>
                        <th>Producto</th>
                        <th>Familia </th>
                        <th>Cliente</th>
                        <th>R.F.C</th>
                    </tr>
                    </thead>
                    <tbody>
                        <% while (rs.next()) {%>
                        <tr>
                            <th><%= rs.getString(1)%></th>
                            <td><%= rs.getString(2)%></td>
                            <td><%= rs.getString(3)%> </td>
                            <td><%= rs.getString(4)%><%= rs.getString(5)%></td>
                            <td><%= rs.getString(6)%></td>
                            <td><%= rs.getString(7)%></td>
                            <td><%= rs.getString(8)%></td>
                            <td><%= rs.getString(9)%></td>
                            <!--<td><%= rs.getString(12)%></td>-->
                        </tr>
                        <%}
                        %>
                    </tbody>
                </table>
            </div>

            <br>


            <div class="table-responsive table-hover table-light">
                <table class="table" >
                    <thead>
                        <tr class="badge-dark">
                            <th colspan="8"><center>Autorizadas</center></th>
                    </tr>
                    <tr class="">

                        <th>Nombre de la forma</th>
                        <th>Tipo</th>

                        <th>Agente</th>
                        <th>Cantidad</th>
                        <th>Producto</th>
                        <th>Familia </th>
                        <th>Cliente</th>
                        <th>R.F.C</th>
                    </tr>
                    </thead>
                    <tbody>
                        <% while (rsAuto.next()) {%>
                        <tr>
                            <th><%= rsAuto.getString(1)%></th>
                            <td><%= rsAuto.getString(2)%></td>
                            <td><%= rsAuto.getString(3)%> </td>
                            <td><%= rsAuto.getString(4)%> <%= rsAuto.getString(5)%></td>
                            <td><%= rsAuto.getString(6)%></td>
                            <td><%= rsAuto.getString(7)%></td>
                            <td><%= rsAuto.getString(8)%></td>
                            <td><%= rsAuto.getString(9)%></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>


            <%} // fin del vendedor
            //inicio admin
            else if (tipo.contentEquals("Admin")) {
            %>
            <div class="table-responsive table-hover table-light">
                <table class="table">
                    <thead>
                        <tr class="badge-dark">
                            <th colspan="10"><center>Ordenes por autorizar</center></th>
                    </tr>
                    <tr class="">

                        <th>Nombre de la forma</th>
                        <th>Tipo</th>

                        <th>Agente</th>
                        <th>Cantidad</th>
                        <th>Producto</th>
                        <th>Familia </th>
                        <th>Cliente</th>
                        <th>R.F.C</th>

                    </tr>
                    </thead>
                    <tbody>

                        <% while (admin_noautorizada.next()) {%>
                        <tr>
                            <th><%= admin_noautorizada.getString(1)%></th>
                            <td><%= admin_noautorizada.getString(2)%></td>
                            <td><%= admin_noautorizada.getString(3)%> </td>
                            <td><%= admin_noautorizada.getString(4)%> <%= admin_noautorizada.getString(5)%></td>
                            <td><%= admin_noautorizada.getString(6)%></td>
                            <td><%= admin_noautorizada.getString(7)%></td>
                            <td><%= admin_noautorizada.getString(8)%></td>
                            <td><%= admin_noautorizada.getString(9)%></td>
                            
                            <td><a href="#" class="table-hover" data-toggle="modal" data-target="#<%= admin_noautorizada.getString(12)%>"><i class="material-icons" style="color: #207ab9; font-size: 36px;">more</i></a></td>

                        </tr>

                        <!-- Modal -->
                    <div class="modal fade " id="<%= admin_noautorizada.getString(12)%>" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLongTitle"><%= admin_noautorizada.getString(1)%></h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <form action="op" method="post" id="fmodal">
                                        <div class="row">
                                            <div class="col-sm">
                                                <input name="idop" value="<%= admin_noautorizada.getString(12)%>" readonly="" hidden="">
                                                <label>No.Orden de producción</label>
                                                <input type="text" name="txtno" id="txtno" class="form-control" required="" value="<%= nop.numeros()%>"> 
                                                <label>Tipo de orden</label>
                                                <select name="txttipo" class="form-control">
                                                    <option value="Nueva">Nueva</option>
                                                    <option value="Exacta">Exacta</option>
                                                    <option value="Cambios">Cambios</option>
                                                </select>
                                                <label>Entra a produccion el: </label>
                                                <input class="form-control" type="date" required="" value="31/08/1996" name="txtprod" id="txtprod">
                                            </div>
                                            <div class="col-sm">
                                                <label>Fecha de registro</label>
                                                <input class="form-control" type="date" required="" value="31/08/1996" name="txtregistro" id="txtregistro">
                                                <label>Fecha de autorización</label>
                                                <input class="form-control" type="date" required="" value="31/08/1996" name="txtautoriza" id="txtautoriza">
                                                <label>Fecha de entrega: </label>
                                                <input class="form-control" type="date" required="" value="31/08/1996" name="txtentrega" id="txtentrega">

                                            </div>
                                        </div>
                                        Reviso:  ${sessionScope.Usuario}


                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary"  data-dismiss="modal">Close</button>
                                    <button type="button" class="btn btn-primary"  id="envia" name="envia" onclick="confirma();" >Guardar</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--fin modal-->
                    <%}

                    %>
                    </tbody>
                </table>
            </div>

            <br>
            <div class="table-responsive table-hover table-light">
                <table class="table">
                    <thead>
                        <tr class="badge-dark">
                            <th colspan="9"><center>Autorizadas</center></th>
                    </tr>
                    <tr class="">

                        <th>Nombre de la forma</th>
                        <th>Tipo</th>

                        <th>Agente</th>
                        <th>Cantidad</th>
                        <th>Producto</th>
                        <th>Familia </th>
                        <th>Cliente</th>
                        <th>R.F.C</th>
                        <th>Fecha de autorización</th>
                    </tr>
                    </thead>
                    <tbody>
                        <% while (admin_autorizada.next()) {%>
                        <tr>
                            <th><%= admin_autorizada.getString(1)%></th>
                            <td><%= admin_autorizada.getString(2)%></td>
                            <td><%= admin_autorizada.getString(3)%> </td>
                            <td><%= admin_autorizada.getString(4)%> <%= admin_autorizada.getString(5)%></td>
                            <td><%= admin_autorizada.getString(6)%></td>
                            <td><%= admin_autorizada.getString(7)%></td>
                            <td><%= admin_autorizada.getString(8)%></td>
                            <td><%= admin_autorizada.getString(9)%></td>
                            <td><%= admin_autorizada.getString(13)%></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>

            <%}%>

        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
<% mi.CloseDB();%>