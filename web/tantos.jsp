<%-- 
    Document   : tantos
    Created on : 29/01/2018, 07:57:30 AM
    Author     : TI
--%>
<%
    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("/Folderas");
    }
    String id_forma = request.getParameter("idf");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <META name="Author" lang="MX" content="AnthonyTepach">
        <META name="copyright" content="&copy; 2018 ComputerForms.">
        <title>Tantos</title>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
        <jsp:include page="header.jsp" />
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
            
            <form method="post" action="Svl_tantos">
                <div class="row">
                    <input type="text" name="txtidf" value="<%=id_forma%>" hidden="">
                    <div class="col-sm">
                        <label class="form-check-label">Plecas:</label>
                        <select name="txtpleca" class="form-control">
                            <option value="Ninguna">Ninguna</option>
                            <option value="6 Dientes">6 Dientes</option>
                            <option value="8 Dientes">8 Dientes</option>
                            <option value="10 Dientes">10 Dientes</option>
                            <option value="Corte Fino">Corte fino</option>
                            <option value="Enlace Abierto">Enlace abierto</option>
                            <option value="Doblez">Doblez</option>
                        </select>
                    </div>
                    <div class="col-sm">
                        <label class="form-check-label">Carretillas</label>
                        <select name="txtcarr" class="form-control">
                            <option value="Ninguna">Ninguna</option>
                            <option value="4 Dientes">4 Dientes</option>
                            <option value="6 Dientes">6 Dientes</option>
                            <option value="8 Dientes">8 Dientes</option>
                            <option value="10 Dientes">10 Dientes</option>
                            <option value="Corte Fino">Corte fino</option>
                            <option value="Enlace Abierto">Enlace abierto</option>
                        </select>
                    </div>
                </div>
                <fieldset>
                    <legend>Tanto N° 1</legend>
                    <div class="row">
                        <div class="col-sm-1">
                            <label>Tiros</label>
                            <input type="text" class="form-control" name="txttiros" id="txttiros" required="">
                        </div>
                        <div class="col-sm-2">
                            <label>Color</label>
                            <input type="text" class="form-control" required="" name="txtcolor" id="txtcolor">
                        </div>
                        <div class="col-sm-1">
                            <label>Peso</label>
                            <input type="text" class="form-control" required="" name="txtpeso" id="txtpeso">
                        </div>
                        <div class="col-sm-2">
                            <label>Calidad</label>
                            <input type="text" class="form-control" required=""name="txtcalidad" id="txtcalidad">
                        </div>
                        <div class="col-sm-1" >
                            <label>Carbón</label>
                            <select class="form-control"id="selcarbon" name="selcarbon">
                                <option value="Si">Si</option>
                                <option value="No">No</option>
                            </select>
                        </div>
                        <div class="col-sm-1">
                            <label>Ancho</label>
                            <input type="text" name="txtancho" id="txtancho" class="form-control" required="">

                        </div>
                        <div class="col-sm-1" >
                            <label>Largo</label>
                            <input type="text" name="txtlargo" id="txtlargo"class="form-control" required="">
                        </div>
                        <div class="col-sm">
                            Perforaciones.
                            <div class="row">
                                <br>
                                <div class="col-sm">
                                    <input type="text" class="form-control" required="" placeholder="H" name="txtph" id="txtph">
                                </div>
                                <div class="col-sm">
                                    <input type="text" class="form-control" required="" placeholder="V" name="txtpv" id="txtpv">
                                </div>
                            </div>
                        </div>

                    </div>

                    <div class="row">
                        <div class="col-sm">
                            <label>Cambios en los tantos</label>
                            <input type="text" class="form-control" required="" name="txtcambio"  id="txtcambio">
                        </div>
                        <div class="col-sm">
                            <label>Tiras marginales</label>
                            <select class="form-control" id="seltiras" name="seltiras">
                                <option value="Si">Si</option>
                                <option value="No">No</option>
                            </select>
                        </div>
                        <div class="col-sm">
                            <label>Nombre</label>
                            <input type="text" class="form-control" required="" name="txtnomM" id="txtnomM">                        
                        </div>
                        <div class="col-sm">
                            <label>Ubicación</label>
                            <input type="text" class="form-control" required="" id="txtubica" name="txtubica">
                        </div>
                    </div>
                </fieldset>
                <br>
                <div id="more">

                </div>
                <br>
                <input type="Button" value="Agregar Aplicación" class="btn btn-outline-success" onclick="agregar_alternativa()"/>
                <input type="submit" value="Guardar" class="btn btn-outline-primary"/>
                <script type="text/javascript">
                    function agregar_alternativa() {
                        var op = ["Si", "No"];

                        var fieldset = document.getElementById("more");
                        var inputs = document.getElementsByName("txttiros");

                        var contenedor = document.createElement("fieldset");
                        var legen = document.createElement("legend");
                        legen.textContent = "Tanto N° " + (inputs.length + 1);
                        contenedor.appendChild(legen);


                        var row1 = document.createElement("div");
                        row1.className = "row";
                        var row2 = document.createElement("div");
                        row2.className = "row";

                        var tiros = document.createElement("input");
                        tiros.className = "form-control form-text";
                        tiros.name = "txttiros";
                        tiros.id = "txttiros" + (inputs.length + 1);
                        tiros.placeholder = "Tiros";

                        var divtiro = document.createElement("div");
                        divtiro.className = "col-sm-1";
                        divtiro.appendChild(tiros);

                        var color = document.createElement("input");
                        color.className = "form-control form-text";
                        color.name = "txtcolor";
                        color.id = "txtcolor" + (inputs.length + 1);
                        color.placeholder = "Color";

                        var divcolor = document.createElement("div");
                        divcolor.className = "col-sm-2";
                        divcolor.appendChild(color);

                        var peso = document.createElement("input");
                        peso.className = "form-control form-text";
                        peso.name = "txtpeso";
                        peso.id = "txtpeso" + (inputs.length + 1);
                        peso.placeholder = "Peso";

                        var divpeso = document.createElement("div");
                        divpeso.className = "col-sm-1";
                        divpeso.appendChild(peso);

                        var calidad = document.createElement("input");
                        calidad.className = "form-control form-text";
                        calidad.name = "txtcalidad";
                        calidad.id = "txtcalidad" + (inputs.length + 1);
                        calidad.placeholder = "Calidad";

                        var divcal = document.createElement("div");
                        divcal.className = "col-sm-2";
                        divcal.appendChild(calidad);

                        var carbon = document.createElement("select");
                        carbon.className = "form-control form-text";
                        carbon.name = "selcarbon";
                        carbon.id = "selcarbon" + (inputs.length + 1);

                        for (var i = 0; i < op.length; i++) {
                            var option = document.createElement("option");
                            option.value = op[i];
                            option.text = op[i];
                            carbon.appendChild(option);
                        }

                        var divcarbon = document.createElement("div");
                        divcarbon.className = "col-sm-1";
                        divcarbon.appendChild(carbon);

                        var ancho = document.createElement("input");
                        ancho.className = "form-control form-text";
                        ancho.name = "txtancho";
                        ancho.id = "txtancho" + (inputs.length + 1);
                        ancho.placeholder = "Ancho";
                        
                        var divancho = document.createElement("div");
                        divancho.className = "col-sm-1";
                        divancho.appendChild(ancho);
                        
                        var largo = document.createElement("input");
                        largo.className = "form-control form-text";
                        largo.name = "txtlargo";
                        largo.id = "txtlargo" + (inputs.length + 1);
                        largo.placeholder = "Largo";
                        
                        var divlargo = document.createElement("div");
                        divlargo.className = "col-sm-1";
                        divlargo.appendChild(largo);
                        
                        var ph = document.createElement("input");
                        ph.className = "form-control form-text";
                        ph.name = "txtph";
                        ph.id = "txtph" + (inputs.length + 1);
                        ph.placeholder = "H";
                        
                        var divph = document.createElement("div");
                        divph.className = "col-sm";
                        divph.appendChild(ph);
                        
                        var pv = document.createElement("input");
                        pv.className = "form-control form-text";
                        pv.name = "txtpv";
                        pv.id = "txtpv" + (inputs.length + 1);
                        pv.placeholder = "V";
                        
                        var divpv = document.createElement("div");
                        divpv.className = "col-sm";
                        divpv.appendChild(pv);
                        
                        var cambio = document.createElement("input");
                        cambio.className = "form-control form-text";
                        cambio.name = "txtcambio";
                        cambio.id = "txtcambio" + (inputs.length + 1);
                        cambio.placeholder = "Cambio entre tantos";
                        
                        var divcambio = document.createElement("div");
                        divcambio.className = "col-sm";
                        divcambio.appendChild(cambio);
                        
                         var tiras = document.createElement("select");
                        tiras.className = "form-control form-text";
                        tiras.name = "seltiras";
                        tiras.id = "seltiras" + (inputs.length + 1);

                        for (var i = 0; i < op.length; i++) {
                            var option2 = document.createElement("option");
                            option2.value = op[i];
                            option2.text = op[i];
                            tiras.appendChild(option2);
                        }
                        var divtiras = document.createElement("div");
                        divtiras.className = "col-sm";
                        divtiras.appendChild(tiras);
                        
                        var nomm = document.createElement("input");
                        nomm.className = "form-control form-text";
                        nomm.name = "txtnomM";
                        nomm.id = "txtnomM" + (inputs.length + 1);
                        nomm.placeholder = "Nombre";
                        
                        var divnomm = document.createElement("div");
                        divnomm.className = "col-sm";
                        divnomm.appendChild(nomm);
                        
                        var ubica = document.createElement("input");
                        ubica.className = "form-control form-text";
                        ubica.name = "txtubica";
                        ubica.id = "txtubica" + (inputs.length + 1);
                        ubica.placeholder = "Ubicacion";
                        
                        var divubica = document.createElement("div");
                        divubica.className = "col-sm";
                        divubica.appendChild(ubica);
                        
                        var btnRemove = document.createElement("input");
                        btnRemove.type = "button";
                        btnRemove.value = "Quitar";
                        btnRemove.className = "btn btn-outline-danger";
                        
                        row1.appendChild(divtiro);
                        row1.appendChild(divcolor);
                        row1.appendChild(divpeso);
                        row1.appendChild(divcal);
                        row1.appendChild(divcarbon);
                        row1.appendChild(divancho);
                        row1.appendChild(divlargo);
                        row1.appendChild(divph);
                        row1.appendChild(divpv);
                        
                        row2.appendChild(divcambio);
                        row2.appendChild(divtiras);
                        row2.appendChild(divnomm);
                        row2.appendChild(divubica);
                        
                        contenedor.appendChild(row1);
                        contenedor.appendChild(row2);
                        contenedor.appendChild(btnRemove);
                        
                        fieldset.appendChild(contenedor);


                     
                        btnRemove.onclick = function () {
                            var elem = this.parentNode;
                            elem.parentNode.removeChild(elem);
                        };


                    }
                </script> 
            </form>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
