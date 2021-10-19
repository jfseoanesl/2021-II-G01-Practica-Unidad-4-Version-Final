/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Vehiculo;

/**
 *
 * @author jairo
 */
public class ImpArrays implements IAlquilable{
    private int nMaxVehiculos;
    private int nRegistrados;
    private Vehiculo[] lista;

    public ImpArrays() {
        this.nMaxVehiculos = 1;
        this.nRegistrados=0;
        this.lista = new Vehiculo[this.nMaxVehiculos];
    }

    /**
     * @return the nMaxVehiculos
     */
    public int getnMaxVehiculos() {
        return nMaxVehiculos;
    }

    /**
     * @param nMaxVehiculos the nMaxVehiculos to set
     */
    public void setnMaxVehiculos(int nMaxVehiculos) {
        this.nMaxVehiculos = nMaxVehiculos;
    }

    /**
     * @return the nRegistrados
     */
    public int getnRegistrados() {
        return nRegistrados;
    }

    /**
     * @param nRegistrados the nRegistrados to set
     */
    public void setnRegistrados(int nRegistrados) {
        this.nRegistrados = nRegistrados;
    }

    /**
     * @return the lista
     */
    public Vehiculo[] getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(Vehiculo[] lista) {
        this.lista = lista;
    }

    @Override
    public boolean agregarVehiculoRenta(Vehiculo v) {
        if(this.nRegistrados<this.nMaxVehiculos){
            this.lista[this.nRegistrados] = v;
            this.nRegistrados++;
            return true;
        }
        else{
            throw new NullPointerException("El vehiculo de placa "+v.getPlaca()+" no puede ser agregado a lista de rentados, Se ha superado el limite de objetos de la lista");
        }
    }

    @Override
    public Vehiculo eliminarVehiculoDevuelto(Vehiculo v) {
        
        Vehiculo eliminado = null;
        int posEliminado=0;
        
        for(int i=0; i<this.nRegistrados; i++){
            if(this.lista[i].getPlaca().equals(v.getPlaca())){
                eliminado = this.lista[i];
                posEliminado = i;
                break;
            }
        }
        if(eliminado==null) 
            throw new NullPointerException("El Vehiculo de placa " + v.getPlaca() + "No se encuentra en la lista de rentados" );
        
        for(int i= posEliminado+1; i< this.nRegistrados; i++){
            this.lista[i-1] = this.lista[i];
        }
        
        this.nRegistrados--;
        
        return eliminado;
        
    }

    @Override
    public int getTotalAlquilados() {
        return this.nRegistrados;
    }
    
    
    
    
}
