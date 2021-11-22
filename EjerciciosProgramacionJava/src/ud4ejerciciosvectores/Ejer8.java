/*
 * Proyecto Programaci_n - Archivo Ejer8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud4ejerciciosvectores;
import java.lang.Math;

/**
 * 
 * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y
1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
mostrará cuántos valores del array son igual o superiores a R.   
 */
public class Ejer8 {
    public static void main(String[] args) {
        
        int[] array = new int[100];
        
        for (int i = 0; i < array.length; i++) {
            array [i] = (int) Math.random();
            
        }
    }
}
