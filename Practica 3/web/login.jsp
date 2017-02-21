<%-- 
    Document   : login
    Created on : 20-feb-2017, 23:47:57
    Author     : Walo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido</h1><br/>
        
        <form action="LoggingController" method="POST">
            <label> Usuario: <input type="text" name="usuario-txt"/></label><br/>
            <label> Contraseña: <input type="password" name="contraseña-txt"/></label><br/>
            <input type="submit" name="Iniciar sesion" value="Iniciar sesion"/>
           
       </form>
    </body>
</html>
