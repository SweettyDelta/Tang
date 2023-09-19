
package mx.itson.tang.ui;

import java.util.Scanner;


public class NewMain {

   
    public static void main(String[] args) {
        

        Scanner keys = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String input = keys.nextLine().toLowerCase(); // Convertimos la frase a minúsculas
        
        if (esPalindromo(input)) {
            System.out.println("Si es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        
        keys.close();
    }
    
    // Método para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String cadena) {
        // Eliminamos los espacios en blanco y caracteres especiales
        cadena = cadena.replaceAll("[^a-zA-Z]", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        
        int c = 0;
        int c1 = cadena.length() - 1;
        
        while (c < c1) {
            if (cadena.charAt(c) != cadena.charAt(c1)) {
                return false; // No es un palíndromo
            }
            c++;
            c1--;
        }
        return true; // Es un palíndromo
    }
}
  
        
     
    
    

