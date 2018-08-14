package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Acceder</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-dark \" style=\"background-color: #F8F8FF;\">\n");
      out.write("            <!-- Navbar content -->\n");
      out.write("            <a class=\"navbar-brand\" href=\"/Folderas\">\n");
      out.write("                <img src=\"img/logo.png\" width=\"300px\"  alt=\"Responsive image\">\n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container \" >\n");
      out.write("            <div class=\"centrar\">\n");
      out.write("                <form method=\"POST\" action=\"Login\">\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-2 col-form-label\">Usuario</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" required=\"\" id=\"username\" name=\"username\" placeholder=\"Usuario\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"inputPassword3\" class=\"col-sm-2 col-form-label\">Contraseña</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" required=\"\" id=\"password\" name=\"password\" placeholder=\"Contraseña\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <button name=\"login\" id=\"login\" class=\"btn btn-primary\" >Ingresar</button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"messageDiv\" style=\"\"></div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("  \n");
      out.write("       \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
