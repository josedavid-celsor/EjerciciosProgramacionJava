/*
 * Proyecto Programaci_n - Archivo Ejer4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud3ejercicios;

import java.util.Scanner;

/**
 * 
 *Crea   un   programa   que   pida   por  teclado   tres  cadenas  de   texto:  nombre   y  dos
apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si se
introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC
 */
public class Ejer4 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Dime un texto ");
        String s = texto.nextLine();
        
        System.out.println("Dime otro texto ");
        String s1 = texto.nextLine();
        
        System.out.println("Dime otro texto ");
        String s2 = texto.nextLine();
        
        String s3 = s.substring(0,3) + s1.substring(0,3) + s2.substring(0,3);
        
        System.out.println(s3.toUpperCase());
    }
}
