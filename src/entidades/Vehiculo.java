/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author jairo
 */
public abstract class Vehiculo {
    private String placa;

    public Vehiculo() {
    }

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public abstract double getImporteRenta();
    
    public abstract String getDatosTipoVehiculo();
    
    public String getDatosVehiculos(){
        return "Placa: " + this.placa + "\n" + this.getDatosTipoVehiculo();
    }
    
}
