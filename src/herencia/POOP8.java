/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author David Martinez
 */
public class POOP8 {
    public static void main( String args[]){
        
        /*============={ Actvidad 1 }===========*/
        
        System.out.println("==========={ Actvidad 1 }==========");
        //TODO code application logic here
        Poligono poligono = new Poligono();
        System.out.println("Poligono: " + poligono);
        
        /* Las clases Base pueden comportarse como sus subclases */
        
        Object objeto = new Object();
        System.out.println("Object: " + objeto );
        
        objeto = poligono;
        System.out.println("Object como Poligono: "+ poligono );
        
        Object objeto2 = poligono;
        System.out.println("Object2: "+ objeto2 );
        
        Object objeto3 = new Poligono();
        System.out.println("Object3: " + objeto3 );
        
        System.out.println("==========={ Actvidad 2 }==========");
        
        poligono = new Triangulo();
        System.out.println( poligono );
        selectorPoligonos( poligono );
        
        poligono = new Cuadrilatero();
        System.out.println( poligono );
        selectorPoligonos( poligono );
        
        poligono  = new Poligono();
        System.out.println( poligono );
        selectorPoligonos( poligono );
    }
    
    public static void selectorPoligonos( Poligono poligono ){
        if( poligono instanceof Triangulo ){
            System.out.println("El objeto es un triangulo");

        }else if( poligono instanceof Cuadrilatero ){
            System.out.println("El objeto es un Cuadrilatero ");
        }else if( poligono instanceof Poligono ){
            System.out.println("El objeto es un Poligono ");
        }else{
            System.out.println("El Objeto es otra figura ");
        }
    }
}
