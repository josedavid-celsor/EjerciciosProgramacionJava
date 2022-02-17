package ud7ExcepcionesC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("ERROR: Valor menor a 0");
        }
        System.out.println("Numero positivo es: " + p);
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n > 0) {
            throw new Exception("ERROR: Valor mayor a 0");
        }
        System.out.println("Numero positivo es: " + n);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a = 0;
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Dime un numero postivo");
                a = teclado.nextInt();
                imprimePositivo(a);
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
                i--;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                i--;
            }
        }
        
        boolean seguir = true;
        do {
            try {
                System.out.println("Dime un numero postivo");
                a = teclado.nextInt();
                imprimePositivo(a);
                seguir = false;
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (seguir);
        
        do {
            try {
                System.out.println("Dime un numero negativo");
                a = teclado.nextInt();
                imprimePositivo(a);
                seguir = false;
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (seguir);
        
        /*for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Dime un numero negativo");
                a = teclado.nextInt();
                imprimeNegativo(a);
            } catch (Exception e) {
               
            }

        }*/
    }
}
