<%
    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("/Folderas");
    }
    String fa = request.getParameter("es");
%>

<%
    if (fa.contains("block")) {
%>


<div class="col-sm>">
    <label class="form-check-label alert-link">Cantidad por block</label>
    <input type="text" class="form-control" id="txtcantidadB" name="txtcantidadB">
</div>
<div class="col-sm>">
    <label class="form-check-label alert-link">Goma</label>
    <select class="form-control" id="gomablock" name="goma">
        <option value="Arriba">Arriba</option>
        <option value="Abajo">Abajo</option>
        <option value="Izquierda">Izquierda</option>
        <option value="Derecha">Derecha</option>
        <option value="Medio">Medio</option>
        <option value="Todo">Todo</option>
    </select>
</div>
<div class="col-sm>">
    <label class="form-check-label alert-link">Tapa</label>
    <ol>
        <li><input type="radio" name="ta" id="ta1" value="Tapa" /><label for="ta1">&nbsp;Tapa</label></li>
        <li><input type="radio" name="ta" id="ta2" value="Contratapa" /><label for="ta2">&nbsp;Contratapa</label></li>
        <li><input type="radio" name="ta" id="ta3" value="Tapa y Contratapa" /><label for="ta3">&nbsp;Tapa y Contratapa</label></li>
        <li><label for="txtmat">&nbsp;Material&nbsp;</label><input type="text" class="form-control" name="txtmat" id="txtmat"  /></li>
        <li><label for="txtmed">&nbsp;Medida&nbsp;</label><input type="text" class="form-control" name="txtmed" id="txtmed"  /></li>
    </ol> 

    <button class="btn badge-secondary" onclick="guardarblock()">Guardar</button>
    <br>
</div>


<%
} else if (fa.contains("simple")) {
%>

<div class="row">
    <div class="col-sm">
        <label class="alert-link">Ancho</label>
        <input type="text" class="form-control" id="anchosimple">
    </div>
    <div class="col-sm">
        <label class="alert-link">Paso</label>
        <input type="text" class="form-control" id="pasosimple">
    </div>

</div>
<label class="form-check-label alert-link">Doblado</label>
<ol>
    <li><input type="radio" name="dobsimple" id="dobsimple" value="No" /><label for="dobsimple">&nbsp;No</label></li>
    <li><input type="radio" name="dobsimple" id="dobsimple2" value="Diptico" /><label for="dobsimple2">&nbsp;Diptico</label></li>
    <li><input type="radio" name="dobsimple" id="dobsimple3" value="Triptico" /><label for="dobsimple3">&nbsp;Triptico</label></li>

</ol>
<button class="btn btn-outline-dark" onclick="guardaSimple()">Guardar</button>
<%
} else if (fa.contains("rollo")) {
%>
<div class="row">
    <div class="col-sm">
        <label class="alert-link">Diametro</label>
        <input type="text" class="form-control" id="diametro">
    </div>
    <div class="col-sm">
        <label class="alert-link">Cono</label>
        <input type="text" class="form-control" id="Cono">
    </div>

</div>
<div class="row">
    <div class="col-sm">
        <label class="alert-link">Cantidad x rollo</label>
        <input type="text" class="form-control" id="cantrollo">
    </div>
    <div class="col-sm">
        <label class="alert-link">Ancho de rollo</label>
        <input type="text" class="form-control" id="anchrollo">
    </div>
    <div class="col-sm">
        <label class="alert-link">Formas al ancho</label>
        <input type="text" class="form-control" id="formancho">
    </div>
</div>
<label class="form-check-label alert-link">Tapas</label>
<ol>
    <li><input type="radio" name="tapasrollos" id="taparollo" value="Si" /><label for="taparollo">&nbsp;Si</label></li>
    <li><input type="radio" name="tapasrollos" id="taparollo1" value="No" /><label for="taparollo1">&nbsp;No</label></li>


</ol>
<button class="btn btn-outline-dark" onclick="guardarRollo()">Guardar</button>
<%
} else if (fa.contains("continua")) {
%>


<%
} else if (fa.contains("rapido")) {
%>
<br>
<div class="row">
    <div class="col-sm-4">
        <label class="form-check-label alert-link">Tiras marginales</label>
        <input type="text" class="form-control" id="tirasrapido" value="5/8">
    </div>
    <div class="col-sm">
        <br>
        <label class="form-check-label alert-link">Goma</label>
        <select class="form-control" id="gomarapido" name="gomarapido">
            <option value="Arriba">Arriba</option>
            <option value="Abajo">Abajo</option>
            <option value="Izquierda">Izquierda</option>
            <option value="Derecha">Derecha</option>
            <option value="No">No</option>
        </select>
    </div>
</div>
<div class="row">
    <div class="col-sm-5">
        <label class="form-check-label alert-link">Engrapado</label>
        <ol>
            <li><input type="radio" name="engrapadorapido" id="engrapadorapido" value="Arriba" /><label for="engrapadorapido">&nbsp;Arriba</label></li>
            <li><input type="radio" name="engrapadorapido" id="engrapadorapido1" value="Abajo" /><label for="engrapadorapido1">&nbsp;Abajo</label></li>
            <li><input type="radio" name="engrapadorapido" id="engrapadorapido2" value="Izquierda" /><label for="engrapadorapido2">&nbsp;Izquierda</label></li>
            <li><input type="radio" name="engrapadorapido" id="engrapadorapido3" value="Derecha" /><label for="engrapadorapido3">&nbsp;Derecha</label></li>
            <li><input type="radio" name="engrapadorapido" id="engrapadorapido4" value="No"  checked=""/><label for="engrapadorapido4">&nbsp;No</label></li>
        </ol>
        <button class="btn btn-outline-dark" onclick="guardaRapido()">Guardar</button>
    </div>
    <div class="col-sm">
        <label class="form-check-label alert-link">Talón</label>
        <ol>
            <li><input type="radio" name="taparapida" id="taparapida" value="Tapa" /><label for="taparapida">&nbsp;Tapa</label></li>
            <li><input type="radio" name="taparapida" id="taparapida1" value="Contratapa" /><label for="taparapida1">&nbsp;Contratapa</label></li>
            <li><input type="radio" name="taparapida" id="taparapida2" value="Tapa y Contratapa" /><label for="taparapida2">&nbsp;Tapa y Contratapa</label></li>
            <li><input type="radio" name="taparapida" id="taparapida3" value="No" checked="true" /><label for="taparapida3">&nbsp;No</label></li>
            <li><label for="txtmat">&nbsp;Material&nbsp;</label><input type="text" class="form-control" name="marrapido" id="matrapi"  /></li>
            <li><label for="txtmed">&nbsp;Medida&nbsp;</label><input type="text" class="form-control" name="medrapido" id="medrapi"  /></li>
        </ol> 
    </div>
</div>


<%}%>