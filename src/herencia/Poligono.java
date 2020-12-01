/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * clase Poligono, encargado de crear objetos de tipos poligonos y almazenar su información
 * La utilizaremos para heredarla a triangulo
 * @author David Martinez
 */
public class Poligono {

    /**
     * Constructor de poligono sin isignarle ninguna información al mismo
     */
    public Poligono() {
    }
    
    /**
     * @return 0 regresa cero por el momento
     */
    public float area(){
        return 0f;
    }
    
    /**
     * @return  0 regresa cero por el momento
     */
    public float perimetro(){
        return 0;
    }
    
    /**
     * @return  "mesage" se encarga de imprimir toda la informacion guardada en nuestro poligono.
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
