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
public class Correo {

    private Dominio dominio;
    private String correo;
    private String username;

    public void establecerDominio(Dominio dom) {
        dominio = dom;
    }

    public void establecerUserName(String u) {
        username = u;
    }

    public void establecerCorreo() {
        correo = String.format("%s@%s", obtenerUserName(), dominio.obtenerDominio());
    }

    public String obtenerUserName() {
        return username;
    }

    public Dominio obtenerDominio() {
        return dominio;
    }

    public String obtenerCorreo() {
        return correo;
    }

}
