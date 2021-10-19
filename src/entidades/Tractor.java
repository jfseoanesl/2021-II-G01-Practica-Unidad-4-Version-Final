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
public class Tractor extends Vehiculo {
    private int noDiasRenta;
    private double precioPorDia;

    public Tractor() {
    }

    public Tractor(String placa, int noDiasRenta, double precioPorDia) {
        super(placa);
        if(noDiasRenta<0 || precioPorDia<0)
            throw new IllegalArgumentException("Los dias de renta, y el precio por dia no pueden ser negativos");
        
        this.noDiasRenta = noDiasRenta;
        this.precioPorDia = precioPorDia;
    }

    /**
     * @return the noDiasRenta
     */
    public int getNoDiasRenta() {
        return noDiasRenta;
    }

    /**
     * @param noDiasRenta the noDiasRenta to set
     */
    public void setNoDiasRenta(int noDiasRenta) {
        this.noDiasRenta = noDiasRenta;
    }

    /**
     * @return the precioPorDia
     */
    public double getPrecioPorDia() {
        return precioPorDia;
    }

    /**
     * @param precioPorDia the precioPorDia to set
     */
    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    @Override
    public double getImporteRenta() {
        return this.noDiasRenta * this.precioPorDia;
    }

    @Override
    public String getDatosTipoVehiculo() {
        return "Dias Rentados: " + this.noDiasRenta + "\n" +
               "Precio x Dia: "  + this.precioPorDia + "\n"+
               "Importe renta; " + this.getImporteRenta()+"\n";
    }
    
    
}
