/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.*;

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
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        String userName = "rrealizalde";

        ArrayList<Correo> lista = new ArrayList<>();
        Correo c = new Correo();
        c.establecerUserName(e.obtenerUserName());
        //---------- Gmail -----------
        DominioGmail dg = new DominioGmail();
        dg.establecerDominio("gmail.com");
        Correo c1 = new Correo();
        c1.establecerUserName(userName);
        c1.establecerDominio(dg);
        c1.establecerCorreo();
        lista.add(c1);

        //---------- Outlook -----------
        DominioOutlook dO = new DominioOutlook();
        dO.establecerDominio("gmail.com");
        Correo c2 = new Correo();
        c2.establecerUserName(userName);
        c2.establecerDominio(dO);
        c2.establecerCorreo();
        lista.add(c2);

        //---------- Gobierno -----------
        DominioGob dominioGob = new DominioGob();
        dominioGob.establecerDominio("gob.ec");
        Correo c3 = new Correo();
        c3.establecerUserName(userName);
        c3.establecerDominio(dominioGob);
        c3.establecerCorreo();
        lista.add(c3);

        // --------UTPL---------
        DominioUTPL dominioUTPL = new DominioUTPL();
        dominioUTPL.establecerDominio("utpl.edu.ec");
        Correo c4 = new Correo();
        c4.establecerUserName(userName);
        c4.establecerDominio(dominioUTPL);
        c4.establecerCorreo();
        lista.add(c4);
        // --------- Yahoo ---------
        DominioYahoo dominioYahoo = new DominioYahoo();
        dominioYahoo.establecerDominio("yahoo.com");
        Correo c5 = new Correo();
        c5.establecerUserName(userName);
        c5.establecerDominio(dominioYahoo);
        c5.establecerCorreo();
        lista.add(c5);

        e.establecerCorreos(lista);

        System.out.println(e);

    }

}
