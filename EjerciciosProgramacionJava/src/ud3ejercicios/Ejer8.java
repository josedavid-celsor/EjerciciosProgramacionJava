/*
 * Proyecto Programaci_n - Archivo Ejer8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud3ejercicios;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida al usuario introducir una frase F y una palabra P,
 * y muestre por pantalla cuántas veces aparece P en F.
 */
public class Ejer8 {

    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);

        System.out.println("Dime una frase ");
        String f = texto.nextLine();

        System.out.println("Dime una palabra ");
        String p = texto.nextLine();
        
        int x = f.indexOf(p), cont = 0;
        while (x != -1) {
            x = f.indexOf(p, x + 1)  ;
            cont++;
        }
        System.out.println("F aparace en P las siguientes veces " + cont);
    }
}
