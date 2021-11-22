/*
 * Proyecto Programaci_n - Archivo Ejer5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 * 
 * Crea un programa que pida veinte números reales por teclado, los almacene en un
array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de
valores.  
 */
public class Ejer5 {
    public static void main(String[] args) {
        int[] array = new int[20];
        double suma = array[0];

        Scanner texto = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {

            System.out.println("Dime un nùmero");
            array[i] = texto.nextInt();
            suma += array[i];
        }
        double media = suma / 20;
        System.out.println("La media de los números reales es igual a:  "  + media);
    }
}
