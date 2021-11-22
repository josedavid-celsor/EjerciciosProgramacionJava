package ud2ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Escribe un programa que calcule y muestre el valor de A elevado a B (valores
 * que introduce el usuario) sin hacer uso de la clase Math. Es decir, mediante
 * un bucle que paso a paso multiplica A tantas veces como B.
 */
public class Ejer6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un número A ");
        int a = lector.nextInt();
        System.out.println("Dime un número B ");
        int b = lector.nextInt();

        int res = 1;

        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        System.out.println("El resultado es " + res);
    }
}
