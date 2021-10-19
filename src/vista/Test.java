/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.*;
import entidades.*;

/**
 *
 * @author jairo
 */
public class Test {
    public static void main(String[] args) {
        
      IAlquilable lista = new ImpArrays();
      
      int opcion = Lector.leerEntero("Lea la opcion del menu: ");
      
      
     try{ 
      Vehiculo v2 = new Tractor("567", -5, -600);
      Vehiculo v1 = new Autobus("568", 0, 100, 500);
      
      lista.agregarVehiculoRenta(v1);
      //lista.agregarVehiculoRenta(v2);
      
      System.out.println(v1.getDatosVehiculos());
      //System.out.println(v2.getDatosVehiculos());
     } 
     catch(IllegalArgumentException iae){
         System.out.println("Error de constructores: " + iae);
     }
     catch(NullPointerException npe){
         System.out.println("Error de lista: " + npe);
     }
      
      
        
        
    }
    
}
