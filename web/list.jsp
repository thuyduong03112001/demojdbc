<%-- 
    Document   : list
    Created on : Sep 21, 2021, 11:22:01 AM
    Author     : DELL
--%>

<%@page import="java.util.List"%>
<%@page import="model.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The list of categories</h1>
        <h3><a href="newcategory.jsp">AddNew</a></h3>
        <table border="1px" width="50%">
            <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Describe</th>
            <th>Action</th>
            </tr>
            <% 
                if(request.getAttribute("data") != null){
                    List<Category> list = (List<Category>)request.getAttribute("data");
                    for (Category i:list) {
                        String id= i.getId();
            %>
             <tr>
                <td><%= id%></td>
                <td><%= i.getName()%></td>
                <td><%= i.getDescribe()%></td>
                <td>
                    <a href="#" onclick="doDelete('<%= id%>')">Delete</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="update?id=<%= id%>">Update</a>
                </td>
             </tr>
            <% }
            %>
            </table>
            <select>
                <%
                    for(Category c:list){
                        String st= c.getId()+" - "+ c.getName();
                    %>
                    <option value="<%=c.getId()%>"><%=st%></option>
                    <%
                       } 
                    %>
                    
            </select>
            <%
                }
            %>
        
    </body>
</html>
<script type="text/javascript">
    function doDelete(id){
        if(confirm("Are you sure about that? id= '" + id+ "'?")){
            window.location="delete?id="+id;
        }
    }
</script>