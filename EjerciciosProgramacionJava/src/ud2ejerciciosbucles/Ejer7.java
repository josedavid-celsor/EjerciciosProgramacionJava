package ud2ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Escribe un programa que lea un número positivo N y calcule y visualice su
 * factorial N! Siendo el factorial: 0! = 1, 1! = 1, 2! = 2 * 1, 3! = 3 * 2* 1,
 * N! = N * (N-1) * (N-2) * ... * 1
 */
public class Ejer7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un número  ");
        int a = lector.nextInt();
        int factorial = 1; 
        for (int i = a; i > 0; i--) {
            factorial*=i;
            
        }
       System.out.println("El factorial es " + factorial); 
    }
}
