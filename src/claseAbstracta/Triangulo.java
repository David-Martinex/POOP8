/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

import herencia.*;

/**
 * Clase Triangulo que hace referencias a Objetos de tipo Triangulo y que guardala información necesaria para si misma.
 * Es Heredada de Poligono.
 */
public class Triangulo extends Poligono{
    private float a, b, c, altura, base;
    private int alpha, beta, gama;
    
    /**
     * Constructor de Triangulo que se encarga de crear un objeto de tipo Triangulo sin inicializar sus variables.
     */
    public Triangulo() {
    }
    
    /**
     * Constructpr del Objeto Triangulo que le asignara información a sus variables.
     * @param a Informacion que se le asignara a la variable 'a' de Nuestro Objeto.
     * @param b Informacion que se le asignara a la variable 'b' de Nuestro Objeto.
     * @param c Informacion que se le asignara a la variable 'c' de Nuestro Objeto.
     * @param altura Informacion que se le asignara a la variable 'altura' de Nuestro Objeto.
     * @param base Informacion que se le asignara a la variable 'base' de Nuestro Objeto.
     * @param alpha Informacion que se le asignara a la variable 'alpha' de Nuestro Objeto.
     * @param beta Informacion que se le asignara a la variable 'beta' de Nuestro Objeto.
     * @param gama Informacion que se le asignara a la variable 'gama' de Nuestro Objeto.
     */
    public Triangulo(float a, float b, float c, float altura, float base, int alpha, int beta, int gama) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.altura = altura;
        this.base = base;
        this.alpha = alpha;
        this.beta = beta;
        this.gama = gama;
        System.out.println("Se a Generado el Triangulo");
    }
    
    /**
     * @return a regresara la informacion guardada de nuestra variable 'a' de nuestro Objeto.
     */
    public float getA() {
        return a;
    }
    
    /**
     * @return b regresara la informacion guardada de nuestra variable 'b' de nuestro Objeto.
     */
    public float getB() {
        return b;
    }
    
    /**
     * @return c regresara la informacion guardada de nuestra variable 'c' de nuestro Objeto.
     */
    public float getC() {
        return c;
    }
    
    /**
     * @return altura regresara la informacion guardada de nuestra variable 'altura' de nuestro Objeto.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @return base regresara la informacion guardada de nuestra variable 'base' de nuestro Objeto.
     */
    public float getBase() {
        return base;
    }

    /**
     * @return  alpha regresara la informacion guardada de nuestra variable 'alpha' de nuestro Objeto.
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * @return  beta regresara la informacion guardada de nuestra variable 'beta' de nuestro Objeto.
     */
    public int getBeta() {
        return beta;
    }

    /**
     * @return gama regresara la informacion guardada de nuestra variable 'gama' de nuestro Objeto.
     */
    public int getGama() {
        return gama;
    }
    
    /**
     * @param a se encarga de asignarle nueva información a nuestra variable 'a' de nuestro Objeto.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @param b se encarga de asignarle nueva información a nuestra variable 'b' de nuestro Objeto.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @param c se encarga de asignarle nueva información a nuestra variable 'c' de nuestro Objeto.
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * @param altura se encarga de asignarle nueva información a nuestra variable 'altura' de nuestro Objeto.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @param base se encarga de asignarle nueva información a nuestra variable 'base' de nuestro Objeto.
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @param alpha se encarga de asignarle nueva información a nuestra variable 'alpha' de nuestro Objeto.
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    /**
     * @param beta se encarga de asignarle nueva información a nuestra variable 'beta' de nuestro Objeto.
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    
    /**
     * @param gama se encarga de asignarle nueva información a nuestra variable 'gama' de nuestro Objeto.
     */
    public void setGama(int gama) {
        this.gama = gama;
    }

    /**
     * @return "Mesage" se encarga de regresar e imprimir todos los datos de nuestro Objeto.
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", altura=" + altura + ", base=" + base + ", alpha=" + alpha + ", beta=" + beta + ", gama=" + gama + '}';
    }
    
    /**
     * funcion heredada de Poligono
     * @return ((base*altura)/2) se encarga de regresar el area de nuestro Triangulo.
     */
    @Override
    public float area(){
        return (base*altura)/2;
    }
    
    /**
     * funcion heredada de Poligono
     * @return ( a+b+c) se encarga de regresar el perimetro de nuestro Triangulo.
     */
    @Override
    public float perimetro(){
        return a + b + c;
    }
}
