
package mx.itson.tang.ui;

import java.util.Scanner;

/**
 * Inicia el programa y determina el punto de partida de la ejecución.
 * @author alexi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keys = new Scanner(System.in);
        
        System.out.println("Ingrese el texto a evaluar");
        
        String oracion = keys.nextLine();
        
        String nuevaOracion = oracion.replace("t", "g");
        System.out.println(nuevaOracion);
        
       /* boolean resultado = oracion.startsWith("a");
        
        
        if(resultado){
        System.out.println("Si inicia con a");
        }else{
            System.out.println("No inicia con a");
        }
        
        //////////
        
        if(oracion.startsWith("a")){
        System.out.println("Si inicia con a");
        }else{
            System.out.println("No inicia con a");
        }
        
        ////////
        
        System.out.println(oracion.startsWith("a")? "Si inicia con a" : "No inicia con a");
        */
    }
    
}