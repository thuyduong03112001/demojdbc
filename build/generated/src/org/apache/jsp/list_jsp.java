package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Category;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>The list of categories</h1>\n");
      out.write("        <h3><a href=\"newcategory.jsp\">AddNew</a></h3>\n");
      out.write("        <table border=\"1px\" width=\"50%\">\n");
      out.write("            <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>Describe</th>\n");
      out.write("            <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 
                if(request.getAttribute("data") != null){
                    List<Category> list = (List<Category>)request.getAttribute("data");
                    for (Category i:list) {
                        String id= i.getId();
            
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                <td>");
      out.print( id);
      out.write("</td>\n");
      out.write("                <td>");
      out.print( i.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( i.getDescribe());
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"#\" onclick=\"doDelete('");
      out.print( id);
      out.write("')\">Delete</a>\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <a href=\"update?id=");
      out.print( id);
      out.write("\">Update</a>\n");
      out.write("                </td>\n");
      out.write("             </tr>\n");
      out.write("            ");
 }
            
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <select>\n");
      out.write("                ");

                    for(Category c:list){
                        String st= c.getId()+" - "+ c.getName();
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(c.getId());
      out.write('"');
      out.write('>');
      out.print(st);
      out.write("</option>\n");
      out.write("                    ");

                       } 
                    
      out.write("\n");
      out.write("                    \n");
      out.write("            </select>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function doDelete(id){\n");
      out.write("        if(confirm(\"Are you sure about that? id= '\" + id+ \"'?\")){\n");
      out.write("            window.location=\"delete?id=\"+id;\n");
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
