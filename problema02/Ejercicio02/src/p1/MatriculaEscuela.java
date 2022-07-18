/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.Matriculas;

/**
 *
 * @author reroes
 */
public class MatriculaEscuela extends Matriculas {

    @Override
    public void establecerTarifa() {
        // tarifa = costo libros + costo deportes + costo folletos + 
        //          costo uniformes
        tarifas = 50.2 + 40.2 + 140.2 + 200.4;
    }
        @Override
    public String toString() {
        String mensaje = String.format("->Matricula Escuela: %.2f", tarifas);
        return mensaje;
    }
}
