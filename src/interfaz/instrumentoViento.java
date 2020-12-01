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
public class instrumentoViento extends Object implements InstrumentoMusical{
    /**
     * Se crea un constructor vacio de instrumentoViento
     */
    public instrumentoViento() {
    }
       /**
        * Se indica que accion realizara en forma de mensaje
        */
    @Override
    public void tocar(){
        System.out.println("Estoy tocando un instrumento de viento");
    }
    /**
     * Se indica que accion realizara en forma de mensaje
     */
    @Override
    public void afinar(){
        System.out.println("Estoy afinando un instrumento de viento");
    }
    /**
     * 
     * @return Regresa el valor de instrumentoViento para tipoInstrumento
     */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
    /**
     * 
     * @return Regresa de forma de mensaje, el contenido de instrumentoViento
     */
    @Override
    public String toString() {
        return "instrumentoViento{" + '}';
    }
    
    
}
