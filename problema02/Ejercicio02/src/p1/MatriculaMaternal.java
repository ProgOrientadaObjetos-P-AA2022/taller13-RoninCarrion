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
public class MatriculaMaternal extends Matriculas {

    @Override
    public void establecerTarifa() {
        // tarifa = costo desayunos + costo almuerzo + costo medico
        tarifas = 50.2 + 40.2 + 80.2;
    }

    @Override
    public String toString() {
        String mensaje = String.format("->Matricula Maternal: %.2f", tarifas);
        return mensaje;
    }
    
}
