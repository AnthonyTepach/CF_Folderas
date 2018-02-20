<%-- 
    Document   : loquear
    Created on : 12/01/2018, 03:03:18 PM
    Author     : TI
--%>
<%
    String user= request.getParameter("username")
            ,pass=request.getParameter("password");;
    
%>


        <h1>Usuario:<%=user%></h1>
        <h1>Contraseña:<%=pass%></h1>
   
