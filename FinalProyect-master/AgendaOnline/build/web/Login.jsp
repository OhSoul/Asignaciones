<%-- 
    Document   : Login
    Created on : 24/04/2017, 11:22:38 PM
    Author     : moust
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Iniciar Session</h1>
        <form action="LoginController" method="POST">
            <label>Usuario:</label>
            <input type="text" name="username" value="">
            <br></br>
            <label>Password:</label>
            <input type="password" value="" name="password">
            <br></br>
            <input type="submit" value="Iniciar Sesion" name="submit">
        </form>
    </body>
</html>
