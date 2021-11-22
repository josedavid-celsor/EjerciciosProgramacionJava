/*
 * Proyecto Programaci_n - Archivo Ejer4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida veinte números enteros por teclado, los almacene en
 * un array y luego muestre por separado la suma de todos los valores positivos
 * y negativos.
 */
public class Ejer4 {

    public static void main(String[] args) {

        int[] array = new int[20];
        

        Scanner texto = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {

            System.out.println("Dime un nùmero");
            array[i] = texto.nextInt();
        }
        
        double positivo = 0, negativos = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positivo += array[i];
            } else {
                negativos += array[i];
            }

        }
        System.out.println("La suma de positivos es igual a:  " + positivo);
        System.out.println("La suma de negativos es igual a:  " + negativos);
                       
    }
}
