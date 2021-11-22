package ud2ejercicioscondicionales;

import java.util.Scanner;

/**
 *
 * Escribe un programa que lea tres números enteros y nos diga cuál es el mayor
 */
public class Ejer7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Dime un número entero ");
        a = lector.nextInt();
        System.out.println("Dime otro número entero ");
        b = lector.nextInt();
        System.out.println("Dime otro número entero ");
        c = lector.nextInt();

        if (a >= b && a >= c) {
            System.out.println("El mayor es " + a);
        } 
        else if (b >= c && b >= a) {
            
            System.out.println("El mayor es " + b);    
        }

         else {

            System.out.println("El mayor es " + b);
        }
    }


}
