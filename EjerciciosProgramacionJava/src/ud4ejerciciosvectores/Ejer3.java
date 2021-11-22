/*
 * Proyecto Programaci_n - Archivo Ejer3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 * 
 * Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.   
 */
public class Ejer3 {
    public static void main(String[] args) {

        int[] array = new int[10];
        
        Scanner texto = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Dime un nùmero");
            array [i] = texto.nextInt(); 
        }
        
        double max = array[0], min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            else {
                min = array[i];
            }
            
        }
       
    }
}
