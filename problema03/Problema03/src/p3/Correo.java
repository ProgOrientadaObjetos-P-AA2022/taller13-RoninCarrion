/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public class Correo implements Dominio{
    private String correo;
    private String username;
    
    public void establecerUserName(String u){
        username = u;
    }
    
    public void establecerDominio(String dominio){
        correo = String.format("%s@%s", obtenerUserName(),dominio);
    }
    
    public String obtenerUserName(){
        return username;
    }
    
    public String obtenerDominio(){
        return correo;
    }

    
}
