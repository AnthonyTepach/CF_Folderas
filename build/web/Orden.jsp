<%-- 
    Document   : Orden
    Created on : 16/01/2018, 09:30:00 AM
    Author     : TI
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("/Folderas");
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva orden</title>
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
            <div class="row">

                <div class="col-sm">
                    <fieldset><legend>Cliente</legend>
                        <select class="custom-select mr-sm-2" id="clienteID" name='idFamily' onchange="Escliente();">
                            <option value="Existente">Existente</option>
                            <option value="Nuevo">Nuevo</option>
                        </select>
                        
                        <div id="clienteNE">
                            
                        </div>
                    </fieldset>
                </div>
                
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body> 
      <%
            String A = request.getParameter("MSJ");
            
            if (!A.isEmpty()) {
                
           
        %>
        <script type="text/javascript" >
          
                alert("<%=A%>");
            
        </script>
        
        <%}%>
</html>
