package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.datos.ejemplos.GenerarNumero;
import com.datos.modelos.M_info;
import java.sql.ResultSet;

public final class Ver_005fordenes_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("/Folderas");

    } else {
        String t = String.valueOf(session.getAttribute("Tipo"));
        if (t.contentEquals("Administrador") || t.contentEquals("Admin")) {

        } else if (t.contentEquals("Vendedor")) {

        } else {
            response.sendRedirect("Principal.jsp");
        }

    }
    String usuario = String.valueOf(session.getAttribute("Usuario"));
    String tipo = String.valueOf(session.getAttribute("Tipo"));
    M_info mi = new M_info();
    ResultSet admin_autorizada = mi.getInfo("Autorizada");
    ResultSet admin_noautorizada = mi.getInfo("Por autorizar");
    ResultSet rs = mi.getInfo(usuario, "Por autorizar");
    ResultSet rsAuto = mi.getInfo(usuario, "Autorizada");
    GenerarNumero nop = new GenerarNumero();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script>setTimeout('document.location.reload()', 60000);</script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ver mis ordenes</title>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js\"></script>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("  \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function confirma() {\n");
      out.write("             \n");
      out.write("              var a= confirm(\"Esta seguro\");\n");
      out.write("              if(a){\n");
      out.write("                    $(\"#fmodal\").submit();\n");
      out.write("                  }\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-dark \" style=\"background-color: #F8F8FF;\">\n");
      out.write("            <!-- Navbar content -->\n");
      out.write("            <a class=\"navbar-brand\" href=\"Nueva Orden.jsp\">\n");
      out.write("                <img src=\"img/logo.png\" width=\"300px\"  alt=\"Responsive image\">\n");
      out.write("            </a>\n");
      out.write("            <span class=\"navbar-text\" style=\"color: black;\">\n");
      out.write("                <a href=\"Principal.jsp\"><button type=\"button\" class=\"btn btn-primary\">Regresar</button></a>\n");
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
      out.write("\n");
      out.write("            </span>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
 mi.CloseDB();
      out.write("\n");
      out.write("            <br>\n");
      out.write("            ");
if (tipo.contentEquals("Vendedor")) {
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                    <!--Por autorizar-->\n");
      out.write("                    <!--Fin Por autorizar-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                    <!--Autorizadas-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"table-responsive table-hover table-light\">\n");
      out.write("                \n");
      out.write("                <table class=\"table\" > \n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"badge-dark\">\n");
      out.write("                            <th colspan=\"10\"><center>Ordenes por autorizar</center></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"\">\n");
      out.write("                        <th>Nombre de la forma</th>\n");
      out.write("                        <th>Tipo</th>\n");
      out.write("                        <th>Agente</th>\n");
      out.write("                        <th>Cantidad</th>\n");
      out.write("                        <th>Producto</th>\n");
      out.write("                        <th>Familia </th>\n");
      out.write("                        <th>Cliente</th>\n");
      out.write("                        <th>R.F.C</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
 while (rs.next()) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>");
      out.print( rs.getString(1));
      out.write("</th>\n");
      out.write("                            <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString(3));
      out.write(" </td>\n");
      out.write("                            <td>");
      out.print( rs.getString(4));
      out.print( rs.getString(5));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString(6));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString(7));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString(8));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString(9));
      out.write("</td>\n");
      out.write("                            <!--<td>");
      out.print( rs.getString(12));
      out.write("</td>-->\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"table-responsive table-hover table-light\">\n");
      out.write("                <table class=\"table\" >\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"badge-dark\">\n");
      out.write("                            <th colspan=\"8\"><center>Autorizadas</center></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"\">\n");
      out.write("\n");
      out.write("                        <th>Nombre de la forma</th>\n");
      out.write("                        <th>Tipo</th>\n");
      out.write("\n");
      out.write("                        <th>Agente</th>\n");
      out.write("                        <th>Cantidad</th>\n");
      out.write("                        <th>Producto</th>\n");
      out.write("                        <th>Familia </th>\n");
      out.write("                        <th>Cliente</th>\n");
      out.write("                        <th>R.F.C</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
 while (rsAuto.next()) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>");
      out.print( rsAuto.getString(1));
      out.write("</th>\n");
      out.write("                            <td>");
      out.print( rsAuto.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rsAuto.getString(3));
      out.write(" </td>\n");
      out.write("                            <td>");
      out.print( rsAuto.getString(4));
      out.write(' ');
      out.print( rsAuto.getString(5));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rsAuto.getString(6));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rsAuto.getString(7));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rsAuto.getString(8));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rsAuto.getString(9));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
} // fin del vendedor
            //inicio admin
            else if (tipo.contentEquals("Admin")) {
            
      out.write("\n");
      out.write("            <div class=\"table-responsive table-hover table-light\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"badge-dark\">\n");
      out.write("                            <th colspan=\"10\"><center>Ordenes por autorizar</center></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"\">\n");
      out.write("\n");
      out.write("                        <th>Nombre de la forma</th>\n");
      out.write("                        <th>Tipo</th>\n");
      out.write("\n");
      out.write("                        <th>Agente</th>\n");
      out.write("                        <th>Cantidad</th>\n");
      out.write("                        <th>Producto</th>\n");
      out.write("                        <th>Familia </th>\n");
      out.write("                        <th>Cliente</th>\n");
      out.write("                        <th>R.F.C</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("                        ");
 while (admin_noautorizada.next()) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>");
      out.print( admin_noautorizada.getString(1));
      out.write("</th>\n");
      out.write("                            <td>");
      out.print( admin_noautorizada.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_noautorizada.getString(3));
      out.write(" </td>\n");
      out.write("                            <td>");
      out.print( admin_noautorizada.getString(4));
      out.write(' ');
      out.print( admin_noautorizada.getString(5));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_noautorizada.getString(6));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_noautorizada.getString(7));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_noautorizada.getString(8));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_noautorizada.getString(9));
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                            <td><a href=\"#\" class=\"table-hover\" data-toggle=\"modal\" data-target=\"#");
      out.print( admin_noautorizada.getString(12));
      out.write("\"><i class=\"material-icons\" style=\"color: #207ab9; font-size: 36px;\">more</i></a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <!-- Modal -->\n");
      out.write("                    <div class=\"modal fade \" id=\"");
      out.print( admin_noautorizada.getString(12));
      out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLongTitle\" aria-hidden=\"true\">\n");
      out.write("                        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                            <div class=\"modal-content\">\n");
      out.write("                                <div class=\"modal-header\">\n");
      out.write("                                    <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">");
      out.print( admin_noautorizada.getString(1));
      out.write("</h5>\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-body\">\n");
      out.write("                                    <form action=\"op\" method=\"post\" id=\"fmodal\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm\">\n");
      out.write("                                                <input name=\"idop\" value=\"");
      out.print( admin_noautorizada.getString(12));
      out.write("\" readonly=\"\" hidden=\"\">\n");
      out.write("                                                <label>No.Orden de producción</label>\n");
      out.write("                                                <input type=\"text\" name=\"txtno\" id=\"txtno\" class=\"form-control\" required=\"\" value=\"");
      out.print( nop.numeros());
      out.write("\"> \n");
      out.write("                                                <label>Tipo de orden</label>\n");
      out.write("                                                <select name=\"txttipo\" class=\"form-control\">\n");
      out.write("                                                    <option value=\"Nueva\">Nueva</option>\n");
      out.write("                                                    <option value=\"Exacta\">Exacta</option>\n");
      out.write("                                                    <option value=\"Cambios\">Cambios</option>\n");
      out.write("                                                </select>\n");
      out.write("                                                <label>Entra a produccion el: </label>\n");
      out.write("                                                <input class=\"form-control\" type=\"date\" required=\"\" value=\"31/08/1996\" name=\"txtprod\" id=\"txtprod\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm\">\n");
      out.write("                                                <label>Fecha de registro</label>\n");
      out.write("                                                <input class=\"form-control\" type=\"date\" required=\"\" value=\"31/08/1996\" name=\"txtregistro\" id=\"txtregistro\">\n");
      out.write("                                                <label>Fecha de autorización</label>\n");
      out.write("                                                <input class=\"form-control\" type=\"date\" required=\"\" value=\"31/08/1996\" name=\"txtautoriza\" id=\"txtautoriza\">\n");
      out.write("                                                <label>Fecha de entrega: </label>\n");
      out.write("                                                <input class=\"form-control\" type=\"date\" required=\"\" value=\"31/08/1996\" name=\"txtentrega\" id=\"txtentrega\">\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        Reviso:  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-secondary\"  data-dismiss=\"modal\">Close</button>\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary\"  id=\"envia\" name=\"envia\" onclick=\"confirma();\" >Guardar</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--fin modal-->\n");
      out.write("                    ");
}

                    
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <div class=\"table-responsive table-hover table-light\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"badge-dark\">\n");
      out.write("                            <th colspan=\"9\"><center>Autorizadas</center></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"\">\n");
      out.write("\n");
      out.write("                        <th>Nombre de la forma</th>\n");
      out.write("                        <th>Tipo</th>\n");
      out.write("\n");
      out.write("                        <th>Agente</th>\n");
      out.write("                        <th>Cantidad</th>\n");
      out.write("                        <th>Producto</th>\n");
      out.write("                        <th>Familia </th>\n");
      out.write("                        <th>Cliente</th>\n");
      out.write("                        <th>R.F.C</th>\n");
      out.write("                        <th>Fecha de autorización</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
 while (admin_autorizada.next()) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>");
      out.print( admin_autorizada.getString(1));
      out.write("</th>\n");
      out.write("                            <td>");
      out.print( admin_autorizada.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_autorizada.getString(3));
      out.write(" </td>\n");
      out.write("                            <td>");
      out.print( admin_autorizada.getString(4));
      out.write(' ');
      out.print( admin_autorizada.getString(5));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_autorizada.getString(6));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_autorizada.getString(7));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_autorizada.getString(8));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_autorizada.getString(9));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( admin_autorizada.getString(13));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
 mi.CloseDB();
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
