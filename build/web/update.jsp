<%-- 
    Document   : newcategory
    Created on : Sep 21, 2021, 12:12:50 PM
    Author     : DELL
--%>

<%@page import="model.Category"%>
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
           Category c = (Category)request.getAttribute("category");
           
        %>

        <form action="update" method="post">
            Enter id: <input type="text" readonly name="id" value="<%=c.getId()%>"/><br>
            Enter name: <input type="text" name="name" value="<%= c.getName()%>"/><br>
            Enter describe: <input type="text" name="des" value="<%=c.getDescribe()%>"/><br>
            <input type="submit" value="Update"/>
        </form>
    </body>
</html>
