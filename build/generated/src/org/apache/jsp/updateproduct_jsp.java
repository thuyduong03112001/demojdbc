package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;

public final class updateproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Update Product</h1>\n");
      out.write("\n");
      out.write("        ");

           Product p = (Product)request.getAttribute("product");
           
        
      out.write("\n");
      out.write("        <form action=\"UpdateProductServlet\" method=\"post\">\n");
      out.write("            Enter name: <input type=\"text\" name=\"name\" value=\"");
      out.print( p.getName());
      out.write("\"/><br>\n");
      out.write("            Enter image: <input type=\"text\" name=\"image\" value=\"");
      out.print( p.getImage());
      out.write("\"/><br>\n");
      out.write("            Enter price: <input type=\"text\" name=\"price\" value=\"");
      out.print( p.getPrice());
      out.write("\"/><br>\n");
      out.write("            Enter quantity: <input type=\"text\" name=\"quantity\" value=\"");
      out.print( p.getQuantity());
      out.write("\"/><br>\n");
      out.write("            Enter status: <input type=\"text\" name=\"status\" value=\"");
      out.print( p.getStatus());
      out.write("\"/><br>\n");
      out.write("            Enter describe: <input type=\"text\" name=\"describe\" value=\"");
      out.print(p.getDescribe());
      out.write("\"/><br>\n");
      out.write("            Enter add date: <input type=\"text\" name=\"adddate\" value=\"");
      out.print( p.getAdddate());
      out.write("\"/><br>\n");
      out.write("            Enter id: <input type=\"text\" readonly name=\"id\" value=\"");
      out.print(p.getId());
      out.write("\"/><br>\n");
      out.write("            Enter cat_id: <input type=\"text\" readonly name=\"cat_Id\" value=\"");
      out.print( p.getCat_Id());
      out.write("\"/><br>\n");
      out.write("            <input type=\"submit\" value=\"Update\"/>\n");
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
