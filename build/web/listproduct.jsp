<%-- 
    Document   : list
    Created on : Sep 21, 2021, 11:22:01 AM
    Author     : DELL
--%>

<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
        <style>
            table {
                width:100%;
                border-collapse: collapse;
                text-align: center;
            }
            th{
                padding: 20px 30px;
            }
            th, td {
                border-top: 1px solid #E9EFF8;
            }
            tbody tr:nth-child(odd) {
                background-color: #f2f2f2;
            }
            body {
                font-family: 'Open Sans', sans-serif;
                font-weight: 300;
            }
        </style>
    </head>
    <body>
        <h1 style="text-align: center; font-family: cursive">The list of product</h1>
        <h2 style="text-align: center; border: 2px solid #94979D; padding: 10px; background: #94979D"><a style="color: #ffffff" href="newproduct.jsp">Add New</a></h2>
        <table border="1px" width="50%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Cat_Id</th>
                <th>Image</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Status</th>
                <th>Describe</th>
                <th>Add date</th>
                <th>Action</th>
            </tr>
            <%
                if (request.getAttribute("data") != null) {
                    List<Product> ls = (List<Product>) request.getAttribute("data");
                    for (Product i : ls) {
            %>
            <tr>
                <td><%= i.getId()%></td>
                <td><%= i.getName()%></td>
                <td><%= i.getCatId()%></td>
                <td><img src="<%= i.getImage()%>" width="250px" height="200px"></td>
                <td><%= i.getPrice()%></td>
                <td><%= i.getQuantity()%></td>
                <td><%= i.getStatus()%></td>
                <td><%= i.getDescribe()%></td>
                <td><%= i.getAdddate()%></td>
                <td style="padding: 30px 70px">
                    <a href="#" onclick="doDelete('<%= i.getId()%>')">Delete</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="UpdateProductServlet?id=<%= i.getId()%>">Update</a>
                </td>
            </tr>
            <% }
            %>
        </table>

        <%
            }
        %>

    </body>
</html>
<script type="text/javascript">
    function doDelete(id) {
        if (confirm("Are you sure about that? id= '" + id + "'?")) {
            window.location = "deletepro?id=" + id;
        }
    }
</script>