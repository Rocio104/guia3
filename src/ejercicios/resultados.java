package ejercicios;

import java.util.Scanner;


public class resultados {
    public static void main(String [] asrg) {
        Scanner leer = new Scanner (System.in);
        
        casa objeto = new casa();
        
        System.out.println("El N° de su casa asignada es: " +objeto.getNcasa());
        System.out.println("El numero de su pasaje es: " +objeto.getNpasaje());
        System.out.println("El nombre de su calle asignada es: " +objeto.getNombreC());
        
        
        
    }
    
}