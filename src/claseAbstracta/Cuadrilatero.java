/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * Clase Cuadrilatero que se encarga de crear objetos con datos necesarios para un Cuadrilatero
 * Nos servira para heredar estos datos a otro objetos que requieren la misma información
 * es Heredera de Poligono.
 */
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private float a, b, base, altura;
    
    /**
     * Constructor de Cuadrilatero que crea el Objeto sin inicializar ninguna de sus variables que le conforman
     */
    public Cuadrilatero() {
    }
    
    /**
     * Constructor de Cuadrilatero que crea un Objeto con la información que se le asignado.
     * @param alpha información que se le asignara a nuestro Objeto Cuadrilatero.
     * @param beta información que se le asignara a nuestro Objeto Cuadrilatero.
     * @param a información que se le asignara a nuestro Objeto Cuadrilatero.
     * @param b información que se le asignara a nuestro Objeto Cuadrilatero.
     * @param base información que se le asignara a nuestro Objeto Cuadrilatero.
     * @param altura información que se le asignara a nuestro Objeto Cuadrilatero.
     * 
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
     * @return alpha regresa la información guardada en 'alpha' de nuestro Cuadrilatero.
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * @return beta regresa la información guardada en 'alpha' de nuestro Cuadrilatero.
     */
    public int getBeta() {
        return beta;
    }

    /**
     * @return  a regresa la información guardada en 'a' de nuestro Cuadrilatero.
     */
    public float getA() {
        return a;
    }

    /**
     * @return  b regresa la información guardada en 'b' de nuestro Cuadrilatero.
     */
    public float getB() {
        return b;
    }

    /**
     * @return  base regresa la información guardada en 'base' de nuestro Cuadrilatero.
     */
    public float getBase() {
        return base;
    }
    
    /**
     * @return  altura regresa la información guardada en 'altura' de nuestro Cuadrilatero.
     */
    public float getAltura() {
        return altura;
    }
    
    /**
     * @param alpha nueva informacion que le asignaremos al 'alpha' de nuestro Cuadrilatero.
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    
    /**
     * @param beta nueva informacion que le asignaremos al 'beta' de nuestro Cuadrilatero.
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    
    /**
     * @param a nueva informacion que le asignaremos al 'a' de nuestro Cuadrilatero.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @param b nueva informacion que le asignaremos al 'b' de nuestro Cuadrilatero.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @param base nueva informacion que le asignaremos al 'base' de nuestro Cuadrilatero.
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @param altura nueva informacion que le asignaremos a la 'altura' de nuestro Cuadrilatero.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return "Mesage" se encarga de regresar e imprimir toda la información de nuestro Poligono.
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
    /**
     * funcion heredada de Poligono.
     * @return (base*altura) que viene siendo el area de nuestro cuadrilatero. 
     */
    @Override
    public float area(){
        return base * altura;
    }
    
    /**
     * funcion heredada de Poligono.
     * @return ((2*a) + (2*b)) que viene siendo el perimetro de nuestro cuadrilatero. 
     */
    @Override
    public float perimetro(){
        return (2*a) + (2*b);
    }
}
