/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 *  Clase Poligono que hace referencia a un Objeto Poligono capas de guardar y manejar la información de este
 *  La utilizaremos para heredar cierta Información y la hacemos abstracta.
 */
public abstract class Poligono {
    
    /**
     * funcion de tipo abstracto del area de nuestro poligono.
     */
    public abstract float area();
    
    /**
     * funcion de tipo abstracto del perimetro de nuestro poligono.
     */
    public abstract float perimetro();
    
    /**
     * @return "Mesage" se encargara de imprimir toda la información de nuestro poligono.
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
