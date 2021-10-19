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
public class Autobus extends Vehiculo {
    private int kmInicioRenta;
    private int kmDevolucion;
    private double precioPorKm;

    public Autobus() {
    }

    public Autobus(String placa, int kmInicioRenta, int kmDevolucion, double precioPorKm) {
        super(placa);
        
        if(kmInicioRenta > kmDevolucion )
            throw new IllegalArgumentException("Los Km devueltos deben ser mayot a los Km de Inicio");
        
        if(kmInicioRenta<0 || kmDevolucion <0 || precioPorKm<0)
            throw new IllegalArgumentException("Los Km devueltos, de Inicio y el Precio del Km no pueden ser negativos");
        
            
        this.kmInicioRenta = kmInicioRenta;
        this.kmDevolucion = kmDevolucion;
        this.precioPorKm = precioPorKm;
    }

    /**
     * @return the kmInicioRenta
     */
    public int getKmInicioRenta() {
        return kmInicioRenta;
    }

    /**
     * @param kmInicioRenta the kmInicioRenta to set
     */
    public void setKmInicioRenta(int kmInicioRenta) {
        this.kmInicioRenta = kmInicioRenta;
    }

    /**
     * @return the kmDevolucion
     */
    public int getKmDevolucion() {
        return kmDevolucion;
    }

    /**
     * @param kmDevolucion the kmDevolucion to set
     */
    public void setKmDevolucion(int kmDevolucion) {
        this.kmDevolucion = kmDevolucion;
    }

    /**
     * @return the precioPorKm
     */
    public double getPrecioPorKm() {
        return precioPorKm;
    }

    /**
     * @param precioPorKm the precioPorKm to set
     */
    public void setPrecioPorKm(double precioPorKm) {
        this.precioPorKm = precioPorKm;
    }

    @Override
    public double getImporteRenta() {
        return (this.kmDevolucion-this.kmInicioRenta)*this.precioPorKm;
    }

    @Override
    public String getDatosTipoVehiculo() {
        return "Km inicio: " + this.kmInicioRenta + "\n"+
               "Km DEvolucion: " + this.kmDevolucion + "\n"+
               "Precio x Km: "  + this.precioPorKm + "\n" +
                "Importe renta: " + this.getImporteRenta()+"\n";
    }
    
    
    
}
