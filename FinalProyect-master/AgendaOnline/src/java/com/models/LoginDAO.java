/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.utils.Log;

/**
 *
 * @author Julio MANCHA HDZ 
 */
public class LoginDAO {
    private Connection conexion;
    Log log = Log.getInstance("C:\\Users\\moust\\Desktop\\lab9.txt");

    
    private void abrirConexion()throws SQLException {
        String url = "jdbc:derby://localhost:1527/REGISTRO";
        String username = "FrijolesCharros";
        String password = "cisco";
        
        conexion = DriverManager.getConnection(url, username, password);
    }
    private void cerrarConexion ()throws SQLException{
        conexion.close();
        
    }
    
//    public void insertar(ComentariosPOJO pojo){  
//        try{
//            abrirConexion();
//            String insert = "insert into COMENTARIOS (NOMBRE, COMENTARIO) values  ('"+pojo.getNombre() + "', '" + pojo.getComentarios() +"')";
//            Statement stmt = conexion.createStatement();
////            int filasAfectadas = 
//            stmt.executeUpdate(insert);
//            cerrarConexion();
////            return filasAfectadas > 0;
//            //return true;
//        }catch(Exception e){
////            write("Ha ocurrido un error!");
//                log.write("EL error es de tipo: " + e);
//        }
//    }
    public String obtenerUsername(User user){
         try{
            abrirConexion();
            Statement stmt = conexion.createStatement();
            String select = "select USERNAME, username from REGISTRO where USERNAME = '" + user.getUsername() + "'"; 
            ResultSet mensajes = stmt.executeQuery(select);
            //User user1 = new User();
            
            while(mensajes.next()){         
                user.setUsername(mensajes.getString("USERNAME"));              
            }
            cerrarConexion();
            return user.getUsername();
        }catch(Exception e){
            log.write("EL error es de tipo: " + e);
            return null;
        }
    
    }
    public String obtenerPassword(User user){
        try{
            abrirConexion();
            Statement stmt = conexion.createStatement();
            String select = "select USER, password from REGISTRO where PASSWORD = '" + user.getPassword() + "'";
            ResultSet mensajes = stmt.executeQuery(select);
            User user2 = new User();
            
            while(mensajes.next()){
               user.setUsername(mensajes.getString("PASSWORD"));
            }
            cerrarConexion();
            return user.getUsername();
        }catch(Exception e){
            log.write("EL error es de tipo: " + e);
            return null;
        }
        
    }
//    public int obtenerSemestre(User user){
//        try{
//            abrirConexion();
//            Statement stmt = conexion.createStatement();
//            String select = "select USERNAME, semestre from REGISTRO where SEMESTRE = '" + user.getSemestre()+"'"; // and NOMBRE like '%" + user.getName() +"%'";
//            ResultSet mensajes = stmt.executeQuery(select);
//           // while(mensajes.next()){
//                user.setSemestre(mensajes.getInt("SEMESTRE"));
//                ///user.setName(mensajes.getString("NOMBRE"));
//           // }
//            cerrarConexion();
//            return user.getSemestre();
//        }catch(Exception e){
//           
//            return 999999;
//        }
//    }
        
    
}
