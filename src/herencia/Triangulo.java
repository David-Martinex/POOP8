/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Clase Triangulo que guarda la informacion necesaria para un Triangulo
 * Heredada de Poligono
 * @author David Martinez
 */
public class Triangulo extends Poligono{
    private float a, b, c, altura, base;
    private int alpha, beta, gama;
    
    /**
     * Constructor de Triangulo que crea un triangulo sin inicializar sus datos.
     */
    public Triangulo() {
    }
    
    /**
     * Constructor encargado de crear un Triangulo con Información indicada
     * @param  a hace referencia a uno de los lados de nuestro Triangulo
     * @param  b hace referencia a uno de los lados de nuestro Triangulo
     * @param  c hace referencia a uno de los lados de nuestro Triangulo
     * @param  altura hace referencia a la Altura de nuestro triangulo
     * @param  base hace referencia a la Base de nuestro Triangulo
     * @param  alpha hace referencia a uno de los Grados de nuestro Triangulo
     * @param  beta hace referencia a uno de los Grados de nuestro Triangulo
     * @param  gama hace referencia a uno de los Grados de nuestro Triangulo
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
     * @return a regresa la información de 'a' que es uno de los lados de nuestro triangulo.
     */
    public float getA() {
        return a;
    }
    
    /**
     * @return b regresa la información de 'b' que es uno de los lados de nuestro triangulo.
     */
    public float getB() {
        return b;
    }
    
    /**
     * @return c regresa la información de 'c' que es uno de los lados de nuestro triangulo.
     */
    public float getC() {
        return c;
    }
    
    /**
     * @return altura regresa la información de la 'altura' de nuestro triangulo.
     */
    public float getAltura() {
        return altura;
    }
    
    /**
     * @return base regresa la información de la 'base' de nuestro triangulo.
     */
    public float getBase() {
        return base;
    }
    
    /**
     * @return alpha regresa uno de los angulos de nuestro Triangulo.
     */
    public int getAlpha() {
        return alpha;
    }
    
    /**
     * @return beta regresa uno de los angulos de nuestro Triangulo.
     */
    public int getBeta() {
        return beta;
    }
    
    /**
     * @return gama regresa uno de los angulos de nuestro Triangulo.
     */
    public int getGama() {
        return gama;
    }
    
    /**
     * @param a asignamos nueva informacion para 'a' de nuestro Triangulo. 
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @param b asignamos nueva informacion para 'b' de nuestro Triangulo. 
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @param c asignamos nueva informacion para 'c' de nuestro Triangulo. 
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * @param altura asignamos nueva informacion para 'altura' de nuestro Triangulo. 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @param base asignamos nueva informacion para 'base' de nuestro Triangulo. 
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @param alpha asignamos nueva informacion para 'alpha' de nuestro Triangulo. 
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    /**
     * @param beta asignamos nueva informacion para 'beta' de nuestro Triangulo. 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    
    /**
     * @param gama asignamos nueva informacion para 'gama' de nuestro Triangulo. 
     */
    public void setGama(int gama) {
        this.gama = gama;
    }
    
    /**
     * @return  se encarga de regresar e imprimir toda la informacion guardada en nuestro Triangulo.
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", altura=" + altura + ", base=" + base + ", alpha=" + alpha + ", beta=" + beta + ", gama=" + gama + '}';
    }
    
}
