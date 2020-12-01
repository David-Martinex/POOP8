/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author User
 */
public class Flauta extends instrumentoViento{
    /**
     * Se crea un constructor vacio para Flauta
     */
    public Flauta() {
    }
    /**
     * 
     * @return Regresa el valor de Flauta para tipoInstrumento
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
    /**
     * 
     * @return Regresa en forma de mensaje el contenido de Flauta
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
}
