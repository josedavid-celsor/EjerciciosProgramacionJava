package ud2ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Escribe un programa que muestre la tabla de multiplicar del número que
 * indique el usuario
 */
public class Ejer1 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un número ");
        int a = lector.nextInt();
        
        int total = 0;
        
        for (int i = 0; i <= 10; i++) {
            total = a * i;
            System.out.println(a + "x" + i + "=" + total);
        }
    }

}
