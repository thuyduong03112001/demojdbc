<%-- 
    Document   : newproduct
    Created on : Sep 23, 2021, 4:04:25 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
    </head>
    <body>
        <h1>New Product</h1>

        <%
            if (request.getAttribute("err") != null) {
        %>
        <h3 style="color: red"><%= request.getAttribute("err")%></h3>

        <%
            }
        %>
    
        <form action="addpro" method="">
            Enter id: <input type="text" name="id"/><br>
            Enter name: <input type="text" name="name"/><br>
            Enter cat_id: <input type="text" name="cat_Id"/><br>
            Link image: <input type="url" name="image"/><br>
            Enter price: <input type="number" name="price"/><br>
            Enter quantity: <input type="number" name="quantity"/><br>
            Enter status: <input type="text" name="status"/><br>
            Enter describe: <input type="text" name="describe"/><br>
            Enter add date: <input type="date" name="adddate"/><br>
            <input type="submit" value="Add Product"/>
        </form>
    </body>
</html>
