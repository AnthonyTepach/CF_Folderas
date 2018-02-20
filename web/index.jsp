<%-- 
    Document   : index
    Created on : 12/01/2018, 10:58:27 AM
    Author     : AnthonyTepach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceder</title>
        <jsp:include page="header.jsp" />  
    </head>
    <body>

        <nav class="navbar navbar-dark " style="background-color: #F8F8FF;">
            <!-- Navbar content -->
            <a class="navbar-brand" href="/Folderas">
                <img src="img/logo.png" width="300px"  alt="Responsive image">
            </a>
        </nav>
        <div class="container " >
            <div class="centrar">
                <form method="POST" action="Login">
                    <div class="form-group row">
                        <label for="inputEmail3" class="col-sm-2 col-form-label">Usuario</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" required="" id="username" name="username" placeholder="Usuario">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputPassword3" class="col-sm-2 col-form-label">Contraseña</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" required="" id="password" name="password" placeholder="Contraseña">
                        </div>
                    </div>

                    <div class="form-group row">
                        <div class="col-sm-10">
                            <button name="login" id="login" class="btn btn-primary" >Ingresar</button>
                        </div>

                    </div>
                </form>

            </div>
            <div id="messageDiv" style=""></div>
        </div>
        <jsp:include page="footer.jsp" />  
       
</body>
</html>

