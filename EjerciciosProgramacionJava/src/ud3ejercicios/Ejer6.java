/*
 * Proyecto Programaci_n - Archivo Ejer6.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud3ejercicios;

import java.util.Scanner;

/**
 * 
 * Crea un programa que pida al usuario introducir una  frase F  y una palabra P, y
muestre por pantalla:
◦Si F contiene P.
◦Si F empieza por P.
◦Si F termina por P. 
 */
public class Ejer6 {
    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);
        
        System.out.println("Dime una frase ");
        String f = texto.nextLine();
        
        System.out.println("Dime una palabra ");
        String p = texto.nextLine();
        
        if (f.indexOf(p) > 0 ) {
            System.out.println("La frase contiene la palabra " + p);
        }
        else if (f.startsWith(p)) {
            System.out.println("La frase empieza por la palabra " + p);
            
        }
        else {
            System.out.println("La frase termina por la palabra " + p );
        }
            
    }
}
