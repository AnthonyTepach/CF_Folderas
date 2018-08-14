package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class caja_005fempaque_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Caja y Empaque</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <nav class=\"navbar navbar-dark \" style=\"background-color: #F8F8FF;\">\n");
      out.write("        <!-- Navbar content -->\n");
      out.write("        <a class=\"navbar-brand\" href=\"Nueva Orden.jsp\">\n");
      out.write("            <img src=\"img/logo.png\" width=\"300px\"  alt=\"Responsive image\">\n");
      out.write("        </a>\n");
      out.write("        <span class=\"navbar-text\" style=\"color: black;\">\n");
      out.write("\n");
      out.write("            <div class=\"btn-group dropleft \">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </button>\n");
      out.write("                <div class=\"dropdown-menu\">\n");
      out.write("                    <a class=\"dropdown-item\" style=\"color: black;\" href=\"Logout\">Cerrar Sesión</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </span>\n");
      out.write("    </nav>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <fieldset> \n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Empaque</legend>\n");
      out.write("                            <form action=\"\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm\">\n");
      out.write("                                        <label class=\"form-text progress-bar-animated\">Tipo de empaque</label>\n");
      out.write("                                        <li><input type=\"radio\" name=\"tempaque\" id=\"tempaque\" value=\"Fajilla\" /><label for=\"tempaque\">&nbsp;Fajilla</label></li>\n");
      out.write("                                        <li><input type=\"radio\" name=\"tempaque\" id=\"tempaque2\" value=\"Paquete\" /><label for=\"tempaque2\">&nbsp;Paquete</label></li>\n");
      out.write("                                        <br>\n");
      out.write("                                        <label>Etiqueta de datos</label>\n");
      out.write("                                        <li><input type=\"radio\" name=\"e_eti\" id=\"e_eti\" value=\"Si\" /><label for=\"e_eti\">&nbsp;Si</label></li>\n");
      out.write("                                        <li><input type=\"radio\" name=\"e_eti\" id=\"e_eti2\" value=\"No\" /><label for=\"e_eti2\">&nbsp;No</label></li>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm\">\n");
      out.write("                                        <label class=\"form-text\">Cantidad</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"cantidadE\" id=\"cantidadE\" onkeypress=\"return soloNumeros(event)\">\n");
      out.write("                                        <br>\n");
      out.write("                                        <label>Termo plastificado</label>\n");
      out.write("                                        <li><input type=\"radio\" name=\"e_termo\" id=\"e_termo\" value=\"Si\" /><label for=\"e_termo\">&nbsp;Si</label></li>\n");
      out.write("                                        <li><input type=\"radio\" name=\"e_terno\" id=\"e_termo1\" value=\"No\" /><label for=\"e_terno1\">&nbsp;No</label></li>\n");
      out.write("                                        <li><input type=\"radio\" name=\"e_terno\" id=\"e_termo2\" value=\"Con soporte\" /><label for=\"e_termo2\">&nbsp;Con soporte</label></li>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Caja</legend>\n");
      out.write("                            <form action=\"\">\n");
      out.write("                                <div class=\"col-sm\">\n");
      out.write("                                    <label class=\"form-text\">Tipo de empaque</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Muestra</legend>\n");
      out.write("                            <form action=\"\">\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
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
