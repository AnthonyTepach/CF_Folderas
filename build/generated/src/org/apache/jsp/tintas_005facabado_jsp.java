package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tintas_005facabado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("/Folderas");
    }
    String formaid = request.getParameter("id");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tintas y Acabado</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("  \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-dark \" style=\"background-color: #F8F8FF;\">\n");
      out.write("            <!-- Navbar content -->\n");
      out.write("            <a class=\"navbar-brand\" href=\"Principal.jsp\">\n");
      out.write("                <img src=\"img/logo.png\" width=\"300px\"  alt=\"Responsive image\">\n");
      out.write("            </a>\n");
      out.write("            <span class=\"navbar-text\" style=\"color: black;\">\n");
      out.write("                <div class=\"btn-group dropleft \">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu\">\n");
      out.write("                        <a class=\"dropdown-item\" style=\"color: black;\" href=\"Logout\">Cerrar Sesión</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </span>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm\"  id=\"restinta\">\n");
      out.write("                    <form action=\"#\" id=\"enviaForms\" method=\"post\">\n");
      out.write("                        <fieldset id=\"tintas\">\n");
      out.write("                            <legend>Color de tinta</legend>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-2\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <label class=\"form-check-label\">N° tanto</label>\n");
      out.write("                                    <input type=\"text\" name=\"txttanto\" id=\"txtfrente\" class=\"form-control\" value=\"1\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm\">\n");
      out.write("                                    <label class=\"form-check-label\">Frente (N°pantone)</label>\n");
      out.write("                                    <input type=\"text\" name=\"txtfrente\" id=\"txtfrente\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm\">\n");
      out.write("                                    <label class=\"form-check-label\">Reverso (N°pantone)</label>\n");
      out.write("                                    <input type=\"text\" name=\"txtreverso\" id=\"txtfrente\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <label class=\"form-check-label\">Barniz</label>\n");
      out.write("                                    <input type=\"text\" name=\"txtbarniz\" id=\"txtbarniz\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <label class=\"form-check-label\">Pantalla<br></label>\n");
      out.write("                                    <input type=\"text\" name=\"txtpantalla\" id=\"txtpantalla\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>    \n");
      out.write("                            <input type=\"Button\" value=\"Agregar Tinta\" class=\"btn btn-outline-success\" onclick=\"agregar_alternativa()\"/>\n");
      out.write("                            <input type=\"button\" value=\"Guardar\" class=\"btn btn-outline-primary\" onclick=\"guardarTintas();\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                function guardarTintas() {\n");
      out.write("                                    var datos = $('#enviaForms').serialize();\n");
      out.write("                                    var forma = datos + \"&idforma=");
      out.print(formaid);
      out.write("\";\n");
      out.write("                                    $.ajax({\n");
      out.write("                                        type: \"POST\",\n");
      out.write("                                        url: \"Svl_tintas\",\n");
      out.write("                                        data: forma,\n");
      out.write("                                        success: function (data)\n");
      out.write("                                        {\n");
      out.write("                                            $(\"#restinta\").html(data);\n");
      out.write("                                        }\n");
      out.write("                                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                function agregar_alternativa() {\n");
      out.write("\n");
      out.write("                                    var fieldset = document.getElementById(\"tintas\");\n");
      out.write("                                    var inputs = document.getElementsByName(\"txttanto\");\n");
      out.write("                                    var contenedor = document.createElement(\"fieldset\");\n");
      out.write("                                    var legen = document.createElement(\"legend\");\n");
      out.write("                                    legen.textContent = \"Tanto N° \" + (inputs.length + 1);\n");
      out.write("                                    contenedor.appendChild(legen);\n");
      out.write("\n");
      out.write("                                    var row1 = document.createElement(\"div\");\n");
      out.write("                                    row1.className = \"row\";\n");
      out.write("                                    var row2 = document.createElement(\"div\");\n");
      out.write("                                    row2.className = \"row\";\n");
      out.write("\n");
      out.write("                                    var tiros = document.createElement(\"input\");\n");
      out.write("                                    tiros.className = \"form-control form-text\";\n");
      out.write("                                    tiros.name = \"txttanto\";\n");
      out.write("                                    tiros.id = \"txttanto\" + (inputs.length + 1);\n");
      out.write("                                    tiros.value = (inputs.length + 1);\n");
      out.write("                                    tiros.placeholder = \"Tanto n°\" + (inputs.length + 1);\n");
      out.write("\n");
      out.write("                                    var divtiro = document.createElement(\"div\");\n");
      out.write("                                    divtiro.className = \"col-sm-2\";\n");
      out.write("                                    divtiro.appendChild(tiros);\n");
      out.write("\n");
      out.write("                                    var color = document.createElement(\"input\");\n");
      out.write("                                    color.className = \"form-control form-text\";\n");
      out.write("                                    color.name = \"txtfrente\";\n");
      out.write("                                    color.id = \"txtfrente\" + (inputs.length + 1);\n");
      out.write("                                    color.placeholder = \"Pantone frontal\";\n");
      out.write("\n");
      out.write("                                    var divcolor = document.createElement(\"div\");\n");
      out.write("                                    divcolor.className = \"col-sm\";\n");
      out.write("                                    divcolor.appendChild(color);\n");
      out.write("\n");
      out.write("                                    var peso = document.createElement(\"input\");\n");
      out.write("                                    peso.className = \"form-control form-text\";\n");
      out.write("                                    peso.name = \"txtreverso\";\n");
      out.write("                                    peso.id = \"txtreverso\" + (inputs.length + 1);\n");
      out.write("                                    peso.placeholder = \"Pantone reverso\";\n");
      out.write("\n");
      out.write("                                    var divpeso = document.createElement(\"div\");\n");
      out.write("                                    divpeso.className = \"col-sm\";\n");
      out.write("                                    divpeso.appendChild(peso);\n");
      out.write("\n");
      out.write("                                    var calidad = document.createElement(\"input\");\n");
      out.write("                                    calidad.className = \"form-control form-text\";\n");
      out.write("                                    calidad.name = \"txtbarniz\";\n");
      out.write("                                    calidad.id = \"txtbarniz\" + (inputs.length + 1);\n");
      out.write("                                    calidad.placeholder = \"Barniz\";\n");
      out.write("\n");
      out.write("                                    var divcal = document.createElement(\"div\");\n");
      out.write("                                    divcal.className = \"col-sm\";\n");
      out.write("                                    divcal.appendChild(calidad);\n");
      out.write("\n");
      out.write("                                    var ancho = document.createElement(\"input\");\n");
      out.write("                                    ancho.className = \"form-control form-text\";\n");
      out.write("                                    ancho.name = \"txtpantalla\";\n");
      out.write("                                    ancho.id = \"txtpantalla\" + (inputs.length + 1);\n");
      out.write("                                    ancho.placeholder = \"Pantalla\";\n");
      out.write("\n");
      out.write("                                    var divancho = document.createElement(\"div\");\n");
      out.write("                                    divancho.className = \"col-sm\";\n");
      out.write("                                    divancho.appendChild(ancho);\n");
      out.write("\n");
      out.write("                                    var btnRemove = document.createElement(\"input\");\n");
      out.write("                                    btnRemove.type = \"button\";\n");
      out.write("                                    btnRemove.value = \"Quitar\";\n");
      out.write("                                    btnRemove.className = \"btn btn-outline-danger\";\n");
      out.write("\n");
      out.write("                                    row1.appendChild(divtiro);\n");
      out.write("                                    row1.appendChild(divcolor);\n");
      out.write("                                    row1.appendChild(divpeso);\n");
      out.write("                                    row1.appendChild(divcal);\n");
      out.write("                                    row1.appendChild(divancho);\n");
      out.write("                                    contenedor.appendChild(row1);\n");
      out.write("                                    contenedor.appendChild(row2);\n");
      out.write("                                    contenedor.appendChild(btnRemove);\n");
      out.write("                                    fieldset.appendChild(contenedor);\n");
      out.write("                                    btnRemove.onclick = function () {\n");
      out.write("                                        var elem = this.parentNode;\n");
      out.write("                                        elem.parentNode.removeChild(elem);\n");
      out.write("                                    };\n");
      out.write("\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\" id=\"divacabado\">\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Acabado</legend>\n");
      out.write("                        <br><br>\n");
      out.write("                        <input type=\"text\" value=\"");
      out.print(formaid);
      out.write("\" id=\"qwerty\" class=\"qwerty\" name=\"qwerty\"/>\n");
      out.write("                        <select class=\"form-control form-control-range\" id=\"tipo_acabado\" onchange=\"cargaform();\">  \n");
      out.write("                            <option value=\"simple\">FORMA SIMPLE</option>\n");
      out.write("                            <option value=\"block\">EN BLOCK</option>\n");
      out.write("                            <option value=\"rapido\">JUEGO RÁPIDO</option>\n");
      out.write("                            <option value=\"rollo\">EN ROLLO</option>\n");
      out.write("                            <option value=\"continua\">FORMA CONTINUA</option>\n");
      out.write("                        </select>\n");
      out.write("                    </fieldset>\n");
      out.write("                    <div id=\"acabadoDinamico\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
