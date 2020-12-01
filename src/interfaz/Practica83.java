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
public class Practica83 {

    /**
     * @param args Los argumentos de la linea de comando 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Actividad 4***********************");
        InstrumentoMusical instrumento;
        /**
         * Se empieza a llamar la informacion de las demas clases
         */
        instrumento=new Flauta();
        instrumento.tocar();
        instrumento.afinar();
        System.out.println(""+instrumento.tipoInstrumento());
        System.out.println(""+instrumento);
    }
    
}
