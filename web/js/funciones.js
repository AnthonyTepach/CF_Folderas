$( document ).ready(function() {
    SubFamily();
    Escliente();
    cargaform();
});


function soloNumeros(e){

	var key = window.Event ? e.which : e.keyCode
return ((key==8 || key==190)||(key >= 48 && key <= 57) ) 

}
function SubFamily() {
    var id = $("#idFamily").val();
   // alert(id);

   $.ajax({ //Comunicación jQuery hacia JSP
           type: "GET",
           url: "SubFamilias",
           data: "id="+id,
           success: function(msg){
               $("#destino").html(msg);
           },
           error: function(xml,msg){
               $("#destino").text(" Error");
           }
        });   

}
function Escliente() {
    var es = $("#clienteID").val();
   // alert(id);

   $.ajax({ //Comunicación jQuery hacia JSP
           type: "GET",
           url: "otros/Cliente.jsp",
           data: "es="+es,
           success: function(msg){
               $("#clienteNE").html(msg);
           },
           error: function(xml,msg){
               $("#clienteNE").text(" Error");
           }
        });   

}
 function cargaform() {
    var es =$("#tipo_acabado").val();
    $.ajax({ //Comunicación jQuery hacia JSP
           type: "GET",
           url: "otros/forms_acabado.jsp",
           data: "es="+es,
           
           success: function(msg){
               
               $("#acabadoDinamico").html(msg);
           },
           error: function(xml,msg){
               $("#acabadoDinamico").text(" Error");
           }
        });   
}

function guardarblock(){
   
    var cantidadxbloc=$("#txtcantidadB").val();
    var goma=$("#gomablock").val();
    var tapa=$('input[name=ta]:checked').val();
    var tipo=$('#tipo_acabado').val();
    var mate=$('#txtmat').val();
    var med=$('#txtmed').val();
    if (cantidadxbloc==null || cantidadxbloc=="") {
        alert("Ingresa la cantidad por block");
        if (tapa==null || tapa=="") {
            tapa="null";
        }
    }else{
         $.ajax({ //Comunicación jQuery hacia JSP
           type: "GET",
           url: "otros/guardar_acabados.jsp",
           data: "tipo="+tipo+"&cantidad="+cantidadxbloc+"&goma="+goma+"&tapa="+tapa,
           
           success: function(msg){
               
               $("#divacabado").html(msg);
           },
           error: function(xml,msg){
               $("#divacabado").text(" Error");
           }
        }); 
    }
}