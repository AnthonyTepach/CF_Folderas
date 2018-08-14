<%-- 
    Document   : caja_empaque
    Created on : 28/02/2018, 07:57:37 AM
    Author     : inspector
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
        <title>Caja y Empaque</title>
        <jsp:include page="header.jsp" /> 
    </head>
    <nav class="navbar navbar-dark " style="background-color: #F8F8FF;">
        <!-- Navbar content -->
        <a class="navbar-brand" href="Nueva Orden.jsp">
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
    <body>
        <div class="container">
            <br>
            <fieldset> 


                <div class="row">
                    <div class="col-sm">
                        <fieldset>
                            <legend>Empaque</legend>
                            <form action="">
                                <div class="row">
                                    <div class="col-sm">
                                        <label class="form-text progress-bar-animated">Tipo de empaque</label>
                                        <li><input type="radio" name="tempaque" id="tempaque" value="Fajilla" /><label for="tempaque">&nbsp;Fajilla</label></li>
                                        <li><input type="radio" name="tempaque" id="tempaque2" value="Paquete" /><label for="tempaque2">&nbsp;Paquete</label></li>
                                        <br>
                                        <label>Etiqueta de datos</label>
                                        <li><input type="radio" name="e_eti" id="e_eti" value="Si" /><label for="e_eti">&nbsp;Si</label></li>
                                        <li><input type="radio" name="e_eti" id="e_eti2" value="No" /><label for="e_eti2">&nbsp;No</label></li>
                                    </div>
                                    <div class="col-sm">
                                        <label class="form-text">Cantidad</label>
                                        <input type="text" class="form-control" name="cantidadE" id="cantidadE" onkeypress="return soloNumeros(event)">
                                        <br>
                                        <label>Termo plastificado</label>
                                        <li><input type="radio" name="e_terno" id="e_termo" value="Si" /><label for="e_termo">&nbsp;Si</label></li>
                                        <li><input type="radio" name="e_terno" id="e_termo1" value="No" /><label for="e_termo1">&nbsp;No</label></li>
                                        <li><input type="radio" name="e_terno" id="e_termo2" value="Con soporte" /><label for="e_termo2">&nbsp;Con soporte</label></li>
                                    </div>
                                </div>
                            </form>
                        </fieldset>
                    </div>
                    <div class="col-sm">
                        <fieldset>
                            <legend>Caja</legend>
                            <form action="">
                                <div class="row">
                                    <div class="col-sm">
                                        <label class="form-text">Tipo de caja</label>
                                        <li><input type="radio" name="c_tipo" id="c_tipo" value="Blanca" /><label for="c_tipo">&nbsp;Blanca</label></li>
                                        <li><input type="radio" name="c_tipo" id="c_tipo2" value="Impresa" /><label for="c_tipo2">&nbsp;Impresas</label></li>
                                        <br>

                                    </div>
                                    <div class="col-sm">
                                        <label class="form-text">Etiqueta de datos</label>
                                        <li><input type="radio" name="c_datos" id="c_datos" value="Si" /><label for="c_datos">&nbsp;Si</label></li>
                                        <li><input type="radio" name="c_datos" id="c_datos2" value="No" /><label for="c_datos2">&nbsp;No</label></li>
                                    </div>
                                </div>
                            </form>
                        </fieldset>
                    </div>
                    <div class="col-sm">
                        <fieldset>
                            <legend>Muestra</legend>
                            <form action="">

                            </form>
                        </fieldset>
                    </div>
                </div>

            </fieldset>
        </div>
    </body>
</html>
