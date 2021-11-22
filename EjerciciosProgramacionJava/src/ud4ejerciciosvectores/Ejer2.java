/*
 * Proyecto Programaci_n - Archivo Ejer2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud4ejerciciosvectores;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego muestre la suma de todos los valores.  
 */
public class Ejer2 {
    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);
        int suma = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Dime un nùmero: ");
            array [i] = texto.nextInt();
            suma += array[i];
        }
        System.out.println(suma);
    }
    }


