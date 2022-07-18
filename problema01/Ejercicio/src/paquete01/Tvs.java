/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author ronni
 */
public class Tvs {

    private double totalPrecios;
    private String marcasVendidas;
    private double televisorCaro;
    private ArrayList<Televisor> televisor;
    
    public Tvs(ArrayList<Televisor> a) {
        televisor = a;
        televisorCaro = 0;
        marcasVendidas = "";
    }

    public void establecerListaTelevisor(ArrayList<Televisor> a) {
        televisor = a;
    }

    public void establecerTotalPrecios() {
        for (int i = 0; i < televisor.size(); i++) {
            totalPrecios += televisor.get(i).obtenerPrecio();
        }

    }
    public void establecerTelevisorMasCaro(){
        for (int i = 0; i < televisor.size(); i++) {
            if(televisor.get(i).obtenerPrecio()>televisorCaro){
                televisorCaro = televisor.get(i).obtenerPrecio();
            }
            
        }
    }
    public void establecerListaMarcasVendidas(){
        for (int i = 0; i < televisor.size(); i++) {
            marcasVendidas = String.format("%s\n\t>>%s", marcasVendidas, 
                    televisor.get(i).obtenerMarca());          
        }
    
    }

    public double obtenerTotalPrecios() {
        return totalPrecios;
    }

    public String obtenerMarcasVendidas() {
        return marcasVendidas;
    }

    public double obtenerTelevisorCaro() {
        return televisorCaro;
    }

    public ArrayList<Televisor> obtenerTelevisor() {
        return televisor;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Total Precios: %.2f\n"
                + "Lista de Marcas Vendidas: %s\n"
                + "Precio del Televisor más Caro: %.2f", totalPrecios
                , marcasVendidas
                , televisorCaro);
        return mensaje;
    }
    
    

}
