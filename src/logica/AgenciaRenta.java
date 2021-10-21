/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.*;
import entidades.Vehiculo;
import excepciones.ExcepcionAccesoDatos;

/**
 *
 * @author jairo
 */
public class AgenciaRenta {
    private IAlquilable listaVehiculosAlquilados;

    public AgenciaRenta() {
        //this.listaVehiculosAlquilados = new ImpArrays();
        this.listaVehiculosAlquilados = new ImpArrayList();
    }

    /**
     * @return the listaVehiculosAlquilados
     */
    public IAlquilable getListaVehiculosAlquilados() {
        return listaVehiculosAlquilados;
    }

    /**
     * @param listaVehiculosAlquilados the listaVehiculosAlquilados to set
     */
    public void setListaVehiculosAlquilados(IAlquilable listaVehiculosAlquilados) {
        this.listaVehiculosAlquilados = listaVehiculosAlquilados;
    }
    
    public boolean agregarVehiculoRenta(Vehiculo v) throws ExcepcionAccesoDatos{
        
        return this.listaVehiculosAlquilados.agregarVehiculoRenta(v);
        
    }
    
    public Vehiculo eliminarVehiculoDevuelto(Vehiculo v) throws ExcepcionAccesoDatos{
        
        return this.listaVehiculosAlquilados.eliminarVehiculoDevuelto(v);
        
    }
    
    
}
