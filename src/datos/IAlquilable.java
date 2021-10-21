/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.*;
import excepciones.ExcepcionAccesoDatos;

/**
 *
 * @author jairo
 */
public interface IAlquilable {
    
    boolean agregarVehiculoRenta(Vehiculo v) throws ExcepcionAccesoDatos;
    Vehiculo eliminarVehiculoDevuelto(Vehiculo v) throws ExcepcionAccesoDatos;
    int getTotalAlquilados() throws ExcepcionAccesoDatos;
    
}
