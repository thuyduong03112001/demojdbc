package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;
import java.util.List;

public final class listproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Page</title>\n");
      out.write("        <style>\n");
      out.write("            table {\n");
      out.write("                width:100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                padding: 20px 30px;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                border-top: 1px solid #E9EFF8;\n");
      out.write("            }\n");
      out.write("            tbody tr:nth-child(odd) {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                font-family: 'Open Sans', sans-serif;\n");
      out.write("                font-weight: 300;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"text-align: center; font-family: cursive\">The list of product</h1>\n");
      out.write("        <h2 style=\"text-align: center; border: 2px solid #94979D; padding: 10px; background: #94979D\"><a style=\"color: #ffffff\" href=\"newproduct.jsp\">Add New</a></h2>\n");
      out.write("        <table border=\"1px\" width=\"50%\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Cat_Id</th>\n");
      out.write("                <th>Image</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Quantity</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("                <th>Describe</th>\n");
      out.write("                <th>Add date</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                if (request.getAttribute("data") != null) {
                    List<Product> ls = (List<Product>) request.getAttribute("data");
                    for (Product i : ls) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( i.getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( i.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( i.getCatId());
      out.write("</td>\n");
      out.write("                <td><img src=\"");
      out.print( i.getImage());
      out.write("\" width=\"250px\" height=\"200px\"></td>\n");
      out.write("                <td>");
      out.print( i.getPrice());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( i.getQuantity());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( i.getStatus());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( i.getDescribe());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( i.getAdddate());
      out.write("</td>\n");
      out.write("                <td style=\"padding: 30px 70px\">\n");
      out.write("                    <a href=\"#\" onclick=\"doDelete('");
      out.print( i.getId());
      out.write("')\">Delete</a>\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <a href=\"UpdateProductServlet?id=");
      out.print( i.getId());
      out.write("\">Update</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function doDelete(id) {\n");
      out.write("        if (confirm(\"Are you sure about that? id= '\" + id + \"'?\")) {\n");
      out.write("            window.location = \"deletepro?id=\" + id;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>");
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
