package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>New Product</h1>\n");
      out.write("\n");
      out.write("        ");

            if (request.getAttribute("error") != null) {
        
      out.write("\n");
      out.write("        <h3 style=\"color: red\">");
      out.print( request.getAttribute("error"));
      out.write("</h3>\n");
      out.write("\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    \n");
      out.write("        <form action=\"addpro\" method=\"\">\n");
      out.write("            Enter id: <input type=\"text\" name=\"id\"/><br>\n");
      out.write("            Enter name: <input type=\"text\" name=\"name\"/><br>\n");
      out.write("            Enter cat_id: <input type=\"text\" name=\"cat_Id\"/><br>\n");
      out.write("            Enter image: <input type=\"text\" name=\"image\"/><br>\n");
      out.write("            Enter price: <input type=\"text\" name=\"price\"/><br>\n");
      out.write("            Enter status: <input type=\"text\" name=\"status\"/><br>\n");
      out.write("            Enter describe: <input type=\"text\" name=\"describe\"/><br>\n");
      out.write("            Enter add date: <input type=\"text\" name=\"adddate\"/><br>\n");
      out.write("            <input type=\"submit\" value=\"Add Product\"/>\n");
      out.write("        </form>\n");
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
