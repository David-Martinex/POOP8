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
public class Practica82 {
    public static void main(String[] args){
        System.out.println("Actividad 3********************");
        //Poligono poligono=new Poligono();
        Poligono poligono;
        
        poligono=new Triangulo();
        System.out.println(""+poligono);
        
        poligono=new Cuadrilatero();
        System.out.println(""+poligono);
        
    }
}
