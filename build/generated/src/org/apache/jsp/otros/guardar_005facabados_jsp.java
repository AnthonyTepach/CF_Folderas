package org.apache.jsp.otros;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guardar_005facabados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    String tipo = request.getParameter("tipo");
    if (tipo.equals("block")) {
        String cantidad = request.getParameter("cantidad");
        String goma = request.getParameter("goma");
        String tapa = request.getParameter("tapa");

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"alert alert-primary\" role=\"alert\">\n");
      out.write("    <h1 style=\"text-align: center;\">Guardado</h1>\n");
      out.write("    <p>\n");
      out.write("        Tipo de acabado: ");
      out.print(tipo);
      out.write("\n");
      out.write("        <br>\n");
      out.write("        Cantidad: ");
      out.print(cantidad);
      out.write("\n");
      out.write("        <br>\n");
      out.write("        Goma: ");
      out.print(goma);
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            if (tapa == "null" || tapa == null||tapa=="undefined") {
                out.println(tapa);
            } else {
                out.println("Tapa: No");
            }
      out.write("\n");
      out.write("    </p>\n");
      out.write("</div>\n");

    }

      out.write('\n');
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