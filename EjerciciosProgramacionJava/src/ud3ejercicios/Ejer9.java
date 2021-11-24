/*
 * Proyecto Programaci_n - Archivo Ejer9.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud3ejercicios;

import java.util.Scanner;

/**
 * 
 * Crea un programa que pida al usuario introducir una cadena de texto con dos
palabras y luego muestre por pantalla las dos palabras en líneas distintas. Por
ejemplo, dada la cadena de texto “Hola Lionel” mostrará por pantalla:
hola
Lionel   
 */
public class Ejer9 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        System.out.println("Dime un texto con dos palabras");
        String f = texto.nextLine();
        
        for (int i = 0; i < f.length(); i++) {
            char a = f.charAt(i);
            System.out.println(i);
            if (i == ' ') {
                System.out.println("");
                
            }
            
        }
        
    }
}
