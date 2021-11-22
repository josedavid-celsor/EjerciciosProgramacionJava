package ud2ejerciciosbucles;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Escribe un programa que calcule y muestre la suma y el producto (multiplicación) de 
los 10 primeros números naturales.
 */
public class Ejer2 {
    public static void main(String[] args) {
        int sum = 0, multi = 1;
        
        
        for (int i = 1; i <= 10; i++) {
            sum += i;
            multi *= i;
        }
        System.out.println("Resultado suma es igual a " + sum +" \nY el resultado multi es igual a " + multi);
    }
}
