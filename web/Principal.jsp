<%-- 
    Document   : PÁGINA PRINCIAL
    Created on : 12/01/2018, 03:51:29 PM
    Author     : TI
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
        <title>Princial</title>
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
        <!--
        CONTENIDO
        -->
        <div class="container">
            
            <br>
            <br>
            <br>
            <center>
                <div class="row">
                    <div class="col-sm"><a href="Orden.jsp?MSJ"><span class="text-muted"><button type="button" class="btn btn-primary">Orden de producción nueva</button><img src="img/ebook-1.png" class="img-fluid" alt="Responsive image"></span></a></div>
                    <div class="col-sm"><a href="Ver_ordenes.jsp"><span class="text-muted"><button type="button" class="btn btn-primary">Ver ordenes de produción</button><img src="img/zooming.png" class="img-fluid" alt="Responsive image"></span></a></div>
                    <div class="col-sm"><a href="#"><span class="text-muted"><button type="button" class="btn btn-primary">-----</button><img src="img/printing.png" class="img-fluid" alt="Responsive image"></span></a></div>
                    
                </div>
            </center>

        </div>
        <!--
        FOOTER
        -->
        <jsp:include page="footer.jsp" />  
    </body>
</html>
