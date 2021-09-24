<%-- 
    Document   : updateproduct
    Created on : Sep 23, 2021, 11:50:28 PM
    Author     : DELL
--%>

<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
    </head>
    <body>
        <h1>Update Product</h1>

        <%
           Product p = (Product)request.getAttribute("product");
           
        %>
        <form action="UpdateProductServlet" method="post">
            Enter id: <input type="text" readonly name="id" value="<%=p.getId()%>"/><br>
            Enter name: <input type="text" name="name" value="<%= p.getName()%>"/><br>
            Enter cat_id: <input type="text" readonly name="cat_Id" value="<%= p.getCat_Id()%>"/><br>
            Link image: <input type="url" name="image" value="<%= p.getImage()%>"/><br>
            Enter price: <input type="number" name="price" value="<%= p.getPrice()%>"/><br>
            Enter quantity: <input type="number" name="quantity" value="<%= p.getQuantity()%>"/><br>
            Enter status: <input type="text" name="status" value="<%= p.getStatus()%>"/><br>
            Enter describe: <input type="text" name="describe" value="<%=p.getDescribe()%>"/><br>
            Enter add date: <input type="date" name="adddate" value="<%= p.getAdddate()%>"/><br>
            <input type="submit" value="Update"/>
        </form>
    </body>
</html>
