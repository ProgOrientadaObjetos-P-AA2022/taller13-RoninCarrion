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
public class MatriculaJardin extends Matriculas{
    
 
    @Override
    public void establecerTarifa(){
        // tarifa = costo desayunos + costo libros + costo paseos
        tarifas = 50.2 + 140.2 + 40;
    }
    
    @Override
    public String toString() {
        String mensaje = String.format("->Matricula Jardin: %.2f", tarifas);
        return mensaje;
    }

}
