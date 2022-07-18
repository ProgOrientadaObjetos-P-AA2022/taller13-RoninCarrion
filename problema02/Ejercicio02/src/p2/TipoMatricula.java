/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioTarifas;
    private ArrayList<Matriculas> a = new ArrayList<>();

    public TipoMatricula() {
    }

    public TipoMatricula(ArrayList<Matriculas> b) {
        a = b;
    }

    public void establecerPromedioTarifas() {
        for (int i = 0; i < a.size(); i++) {
            promedioTarifas += a.get(i).obtenerTarifas();
        }
        promedioTarifas /= a.size();

    }

    public double obtenerPromedioTarifas() {
        return promedioTarifas;
    }

    @Override
    public String toString() {
        String mensaje = String.format("\tMATRICULAS"
        );
        for (int i = 0; i < a.size(); i++) {
            mensaje = String.format("%s\n%s", mensaje, a.get(i));

        }
        mensaje = String.format("%s\n>>Promedio Tarifas: %.2f", mensaje, promedioTarifas);
        return mensaje;
    }

}
