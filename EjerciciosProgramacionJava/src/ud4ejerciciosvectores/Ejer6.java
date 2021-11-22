/*
 * Proyecto Programaci_n - Archivo Ejer6.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud4ejerciciosvectores;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
N, escriba M en todas sus posiciones y lo muestre por pantalla.   
 */
public class Ejer6 {
    
    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);
        System.out.println("Dime un número N");
        int n = texto.nextInt();
        
        System.out.println("Dime un número M");
        int m = texto.nextInt();
        
        int [] array = new int [n];
        
        for (int i =0; i < array.length; i++) {
            array [i] = m;    
        }
        
        System.out.println(Arrays.toString(array));    
    }
}
