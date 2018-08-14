<%-- 
    Document   : tintas_acabado
    Created on : 15/02/2018, 08:13:12 AM
    Author     : AnthonyTepach
--%>
<%
    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("/Folderas");
    }
    String formaid = request.getParameter("id");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tintas y Acabado</title>
        <jsp:include page="header.jsp" />  

    </head>
    <body>
        
        <nav class="navbar navbar-dark " style="background-color: #F8F8FF;">
            <!-- Navbar content -->
            <a class="navbar-brand" href="Principal.jsp">
                <img src="img/logo.png" width="300px"  alt="Responsive image">
            </a>
            <span class="navbar-text" style="color: black;">
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
            <br>
            <div class="row">
                <div class="col-sm"  id="restinta">
                    <form action="#" id="enviaForms" method="post">
                        <fieldset id="tintas">
                            <legend>Color de tinta</legend>

                            <div class="row">
                                <div class="col-sm-2">
                                    <br>
                                    <label class="form-check-label">N° tanto</label>
                                    <input type="text" name="txttanto" id="txtfrente" class="form-control" value="1">
                                </div>
                                <div class="col-sm">
                                    <label class="form-check-label">Frente (N°pantone)</label>
                                    <input type="text" name="txtfrente" id="txtfrente" class="form-control">
                                </div>
                                <div class="col-sm">
                                    <label class="form-check-label">Reverso (N°pantone)</label>
                                    <input type="text" name="txtreverso" id="txtfrente" class="form-control">
                                </div>
                                <div class="col-sm">
                                    <br>
                                    <label class="form-check-label">Barniz</label>
                                    <input type="text" name="txtbarniz" id="txtbarniz" class="form-control">
                                </div>
                                <div class="col-sm">
                                    <br>
                                    <label class="form-check-label">Pantalla<br></label>
                                    <input type="text" name="txtpantalla" id="txtpantalla" class="form-control">
                                </div>
                            </div>
                            <br>    
                            <input type="Button" value="Agregar Tinta" class="btn btn-outline-success" onclick="agregar_alternativa()"/>
                            <input type="button" value="Guardar" class="btn btn-outline-primary" onclick="guardarTintas();"/>


                            <script type="text/javascript">
                                function guardarTintas() {
                                    var datos = $('#enviaForms').serialize();
                                    var forma = datos + "&idforma=<%=formaid%>";
                                    $.ajax({
                                        type: "POST",
                                        url: "Svl_tintas",
                                        data: forma,
                                        success: function (data)
                                        {
                                            $("#restinta").html(data);
                                        }
                                    });


                                }
                            </script>
                            <script type="text/javascript">
                                function agregar_alternativa() {

                                    var fieldset = document.getElementById("tintas");
                                    var inputs = document.getElementsByName("txttanto");
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
                                    tiros.name = "txttanto";
                                    tiros.id = "txttanto" + (inputs.length + 1);
                                    tiros.value = (inputs.length + 1);
                                    tiros.placeholder = "Tanto n°" + (inputs.length + 1);

                                    var divtiro = document.createElement("div");
                                    divtiro.className = "col-sm-2";
                                    divtiro.appendChild(tiros);

                                    var color = document.createElement("input");
                                    color.className = "form-control form-text";
                                    color.name = "txtfrente";
                                    color.id = "txtfrente" + (inputs.length + 1);
                                    color.placeholder = "Pantone frontal";

                                    var divcolor = document.createElement("div");
                                    divcolor.className = "col-sm";
                                    divcolor.appendChild(color);

                                    var peso = document.createElement("input");
                                    peso.className = "form-control form-text";
                                    peso.name = "txtreverso";
                                    peso.id = "txtreverso" + (inputs.length + 1);
                                    peso.placeholder = "Pantone reverso";

                                    var divpeso = document.createElement("div");
                                    divpeso.className = "col-sm";
                                    divpeso.appendChild(peso);

                                    var calidad = document.createElement("input");
                                    calidad.className = "form-control form-text";
                                    calidad.name = "txtbarniz";
                                    calidad.id = "txtbarniz" + (inputs.length + 1);
                                    calidad.placeholder = "Barniz";

                                    var divcal = document.createElement("div");
                                    divcal.className = "col-sm";
                                    divcal.appendChild(calidad);

                                    var ancho = document.createElement("input");
                                    ancho.className = "form-control form-text";
                                    ancho.name = "txtpantalla";
                                    ancho.id = "txtpantalla" + (inputs.length + 1);
                                    ancho.placeholder = "Pantalla";

                                    var divancho = document.createElement("div");
                                    divancho.className = "col-sm";
                                    divancho.appendChild(ancho);

                                    var btnRemove = document.createElement("input");
                                    btnRemove.type = "button";
                                    btnRemove.value = "Quitar";
                                    btnRemove.className = "btn btn-outline-danger";

                                    row1.appendChild(divtiro);
                                    row1.appendChild(divcolor);
                                    row1.appendChild(divpeso);
                                    row1.appendChild(divcal);
                                    row1.appendChild(divancho);
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
                        </fieldset>
                    </form>
                </div>
                <div class="col-sm-4" id="divacabado">
                    <fieldset>
                        <legend>Acabado</legend>
                        <br><br>
                        <input type="text" value="<%=formaid%>" id="qwerty" class="qwerty" name="qwerty" hidden=""/>
                        <select class="form-control form-control-range" id="tipo_acabado" onchange="cargaform();">  
                            <option value="simple">FORMA SIMPLE</option>
                            <option value="block">EN BLOCK</option>
                            <option value="rapido">JUEGO RÁPIDO</option>
                            <option value="rollo">EN ROLLO</option>
                            <option value="continua">FORMA CONTINUA</option>
                        </select>
                    </fieldset>
                    <div id="acabadoDinamico">
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
