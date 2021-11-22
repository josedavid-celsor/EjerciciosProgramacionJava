package ud2ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Escribe un programa que lea una secuencia de notas (valores enteros de 0 a
 * 10) hasta que el usuario introduzca un -1, y luego muestre la suma total, la
 * media y si alguna nota fué un 10
 */
public class Ejer4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a, total = 0, media = 0, contador = 0;
        
        do {
            System.out.println("Dime una nota ");
            a = lector.nextInt();
            if (a != -1)
                break;
            total += a;
            contador += 1;
        } while (a != -1);
         

        media = total / contador ;
        System.out.println("Total " + total + "\nmedia " + media);
    }

}
