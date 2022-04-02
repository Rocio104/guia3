
package ejercicios;

import java.util.Scanner;


public class resultadoCal {
    public static void main(String [] asrg) {
        Scanner leer = new Scanner(System.in);
        
        calcuoIva objeto = new calcuoIva();
        
        //parametro 1
        
        System.out.println("Ingrese el precio del articulo");
        objeto.setPrecio(leer.nextDouble());
        
        System.out.println("Ingrese el valor de IVA edel articulo");
        objeto.setIva(leer.nextDouble());
        
        System.out.println("El precio del articulo sin IVA es de: " +objeto.getPrecio());
        System.out.println("El valor de IVA en el articulo es de: " +objeto.getIva());
        System.out.println("El total a pagar + IVA es de: " + objeto.calculo1());
        
        //parametro 2
        
        System.out.println("Ingrse el precio del articulo con IVA");
        objeto.setPrecio(leer.nextDouble());
        
        System.out.println("Ingrese el valor de IVA");
        objeto.setIva(leer.nextDouble());
        
        System.out.println("El precio de el articulo con IVA es de: " +objeto.getPrecio());
        System.out.println("El valor de IVA en el articulo es de: " +objeto.getIva());
        System.out.println("El totl a pagar sin IVA incluido es de: " +objeto.calculo2());
    }
        
        
    
}
