/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;


/**
 *
 * @author User
 */
public class Triangulo extends Poligono{
    private float a,b,c,base,altura;
    private int alpha,betta,gamma;

    public Triangulo() {
    }

    public Triangulo(float a, float b, float c, float base, float altura, int alpha, int betta, int gamma) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.betta = betta;
        this.gamma = gamma;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
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

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", betta=" + betta + ", gamma=" + gamma + '}';
    }
    
    @Override
    public float area(){
        return (base*altura/2);
    }
    
    @Override
    public float perimetro(){
        return (a+b+c);
    }
}
