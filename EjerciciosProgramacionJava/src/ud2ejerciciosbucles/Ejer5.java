package ud2ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Escribe un programa que sume independientemente los pares y los impares de
 * los números comprendidos entre A y B (valores que introduce el usuario), y
 * luego muestre por pantalla ambas sumas.
 */
public class Ejer5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un número A ");
        int a = lector.nextInt();
        System.out.println("Dime un número B ");
        int b = lector.nextInt();
        
        int pares = 0, impares = 0;
        for (int i = a; i < b ; i++) {
            if (i % 2 ==0){
                pares += i;
            }
            else {
                impares += i;
            }
        }
        System.out.println("La suma de los números pares es igual a " + pares + "\nSuma de los impares igual a  " + impares);
    }
}
