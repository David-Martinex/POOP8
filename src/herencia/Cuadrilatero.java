/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *  Clase Cuadrilatero que se encarga de crear objetos con datos necesarios para un Cuadrilatero
 *  Nos servira para heredar estos datos a otro objetos que requieren los mismos datos.
 * 
 */
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private float a, b, base, altura;
    
    /**
     * Contructor encargado de contruir un objeto de tipo cuadrilatero basio
     */
    public Cuadrilatero() {
    }
    
    /**
     * Constructor encargado de construir un objeto de tipo cuadrilatero con parametros asignados
     * @param alpha 
     * @param beta
     * @param a 
     * @param b
     * @param base hace referencia a la base del cuadrilatero
     * @param altura hace referencia a la altura del cuadrilatero
     */
    public Cuadrilatero(int alpha, int beta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * @return alpha se encarga de regresar la informacion guardada en 'alpha' de nuestro cuadrilatero
     */
    public int getAlpha() {
        return alpha;
    }
    
    /**
     * @return beta se encarga de regresar la informacion guardada en 'beta' de nuestro cuadrilatero
     */
    public int getBeta() {
        return beta;
    }
    
    /**
     * @return a se encarga de regresar la informacion guardada en 'a' de nuestro cuadrilatero
     */
    public float getA() {
        return a;
    }
    
    /**
     * @return b se encarga de regresar la informacion guardada en 'b' de nuestro cuadrilatero
     */
    public float getB() {
        return b;
    }
    
    /**
     * @return base se encarga de regresar la informacion guardada en 'base' de nuestro cuadrilatero
     */
    public float getBase() {
        return base;
    }
    
    /**
     * @return altura se encarga de regresar la informacion guardada en 'altura' de nuestro cuadrilatero
     */
    public float getAltura() {
        return altura;
    }
    
    /**
     * Se encarga de asignarle nueva informacion al 'alpha' de nuestro cuadrilatero
     * @param alpha nueva información
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    
    /**
     * Se encarga de asignarle nueva informacion al 'beta' de nuestro cuadrilatero
     * @param beta nueva información 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Se encarga de asignarle nueva informacion al 'a' de nuestro cuadrilatero
     * @param a nueva información 
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Se encarga de asignarle nueva informacion al 'b' de nuestro cuadrilatero
     * @param b nueva información 
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Se encarga de asignarle nueva informacion al 'base' de nuestro cuadrilatero
     * @param base nueva información 
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Se encarga de asignarle nueva informacion al 'altura' de nuestro cuadrilatero
     * @param altura nueva información 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Se encarga de imprimir toda la informacion guardada en nuestro Cuadrilatero
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
}
