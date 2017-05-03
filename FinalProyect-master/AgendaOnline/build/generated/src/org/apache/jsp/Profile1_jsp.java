package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.models.DataPOJO;
import java.util.List;

public final class Profile1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Maestro</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h3></h3>\n");
      out.write("        <input type=\"button\" value=\"Insertar\" onclick=\"mostrarInsertar()\">\n");
      out.write("        <input type=\"button\" value=\"Buscar\" onclick=\"mostrarBuscar()\">\n");
      out.write("        <div id=\"buscarDeber\" style='display:none;'>\n");
      out.write("            <form action=\"DataController\" method=\"POST\">\n");
      out.write("            <label>Materia: <input type=\"text\" name=\"materiaEnv\"/></label>\n");
      out.write("            <div>Si gusta puede buscar por fecha.</div>\n");
      out.write("            <label>Fecha: <input type=\"text\" name=\"fechaEnv\"/></label>\n");
      out.write("            <input type=\"submit\" name=\"enviarCO\">\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"search\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"insertarDeber\" style='display:none;'>\n");
      out.write("            <form action=\"DataController\" method=\"POST\">\n");
      out.write("            <label>Materia: <input type=\"text\" name=\"materiaEnv\"/></label>\n");
      out.write("            <label>Deber: <input type=\"text\" name=\"deberEnv\"/></label>\n");
      out.write("            <div>Si gusta puede buscar por fecha.</div>\n");
      out.write("            <label>Fecha: <input type=\"text\" name=\"fechaEnv\"/></label>\n");
      out.write("            <input type=\"submit\" name=\"enviarCO\">\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"insert\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("           function mostrarBuscar(){\n");
      out.write("              document.getElementById('buscarDeber').style.display = 'block';\n");
      out.write("           }\n");
      out.write("           function mostrarInsertar(){\n");
      out.write("              document.getElementById('insertarDeber').style.display = 'block';\n");
      out.write("           }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 if (session != null){
           List deberes = (List) session.getAttribute("Deberes");
            if(deberes != null){
                System.out.println("Resultados");
          
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Materia</td>\n");
      out.write("                <td>Deberes</td>\n");
      out.write("                <td>Fecha</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        ");
 for(Object o : deberes){
            DataPOJO comentario = (DataPOJO) o;
        
      out.write("    \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(comentario.getMateria());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(comentario.getDeber());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(comentario.getFecha());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        ");
  }
        }
        
      out.write("\n");
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
