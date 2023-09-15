
package mx.itson.tang.ui;


import java.util.Scanner;


public class Main2 {

    
    public static void main(String[] args) {
        //// Crea un objeto Scanner para leer la entrada estándar (teclado).
        Scanner keys = new Scanner(System.in);
        //// Muestra un mensaje para que el usuario ingrese números de celular.
        System.out.println("Ingrese los numeros de celular");
        //// Lee la línea ingresada por el usuario y la almacena en la variable 'numeros'.
        String numeros = keys.nextLine();
        //// Limpia 'numeros' de caracteres especiales y espacios en blanco.
        String nuevoNumero = numeros.replace("-", "").replace("(", "").replace(")", "").replace(" ", "");
        System.out.println(nuevoNumero);
        //// Imprime el número de teléfono limpio.
        
        
         //// Divide 'nuevoNumero' en un arreglo de cadenas usando comas como delimitador y almacena el resultado en 'n'.
        String[] n = nuevoNumero.split(",");
        
       
        int tijuana = 0; // Inicializa un contador para números de Tijuana.
        int hermosillo =0; // Inicializa un contador para números de Hermosillo.
        int guaymas = 0; // Inicializa un contador para números de Guaymas.
        int desconocido = 0; // Inicializa un contador para números desconocidos.
        
        for(String s: n ){// Itera a través de las cadenas en 'n'.
            
           if( s.startsWith("664")){
               /*
               Comprueba si la cadena 's' comienza con "664".*/
                
                tijuana++; //Incrementa el contador de Tijuana.
               
           } else if(s.startsWith("662")){/*
               Comprueba si la cadena 's' comienza con "662".*/
               hermosillo ++;//Incrementa el contador de Hermosillo
           
           }
           else if(s.startsWith("622")){/*
               Comprueba si la cadena 's' comienza con "622".*/
               
               guaymas++; //Incrementa el contador de Guaymas
               
           }else{
               // Si no coincide con ninguno de los prefijos anteriores, se considera desconocido y se incrementa el contador correspondiente.
               desconocido++; //Incrementa el contador de desconocido
           }
           
           
           
          
        }
      // Imprime el recuento de números de teléfono para cada categoría.
        System.out.println("Tijuana= " + tijuana);
        
        System.out.println("Hermosillo= " + hermosillo);
    
        System.out.println("Guaymas= " + guaymas);
        
        System.out.println("Numero desconocido= " + desconocido);
        
        
    }
    
}
