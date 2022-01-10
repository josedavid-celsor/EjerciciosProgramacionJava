package AceptaElReto;

import java.util.Scanner;

public class PerimetroRectangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();

        while (a >= 0 && b >= 0) {
            int p = 2 * (a + b);
            System.out.println(p);
            
            a = teclado.nextInt();
            b = teclado.nextInt();
        }

    }
}
