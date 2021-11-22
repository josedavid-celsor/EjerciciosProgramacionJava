package ud2ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Escribe un programa que pida un número entero al usuario (int) y luego
 * muestre la suma de sus cifras. Por ejemplo, dado el número 35 su suma es 8,
 * dado el número 719 su suma es 17, y dado el 1002 su suma es 3.
 */
public class Ejer13 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un número entero ");
        int a = lector.nextInt();
        int  total = 0;
        while (a > 0) {
           int num1 = a % 10;
           total += num1;
           a/= 10;
        }
        System.out.println("El total es " + total);
        }
    }
