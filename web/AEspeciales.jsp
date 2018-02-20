<%-- 
    Document   : AEspeciales
    Created on : 17/01/2018, 04:51:56 PM
    Author     : TI
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.datos.modelos.M_Cliente"%>
<%
    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("/Folderas");

    }
    String mensaje = request.getParameter("m");
    String ic = request.getParameter("ic");
    String iff = request.getParameter("if");
    M_Cliente a = new M_Cliente();
    ResultSet Rs = a.getCLiente(Integer.parseInt(ic));
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicaciones Especiales</title>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
        <jsp:include page="header.jsp" />  
        <script type="text/javascript">

            function cargaAE(clave, elemeto) {
                var cla = document.getElementById(clave);
                var ele = document.getElementById(elemeto);
                $.ajax({//Comunicación jQuery hacia JSP
                    type: "GET",
                    url: "otros/ap.jsp",
                    data: "cla=" + cla.value,
                    success: function (msg) {
                        $("#" + elemeto).val(msg)
                    },
                    error: function (xml, msg) {
                        $("#" + elemeto).text(" Error");
                    }
                });
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
            <form action="otros/Dinamico.jsp" method="get">
                <div class="row">
                    <div class="col-sm"><br>
                        <%while (Rs.next()) {%>
                        <input type="text"  class="form-control form-text" id="txtnomcli"  name="txtnomcli" placeholder="Cliente" required="" value="<%=Rs.getString(3)%>" hidden="">
                        <%}
                            a.CloseDB();
                        %>
                        <input type="text"  class="form-control form-text" id="idforma"  name="idforma" placeholder="Id_Forma" required="" value="<%=iff%>" hidden="" >
                    </div>
                </div>
                <div class="row">


                    <div class="col-sm">
                        <fieldset id="alternativas">
                            <legend>Aplicaciones Especiales</legend>
                            <div class="row btn-group">
                                <div class="col-sm">
                                    <label>Clave</label>
                                    <input type="Text" onkeypress="return soloNumeros(event)" value="0" id="txtclave" class="form-control form-text" name="txtclave" onkeyup="cargaAE('txtclave', 'txtdesc');"/>
                                </div>
                                <div class="col-sm-4">
                                    <label>Descripción</label>
                                    <input type="Text" id="txtdesc" class="form-control form-text" name="txtdesc"/>
                                </div>
                                <div class="col-sm">
                                    <label>Ancho</label>
                                    <input type="Text" id="txtancho" class="form-control form-text" name="txtancho"/>
                                </div>
                                <div class="col-sm">
                                    <label>Largo</label>
                                    <input type="Text" id="txtalto" class="form-control form-text" name="txtalto"/>
                                </div>
                                <div class="col-sm">
                                    <label>Cantidad</label>
                                    <input type="Text" id="txtcant" class="form-control form-text" name="txtcant" onkeypress=" return soloNumeros(event);"/>
                                </div>
                                <div class="col-sm">
                                    <label>Observaciones</label>
                                    <input type="Text" id="txtobs" class="form-control form-text" name="txtobs" />
                                </div>
                            </div>
                        </fieldset> 
                        <br>
                        <input type="Button" value="Agregar Aplicación" class="btn btn-outline-success" onclick="agregar_alternativa()"/>
                        <input type="submit" value="Guardar" class="btn btn-outline-primary"/>
                        <script type="text/javascript">
                            function agregar_alternativa() {
                                var fieldset = document.getElementById("alternativas");
                                var inputs = document.getElementsByName("txtclave");

                                var br = document.createElement("br");
                                var desc = document.createElement("input");
                                var clave = document.createElement("input");
                                var ancho = document.createElement("input");
                                var largo = document.createElement("input");
                                var cantidad = document.createElement("input");
                                var observ = document.createElement("input");
                                var grp = document.createElement("div");
                                var divRow = document.createElement("div");
                                var divcol3 = document.createElement("div");
                                var divcol = document.createElement("div");
                                var divancho = document.createElement("div");
                                var divlargo = document.createElement("div");
                                var divcantidad = document.createElement("div");
                                var boton = document.createElement("div");
                                 var obs = document.createElement("div");
                                divRow.className = "row";

                                divcol.className = "col-sm-4";
                                divcol3.className = "col-sm";
                                divancho.className = "col-sm";
                                divlargo.className = "col-sm";
                                divcantidad.className = "col-sm";
                                obs.className = "col-sm";
                                boton.className = "col-sm-2";
                                ancho.className = "form-control form-text";
                                ancho.name = "txtancho";
                                ancho.id = "txtancho" + (inputs.length + 1);
                                ancho.placeholder = "Ancho";

                                largo.className = "form-control form-text";
                                largo.name = "txtalto";
                                largo.id = "txtalto" + (inputs.length + 1);
                                largo.placeholder = "Largo";
                                
                                observ.className="form-control form-text";
                                observ.name="txtobs";
                                observ.id="txtobs"+(inputs.length+1);
                                observ.placeholder="Observaciones";
                                
                                cantidad.className = "form-control form-text";
                                cantidad.name = "txtcant";
                                cantidad.id = "txtcant" + (inputs.length + 1);
                                cantidad.placeholder = "Cantidad";
                                cantidad.onkeypress = function (event) {
                                    return soloNumeros(event);
                                };
                                
                                
                                clave.className = "form-control form-text";
                                clave.name = "txtclave";
                                clave.id = "txtclave" + (inputs.length + 1);
                                clave.placeholder = "Clave";
                                clave.value = (inputs.length + 1);
                                clave.onkeyup = function () {
                                    var a = inputs.length;

                                    cargaAE("txtclave" + a, "txtdesc" + a);
                                };
                                clave.onkeypress = function (event) {
                                    return soloNumeros(event);
                                };
                                clave.onfocus=function (){
                                    var a = inputs.length;
                                    cargaAE("txtclave" + a, "txtdesc" + a);
                                };
                                
                                desc.className = "form-control form-text";
                                desc.name = "txtdesc";
                                desc.id = "txtdesc" + (inputs.length + 1);
                                desc.placeholder = "Descripción";


                                var btnRemove = document.createElement("input");
                                btnRemove.type = "button";
                                btnRemove.value = "Quitar";
                                btnRemove.className = "btn btn-outline-danger";


                                divcol3.appendChild(clave);
                                divcol.appendChild(desc);
                                divancho.appendChild(ancho);
                                divlargo.appendChild(largo);
                                divcantidad.appendChild(cantidad);
                                obs.appendChild(observ);
                                
                                divRow.appendChild(divcol3);
                                divRow.appendChild(divcol);
                                divRow.appendChild(divancho);
                                divRow.appendChild(divlargo);
                                divRow.appendChild(divcantidad);
                                divRow.appendChild(obs);
                                divRow.appendChild(btnRemove);
                                fieldset.appendChild(divRow);
                                
                                btnRemove.onclick = function () {
                                    var elem = this.parentNode;
                                    elem.parentNode.removeChild(elem);
                                };
                                

                            }
                        </script> 

                    </div>  

                </div>
            </form>


        </div>
        <jsp:include page="footer.jsp"/>
    </body> 
    <%

        if (!mensaje.isEmpty()) {


    %>
    <script type="text/javascript" >

        alert("<%=mensaje%>");

    </script>

    <%}%>
</html>
