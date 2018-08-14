<%@page import="java.util.HashMap"%>
<%@page import="com.datos.modelos.M_Acabado"%>
<%
    String tipo = request.getParameter("tipo");

    M_Acabado ma = new M_Acabado();
    HashMap<String, String> data = new HashMap<>();
    if (tipo.equals("block")) {
        String cantidad = request.getParameter("cantidad");
        String goma = request.getParameter("goma");
        String tapa = request.getParameter("tapa");
        String med = request.getParameter("med");
        String mate = request.getParameter("mate");
        String id = request.getParameter("id");
        data.put("id_forma", id);
        data.put("tipo_acabado", tipo);
        data.put("b_cantidad", cantidad);
        data.put("b_goma", goma);
        data.put("b_tapa", tapa);
        data.put("b_material", mate);
        data.put("b_medida", med);
        ma.setAcabado(data);
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
    String id = request.getParameter("id");
    data.put("id_forma", id);
    data.put("tipo_acabado", tipo);
    data.put("rl_diametro", diametro);
    data.put("rl_cono", cono);
    data.put("rl_cantidad", cantidad);
    data.put("rl_ancho", ancho);
    data.put("rl_alancho", formas);
    data.put("rl_tapa", tapas);
ma.setAcabado(data);

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
        <br>
        <%=id%>
    </p>
</div>
<%} else if (tipo.contains("simple")) {
    String id = request.getParameter("id");
    String paso = request.getParameter("largo"), ancho = request.getParameter("ancho"), doblado = request.getParameter("doblado");

    data.put("id_forma", id);
    data.put("tipo_acabado", tipo);
    data.put("s_ancho", ancho);
    data.put("s_paso", paso);
    data.put("s_doblado", doblado);
    ma.setAcabado(data);
%>

<div class="alert alert-primary" role="alert">


    <h1 style="text-align: center;">Guardado</h1>
    <p>
        Tipo de acabado: <%=tipo%>
        <br>
        Ancho <%=ancho%> 
        <br>
        Paso: <%=paso%>
        <br>
        Doblado: <%=doblado%>
        <br>
        forma <%=id%>
    </p>
</div>
<%} else if (tipo.contains("rapido")) {
    String id = request.getParameter("id");
    String marginales = request.getParameter("marginales"),
            goma = request.getParameter("goma"),
            engrapado = request.getParameter("engrapado"),
            talon = request.getParameter("talon"),
            material = request.getParameter("mat"),
            medida = request.getParameter("med");
    data.put("id_forma", id);
    data.put("tipo_acabado", tipo);
    data.put("r_tiras", marginales);
    data.put("r_goma", goma);
    data.put("r_engrapado", engrapado);
    data.put("r_talon", talon);
    data.put("r_material",material);
    data.put("r_medida", medida);
ma.setAcabado(data);
%>
<div class="alert alert-primary" role="alert">
    <h1 style="text-align: center;">Guardado</h1>
    <p>
        Tipo de acabado: <%=tipo%>
        <br>
        Marginales: <%=marginales%>
        <br>
        Goma: <%=goma%>
        <br>
        Engrapado: <%=engrapado%>
        <br>
        Talon: <%=talon%>
        <br>
        Material: <%=material%>
        <br>
        Medida: <%=medida%>
    </p>
</div>
<%}%>