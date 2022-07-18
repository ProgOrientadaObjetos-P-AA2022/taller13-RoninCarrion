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
public class MatriculaCampamento extends Matriculas{
    
    @Override
    public void establecerTarifa(){
        // tarifa = costo transporte + costo comida + costo instructores
        tarifas = 100.2 + 30.2 + 90.2;
    }
        @Override
    public String toString() {
        String mensaje = String.format("->Matricula Campamento: %.2f", tarifas);
        return mensaje;
    }
}
