
package encapsulamiento.herencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;


    public class RegistroEstudiante {
    public static void main(String[] args) {
        Estudiante est= new Estudiante();
        BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Carnet del estudiante:");
            long carnet=Long.parseLong(leer.readLine());
            System.out.println("Nombres de el estudiante:");
            String nombres= leer.readLine();
            System.out.println("Apellidos del estudiante:");
            String apellidos=leer.readLine();
            
            est.setCarnetEstudiante(carnet);
            est.setNombreEstudiante(nombres);
            est.setApellidosEstudiante(apellidos);
            
            System.out.println("<<<Recuperando valores>>>");
            System.out.println("Carnet: "+est.getCarnetEstudiante());
            System.out.println("Nombre: "+est.getNombreEstudiante());
            System.out.println("Apellidos: "+est.getApellidosEstudiante());
            
            
}catch (Exception e){
            System.out.println(e.getMessage());
    }
}
    
    
}
