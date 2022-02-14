package ud7ExcepcionesA;

import java.util.*;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] vector = new double[5];
        double valor = 0;
        for (int i = 0; i < vector.length; i++) {
            try {
                System.out.println("Dime un valor");
                valor = teclado.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto");
                teclado.nextLine();
            }
        }

    }
}
