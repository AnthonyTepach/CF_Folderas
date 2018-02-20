<%
    String tipo = request.getParameter("tipo");
    if (tipo.equals("block")) {
        String cantidad = request.getParameter("cantidad");
        String goma = request.getParameter("goma");
        String tapa = request.getParameter("tapa");
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
            if (tapa == "null" || tapa == null||tapa=="undefined") {
               out.println("Tapa: No");
            } else {
                 out.println(tapa);
            }%>
    </p>
</div>
<%
    }
%>
