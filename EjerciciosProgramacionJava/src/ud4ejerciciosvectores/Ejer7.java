/*
 * Proyecto Programaci_n - Archivo Ejer7.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida dos valores enteros P y Q, luego cree un array que
 * contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
 */
public class Ejer7 {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        System.out.println("Dime un número P");
        int p = texto.nextInt();

        System.out.println("Dime un número Q");
        int q = texto.nextInt();

        int[] array = new int [q - p + 1] ;

        for (int i = p; i < q; i++) {
            
            

        }
    }
}
