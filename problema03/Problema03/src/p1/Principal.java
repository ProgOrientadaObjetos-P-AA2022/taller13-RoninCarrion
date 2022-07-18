/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.Dominio;
import p3.Dominio;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
         */
        Dominio dominio = null;
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");

        ArrayList<Correo> lista = new ArrayList<>();
        Correo c = new Correo();
        c.establecerUserName(e.obtenerUserName());
        c.establecerDominio("gmail.com");
        lista.add(c);

        e.establecerCorreos(lista);

        System.out.printf("%s\n", e);

    }

}
