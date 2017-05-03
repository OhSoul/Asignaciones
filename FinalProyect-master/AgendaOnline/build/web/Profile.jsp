<%-- 
    Document   : Profile
    Created on : 25/04/2017, 01:04:54 AM
    Author     : moust
--%>
<%@page import="com.models.DataPOJO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AgendaOnline</title>
    </head>
    <body>
        <form action="ProfileController">
            <h1>Profile</h1>
            <h2>Hola, Julio</h2>

            <h3>Username: <%= session.getAttribute("username")%></h3> 

            <h3>Semestre: 2 </h3>

            <h3>Carrera: Licenciado en Seguridad en Tecnologia de Informacion</h3>
            <a href="LogoutController" value="Regresar" >Cerrar Sesion</a>
            <input type="button" value="Insertar" onclick="mostrarInsertar()">
        <input type="button" value="Buscar" onclick="mostrarBuscar()">
        <div id="buscarDeber" style='display:none;'>
        <form action="DataController" method="POST">
            <label>Materia: <input type="text" name="materiaEnv"/></label>
            <div>Si gusta puede buscar por fecha.</div>
            <label>Fecha: <input type="text" name="fechaEnv"/></label>
            <input type="submit" name="enviarCO">
            <input type="hidden" name="action" value="search">
       </form>
        </div>
        <div id="insertarDeber" style='display:none;'>
            <form action="DataController" method="POST">
            <label>Materia: <input type="text" name="materiaEnv"/></label>
            <label>Deber: <input type="text" name="deberEnv"/></label>
            <div>Si gusta puede buscar por fecha.</div>
            <label>Fecha: <input type="text" name="fechaEnv"/></label>
            <input type="submit" name="enviarCO">
            <input type="hidden" name="action" value="insert">
            </form>
        </div>
        <script type="text/javascript">
           function mostrarBuscar(){
              document.getElementById('buscarDeber').style.display = 'block';
           }
           function mostrarInsertar(){
              document.getElementById('insertarDeber').style.display = 'block';
           }
            
        </script>
        <% if (session != null){
           List deberes = (List) session.getAttribute("Deberes");
            if(deberes != null){
                System.out.println("Resultados");
          %>
        <table border="1">
            <tr>
                <td>Materia</td>
                <td>Deberes</td>
                <td>Fecha</td>
                
            </tr>
        <% for(Object o : deberes){
            DataPOJO comentario = (DataPOJO) o;
        %>    
            <tr>
                <td><%=comentario.getMateria()%></td>
                <td><%=comentario.getDeber()%></td>
                <td><%=comentario.getFecha()%></td>
            </tr>
            <% }%>
            
            
        </table>
        <%  }
        }
        %>
        
    </body>
</html>
