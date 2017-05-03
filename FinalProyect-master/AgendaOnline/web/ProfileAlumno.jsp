<%@page import="com.models.DataPOJO"%>
<%@page import="java.util.List"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% if (session != null){
           List deberesA = (List) session.getAttribute("DeberesA");
            if(deberesA != null){
                out.println("Resultados");
          %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alumno</title>
    </head>
    <body>
        <h3>Bienvenido Alumno</h3>
        <div>¿Que materias le gustaria revisar?</div>
        <form action="DataAlumnoController" method=POST>
            <select name ="materiaAlum">
            <% for(Object o : deberesA){
            DataPOJO tareaA = (DataPOJO) o;
            %>
            <option value="<%=tareaA.getMateria() %>"><%=tareaA.getMateria() %></option>
                
            
            <% }%>
            </select>
            <div>Si desea puede buscar por fecha :</div>
            <label> Fecha de entrega: <input type="text" name="fechaAlum"></label>
            <input type="submit" value="Buscar">
            <input type="hidden" name="action" value="buscar">
        </form>
                  
        <%  }
        }
        %>
        
        <% if (session != null){
           List deberesB = (List) session.getAttribute("DeberesA");
            if(deberesB != null){
                out.println("Resultados");
          %>
          
          <table border="1">
            <tr>
                <td>Materia</td>
                <td>Deberes</td>
                <td>Fecha</td>
                
            </tr>
        <% for(Object o : deberesB){
            DataPOJO deber = (DataPOJO) o;
        %>    
            <tr>
                <td><%=deber.getMateria()%></td>
                <td><%=deber.getDeber()%></td>
                <td><%=deber.getFecha()%></td>
            </tr>
            <% }%>
            
            
        </table>
        <%  }
        }
        %>
       </body>
</html>
