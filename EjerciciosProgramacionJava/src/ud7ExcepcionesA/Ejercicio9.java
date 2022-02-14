package ud7ExcepcionesA;

import java.util.*;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = 0, b = 0, res = 0;

        try {
            System.out.println("Dime un valor entero A");
            a = teclado.nextInt();
            System.out.println("Dime un valor b");
            b = teclado.nextInt();
            res = a / b;
            System.out.println("Resultado es igual a: " + res);

        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
            teclado.nextLine();

        } catch (ArithmeticException e) {
            System.out.println("División por 0");
        }

    }
}
