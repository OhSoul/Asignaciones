/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.models;

/**
 *
 * @author Walo
 */
public class Authentication {
    public static boolean authenticate(String username, String password){
    
        String userDataBase = "j";
        String passwordDataBase = "c";
        
        if(username.equals(userDataBase)&& password.equals(passwordDataBase) ){
            return true;
        }else{
            return false;
        }
        
    }    
    
}
