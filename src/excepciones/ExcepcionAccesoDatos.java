/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.IOException;

/**
 *
 * @author jairo
 */
public class ExcepcionAccesoDatos extends IOException {

    public ExcepcionAccesoDatos(String message) {
        super(message);
    }
    
}
