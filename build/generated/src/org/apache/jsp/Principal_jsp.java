package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Princial</title>\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("        <!--\n");
      out.write("        CONTENIDO\n");
      out.write("        -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <center>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm\"><a href=\"Orden.jsp?MSJ\"><span class=\"text-muted\"><button type=\"button\" class=\"btn btn-primary\">Orden de producción nueva</button><img src=\"img/ebook-1.png\" class=\"img-fluid\" alt=\"Responsive image\"></span></a></div>\n");
      out.write("                    <div class=\"col-sm\"><a href=\"Ver_ordenes.jsp\"><span class=\"text-muted\"><button type=\"button\" class=\"btn btn-primary\">Ver ordenes de produción</button><img src=\"img/zooming.png\" class=\"img-fluid\" alt=\"Responsive image\"></span></a></div>\n");
      out.write("                    <div class=\"col-sm\"><a href=\"#\"><span class=\"text-muted\"><button type=\"button\" class=\"btn btn-primary\">-----</button><img src=\"img/printing.png\" class=\"img-fluid\" alt=\"Responsive image\"></span></a></div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--\n");
      out.write("        FOOTER\n");
      out.write("        -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("  \n");
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
