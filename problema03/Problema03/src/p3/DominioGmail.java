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
public class DominioGmail implements Dominio{

    private String dominio;

    @Override
    public void establecerDominio(String ak) {
        dominio = String.format("%s", ak);
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }

}