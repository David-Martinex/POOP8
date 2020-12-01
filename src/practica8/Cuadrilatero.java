/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

/**
 *
 * @author User
 */
public class Cuadrilatero extends Poligono{
    private int alpha,betta;
    private float a,b,base,altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(int alpha, int betta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.betta = betta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBetta() {
        return betta;
    }

    public void setBetta(int betta) {
        this.betta = betta;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", betta=" + betta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
}
