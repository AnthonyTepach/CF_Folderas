<%
    String tipo = request.getParameter("tipo");
    if (tipo.equals("block")) {
        String cantidad = request.getParameter("cantidad");
        String goma = request.getParameter("goma");
        String tapa = request.getParameter("tapa");
        String med = request.getParameter("med");
        String mate = request.getParameter("mate");
%>

<div class="alert alert-primary" role="alert">
    <h1 style="text-align: center;">Guardado</h1>
    <p>
        Tipo de acabado: <%=tipo%>
        <br>
        Cantidad: <%=cantidad%>
        <br>
        Goma: <%=goma%>
        <br>
        <%
            if (tapa == "null" || tapa == null || tapa == "undefined") {
                out.println("Tapa: No");
            } else {
                out.println(tapa);
            }%>
        <br>
        Medida: <%=med%>
        <br>
        Material:  <%=mate%>
    </p>
</div>
<%
} else if (tipo.contains("rollo")) {

    String diametro = request.getParameter("diametro"),
            cono = request.getParameter("cono"),
            cantidad = request.getParameter("cantidad"),
            ancho = request.getParameter("ancho"),
            formas = request.getParameter("formas"),
            tapas = request.getParameter("tapas");
%>
<div class="alert alert-primary" role="alert">
    <h1 style="text-align: center;">Guardado</h1>
    <p>
        Tipo de acabado: <%=tipo%>
        <br>
        Cantidad por rollo: <%=cantidad%>
        <br>
        Formas al ancho: <%=formas%>
        <br>
        Diametro: <%=diametro%>
        <br>
        Ancho <%=ancho%>
        <br>
        Cono:  <%=cono%>
        <br>
        Tapa:  <%=tapas%>
    </p>
</div>
<%}else if(tipo.contains("simple")){
    String largo=request.getParameter("largo"),ancho=request.getParameter("ancho"),doblado=request.getParameter("doblado");
%>

<div class="alert alert-primary" role="alert">
    <h1 style="text-align: center;">Guardado</h1>
    <p>
       Tipo de acabado: <%=tipo%>
       <br>
       Tamaño: <%=ancho%> x <%=largo%>
       <br>
       Doblado: <%=doblado%>
    </p>
</div>
<%}%>