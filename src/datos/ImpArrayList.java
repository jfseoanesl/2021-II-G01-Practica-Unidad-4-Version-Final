/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Vehiculo;
import excepciones.ExcepcionAccesoDatos;
import java.util.*;

/**
 *
 * @author jairo
 */
public class ImpArrayList implements IAlquilable {
    
    private List lista;

    public ImpArrayList() {
        this.lista = new ArrayList();
    }

    /**
     * @return the lista
     */
    public List getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List lista) {
        this.lista = lista;
    }

    @Override
    public boolean agregarVehiculoRenta(Vehiculo v) throws ExcepcionAccesoDatos {
           return this.lista.add(v);
    }

    @Override
    public Vehiculo eliminarVehiculoDevuelto(Vehiculo v) throws ExcepcionAccesoDatos {
        
        Iterator<Vehiculo> i = this.lista.iterator();
        Vehiculo eliminado = null;
        while(i.hasNext()){
            Vehiculo proximo = i.next();
            if(proximo.getPlaca().equals(v.getPlaca())){
                i.remove();
                return proximo;
            }
        }
        //if(eliminado==null)
            throw new ExcepcionAccesoDatos("El Vehiculo de placa " + v.getPlaca() + " No se encuentra en la lista de rentados" );
        
        //return  eliminado;
        
    }

    @Override
    public int getTotalAlquilados() throws ExcepcionAccesoDatos {
        return this.lista.size();
    }
    
    
    
}
