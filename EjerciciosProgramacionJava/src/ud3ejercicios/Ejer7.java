/*
 * Proyecto Programaci_n - Archivo Ejer7.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud3ejercicios;

import java.util.Scanner;

/**
 * 
 *Crea un programa que pida al usuario introducir una frase F, una palabra P1 y otra
palabra P2. Luego, mostrará F sustituyendo todas las ocurrencias de P1 por P2  
 */
public class Ejer7 {
    public static void main(String[] args) {
         Scanner texto = new Scanner(System.in);
        
        System.out.println("Dime una frase ");
        String f = texto.nextLine();
        
        System.out.println("Dime una palabra ");
        String p1 = texto.nextLine();
        
        System.out.println("Dime otra palabra ");
        String p2 = texto.nextLine();
        
        System.out.println("Sus palabras han sido sustituidas por su frase " + f.replace(p1, p2));
    }
}
