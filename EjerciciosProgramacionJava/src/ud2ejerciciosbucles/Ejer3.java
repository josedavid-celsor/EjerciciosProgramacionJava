package ud2ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Escribe un programa que lea una secuencia de números hasta que se introduzca
 * un 0, y luego muestre cuantos eran positivos y cuantos negativos.
 */
public class Ejer3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a, contador = 0, negat = 0;
        
        do {
            System.out.println("Dime un número ");
             a = lector.nextInt();
        } while (a != 0);
        if ( a < 0) {
            negat+=1;
        }
        else {
            contador += 1;
        } 
        System.out.println("Los positivos son " + contador + "\n Y los negativos son " + negat);
    }
}
