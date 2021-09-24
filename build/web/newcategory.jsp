<%-- 
    Document   : newcategory
    Created on : Sep 21, 2021, 12:12:50 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>New category</h1>

        <%
            if (request.getAttribute("error") != null) {
        %>
        <h3 style="color: red"><%= request.getAttribute("error")%></h3>

        <%
            }
        %>

        <form action="add" method="">
            Enter id: <input type="text" name="id"/><br>
            Enter name: <input type="text" name="name"/><br>
            Enter describe: <input type="text" name="des"/><br>
            <input type="submit" value="Add"/>
        </form>
    </body>
</html>
