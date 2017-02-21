<%-- 
    Document   : success
    Created on : 20-feb-2017, 23:48:42
    Author     : Walo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesio valido</title>
    </head>
    <body>
        <h1>Inicio de sesion valido</h1>
         <h2>Hola <%= request.getAttribute("username") %></h2>
    </body>
</html>
