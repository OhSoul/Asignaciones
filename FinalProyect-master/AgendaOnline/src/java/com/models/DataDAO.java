package com.models;

import com.utils.Log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class DataDAO {
    private Connection conexion;
    Log log1 = Log.getInstance("C:\\Users\\Walo\\Desktop\\Errores.txt");
    
    //Metodo para abrir conexion con la base de datos.
     private void abrirConexion() throws SQLException {
        String dbURI = "jdbc:derby://localhost:1527/Deberes";
        String username = "FrijolesCharros";
        String password ="cisco";
        conexion = DriverManager.getConnection(dbURI, username, password);
        }
    
     //Metodo para cerrar conexion con la base de datos
    private void cerrarConexion() throws SQLException{
        conexion.close();
    }
    
    //Metodo insetar tareas por parte del maestro
     public void insertar(DataPOJO bean) {
           
        try{
           abrirConexion();
           log1.write("Se abrio conexion par buscar");
           String insert = "insert into DEBERES (MATERIA, DEBER, FECHA) values  ('"+bean.getMateria() + "', '" + bean.getDeber() +"', '" + bean.getFecha() +"')";        
           Statement stmt = conexion.createStatement();
           stmt.executeUpdate(insert);
           cerrarConexion();
           log1.write("Se cerro conexion par buscar y Se ha insertado su deber"); 
        }catch(Exception e){}
           log1.write("Truena");
    }
     
     //Metodo para buscar tareas de una materia especifica
      public ArrayList<DataPOJO> buscar(DataPOJO pojo1)  {
        try{
            ArrayList <DataPOJO> comentariosList = new ArrayList();
            abrirConexion();
            log1.write("Se abrio conexion par buscar");
            String select = "select MATERIA, DEBER, FECHA from DEBERES where MATERIA = '" + pojo1.getMateria() + "' and FECHA like '%" + pojo1.getFecha()+"%'";
            Statement stmt = conexion.createStatement();
             ResultSet result =stmt.executeQuery(select);
            
            while (result .next()){
               DataPOJO comentario = new DataPOJO();
               comentario.setMateria(result.getString("MATERIA"));
               comentario.setDeber(result.getString("DEBER"));
               comentario.setFecha(result.getString("FECHA"));
               comentariosList.add(comentario);
            } 
           cerrarConexion();
           log1.write("Se cerro conexion par buscar");
           log1.write("Se buscaron los resultados que coinciden con su busqueda");
           return comentariosList;
           
        }catch(Exception e){
        return null;
        }
    }
    
    
    
}
