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
public class MatriculaColegio extends Matriculas{
    private double tarifa;
    
    @Override
    public void establecerTarifa(){
        // tarifa = costo deportes + costo folletos + 
        //          costo uniformes + costo laboratorios
        tarifas = 150.2 + 140.2 + 240.2 + 300.4;
    }
        @Override
    public String toString() {
        String mensaje = String.format("->Matricula Colegio: %.2f", tarifas);
        return mensaje;
    }
}
