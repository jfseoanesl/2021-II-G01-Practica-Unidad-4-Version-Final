/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import entidades.*;
import excepciones.*;
import logica.AgenciaRenta;
import logica.Fabrica;

/**
 *
 * @author jairo
 */
public class VistaConsola {
    
    private String opcionesMenu[] = {"1. Rentar Vehiculos", "2. Devolver Vehiculos", "3. Salir"};
    private int opcionSeleccionada;
    private AgenciaRenta agencia;

    public VistaConsola() {
        this.agencia = new AgenciaRenta();
    }

    /**
     * @return the opcionesMenu
     */
    public String[] getOpcionesMenu() {
        return opcionesMenu;
    }

    /**
     * @param opcionesMenu the opcionesMenu to set
     */
    public void setOpcionesMenu(String[] opcionesMenu) {
        this.opcionesMenu = opcionesMenu;
    }

    /**
     * @return the opcionSeleccionada
     */
    public int getOpcionSeleccionada() {
        return opcionSeleccionada;
    }

    /**
     * @param opcionSeleccionada the opcionSeleccionada to set
     */
    public void setOpcionSeleccionada(int opcionSeleccionada) {
        this.opcionSeleccionada = opcionSeleccionada;
    }

    /**
     * @return the agencia
     */
    public AgenciaRenta getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(AgenciaRenta agencia) {
        this.agencia = agencia;
    }
    
    
    public void rentarVehiculo() throws ExcepcionEntidad, ExcepcionAccesoDatos {
         
        System.out.println("*** 1. RENTA DE VEHICULO ***");
         System.out.println("Datos del vehiculo: ");
        
         Vehiculo v = this.leerVehiculo();
         this.agencia.agregarVehiculoRenta(v);
         System.out.println("Vehiculo Rentado Exitosamente");
        
    }
    
    public void devolverVehiculo() throws ExcepcionAccesoDatos{
        System.out.println("*** Devolucion de Vehiculo *** ");
        String placa = Lector.leerString("Placa del vehiculo");
        Vehiculo v = new Autobus();
        v.setPlaca(placa);
        
        Vehiculo devuelto = this.agencia.eliminarVehiculoDevuelto(v);
        System.out.println(devuelto.getDatosVehiculos());
        
    }
   
    public Vehiculo leerVehiculo() throws ExcepcionEntidad{
        Vehiculo v;
        String placa = Lector.leerString("Placa: ");
        int tipo = Lector.leerEntero("Tipo de vehiculo [1->Autobus][*->Tractor]: ");
        switch(tipo){
            case 1: int kmInicio = Lector.leerEntero("Km inicio: ");
                    int kmDevolucion = Lector.leerEntero("Km devolucion: ");
                    int PrecioKm = Lector.leerEntero("Precio x Km: ");
                    v = Fabrica.getVehiculo("Autobus", placa, kmInicio, kmDevolucion, PrecioKm, 0, 0);
                    break;
            default: int noDiasRenta = Lector.leerEntero("Dias de renta: ");
                     int precioDia = Lector.leerEntero("Precio x Dia: ");
                     v = Fabrica.getVehiculo("Tractor", placa, 0, 0, 0, noDiasRenta, precioDia);
        }
        
        return v;
    }
    
    public void menuOpciones(){
        System.out.println("");
        System.out.println("*** MENU OPCIONES - AGENCIA RENTA ***");
        for(String item: this.opcionesMenu){ // for each
            System.out.println(item);
        }
        System.out.println("");
        this.opcionSeleccionada = Lector.leerEntero("Escoja una opcion: ");
        
    }
    
    public void evaluarOpcionMenu(){
       
        try{
            switch(this.opcionSeleccionada){
                case 1: this.rentarVehiculo();break;
                case 2: this.devolverVehiculo();break;
                case 3: System.out.println("Ha finalizado la ejecucion del aplicativo."); break;
                default: System.out.println("La opcion seleccionada no esta disponible, intente nuevamente");

            }
        }catch(ExcepcionAccesoDatos ead){
            System.out.println(ead.getMessage());
        }
        catch(ExcepcionEntidad ee){
            System.out.println(ee.getMessage());
        }
    }
    
    public void runMenu(){
        
        do{
             this.menuOpciones();
             this.evaluarOpcionMenu();
             
        }while(this.opcionSeleccionada!=3);
    }
    
    
}
