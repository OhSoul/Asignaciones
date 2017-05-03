/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author SEG-14
 */
public class Authenticate {
//   public static boolean isValid(String username, String password) {
//        //User user = new User();
//
//        //username.equals(userDataBase) realiza una comparación entre las cadenas username y userDataBase
//        //Si son iguales devuelve true. Si son diferentes devuelve false.
////        if (username.equals(Database.getUsername()) && password.equals(Database.getPassword())) {
//            return true;
//        } else {
//            return false;
//        }
       public static boolean isValid(String username, String password) {
        LoginDAO dao = new LoginDAO();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        String username2  = dao.obtenerUsername(user);
        String password2 = dao.obtenerPassword(user);
        //username.equals(userDataBase) realiza una comparación entre las cadenas username y userDataBase
        //Si son iguales devuelve true. Si son diferentes devuelve false.
        if (username.equals(username2) && password.equals(password2)) {
            return true;
        } else {
            return false;
        }
    }
}
