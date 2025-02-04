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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Jose Raul Rojo Ontiveros</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            color: #333;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 800px;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: white;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            text-align: center; /* Centrar el contenido */\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            font-size: 2.5em;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        p {\n");
      out.write("            font-size: 1.2em;\n");
      out.write("            line-height: 1.6;\n");
      out.write("        }\n");
      out.write("        .profile-img {\n");
      out.write("            width: 150px; /* Tamaño de la imagen */\n");
      out.write("            height: 150px;\n");
      out.write("            border-radius: 50%; /* Hace la imagen redonda */\n");
      out.write("            object-fit: cover; /* Asegura que la imagen se ajuste correctamente */\n");
      out.write("            margin-bottom: 20px; /* Espacio debajo de la imagen */\n");
      out.write("            border: 4px solid #4CAF50; /* Borde verde */\n");
      out.write("        }\n");
      out.write("        .hobbies {\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        .hobbies h2 {\n");
      out.write("            font-size: 2em;\n");
      out.write("            color: #4CAF50;\n");
      out.write("        }\n");
      out.write("        .hobbies ul {\n");
      out.write("            list-style-type: none;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        .hobbies ul li {\n");
      out.write("            font-size: 1.2em;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        footer {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px;\n");
      out.write("            position: fixed;\n");
      out.write("            width: 100%;\n");
      out.write("            bottom: 0;\n");
      out.write("        }\n");
      out.write("        footer a {\n");
      out.write("            color: #4CAF50;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        footer a:hover {\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>Jose Raul Rojo Ontiveros</h1>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a href=\"../Presentacion/\">\n");
      out.write("            <img src=\"WEB-INF/Peso.jpg\" alt=\" \" class=\"profile-img\">\n");
      out.write("        </a>\n");
      out.write("       \n");
      out.write("        <section>\n");
      out.write("            <p>Hola, soy Jose Raul Rojo Ontiveros. Soy una persona muy tranquila, me gusta disfrutar de mis ratos a solas. No suelo meterme en problemas y siempre prefiero el diálogo para resolver cualquier situación.</p>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"hobbies\">\n");
      out.write("            <h2>Hobbies e Intereses</h2>\n");
      out.write("            <ul>\n");
      out.write("                <li>Ver películas como <em>Sonic 3</em></li>\n");
      out.write("                <li>Ver series como <em>Arcane</em></li>\n");
      out.write("                <li>Jugar juegos como <em>Mario Party</em> con amigos</li>\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <p>Visita mi <a href=\"https://github.com/Jose-Rojo/AppWeb.git\" target=\"_blank\">GitHub</a></p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
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
