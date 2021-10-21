/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import entidades.*;
import excepciones.ExcepcionEntidad;

/**
 *
 * @author jairo
 */
public class Fabrica {
    
    public static Vehiculo getVehiculo(String tipo, String placa, int kmInicioRenta, int kmDevolucion, double precioPorKm, 
            int noDiasRenta, double precioPorDia) throws ExcepcionEntidad{
       
        Vehiculo v;
        try{
            switch(tipo){
                case "Autobus": v = new Autobus(placa, kmInicioRenta, kmDevolucion, precioPorKm);break;
                default:  v = new Tractor(placa, noDiasRenta, precioPorDia);
            }
            return v;
        }catch(IllegalArgumentException iae){
            throw new ExcepcionEntidad(iae.getMessage());
        }    
    }
    
}
