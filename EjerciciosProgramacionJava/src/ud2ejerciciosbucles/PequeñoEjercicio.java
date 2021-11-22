package ud2ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Mostrar los 10 primeros números de la secuencia fibonacci
 */
public class PequeñoEjercicio {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, suma = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }
}
