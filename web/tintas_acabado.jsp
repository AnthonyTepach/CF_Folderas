<%-- 
    Document   : tintas_acabado
    Created on : 15/02/2018, 08:13:12 AM
    Author     : AnthonyTepach
--%>
<%
    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("/Folderas");
    }
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
                <div class="col-sm">
                    <fieldset id="tintas">
                        <legend>Color de tinta</legend>
                        <form action="action">
                            <div class="row">
                                <div class="col-sm-2">
                                    <br>
                                    <label class="form-check-label">N° tanto</label>
                                    <input type="text" name="txttanto" id="txtfrente" class="form-control">
                                </div>
                                <div class="col-sm">
                                    <label class="form-check-label">Frente (N°pantone)</label>
                                    <input type="text" name="txtfrente" id="txtfrente" class="form-control">
                                </div>
                                <div class="col-sm">
                                    <label class="form-check-label">Reverso (N°pantone)</label>
                                    <input type="text" name="txtfrente" id="txtfrente" class="form-control">
                                </div>
                                <div class="col-sm">
                                    <br>
                                    <label class="form-check-label">Barniz</label>
                                    <input type="text" name="txtberniz" id="txtbarniz" class="form-control">
                                </div>
                                <div class="col-sm">
                                    <br>
                                    <label class="form-check-label">Pantalla<br></label>
                                    <input type="text" name="txtpantalla" id="txtpantalla" class="form-control">
                                </div>
                            </div>
                        </form>
                    </fieldset>
                </div>
               
                <div class="col-sm-4" id="divacabado">
                    <fieldset>
                        <legend>Acabado</legend>
                        <br><br>
                        <select class="form-control form-control-range" id="tipo_acabado" onchange="cargaform();">
                            <option value="continua">FORMA CONTINUA</option>
                            <option value="block">EN BLOCK</option>
                            <option value="simple">FORMA SIMPLE</option>
                            <option value="rapido">JUEGO RÁPIDO</option>
                            <option value="rollo">EN ROLLO</option>
                        </select>
                    </fieldset>
                    <div id="acabadoDinamico">
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
