/*
 * Proyecto EjerciciosProgramacionJava - Archivo Calculadora.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package CasoPractico;

import java.util.Scanner;

/**
 *
 * 1. Suma (A + B) 2. Resta (A - B) 3. Multiplicación (A * B) 4. División (A /
 * B) 5. Área de un rectángulo (Base x Altura) 6. Área de un triángulo
 * equilátero (Base x Altura / 2) 7. Área de un círculo (Pi x R²) 8. Seno,
 * Coseno y Tangente (de X) 9. Salir
 */
public class Calculadora {

    public static int comprobarNumero(int min, int max) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        if (numero < min && numero > max) {
            return numero;
        } else {
            return numero;
        }

    }

    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.División");
        System.out.println("5.Área de un rectángulo");
        System.out.println("6.Área de un triángulo");
        System.out.println("7.Área de un círculo");
        System.out.println("8.Senp,Coseno y Tangente");
        System.out.println("9.Salir");
        opcion = teclado.nextInt();
        return opcion;
    }

    public static int suma(int a, int b) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime A");
        a = teclado.nextInt();

        System.out.println("Dime B");
        b = teclado.nextInt();

        return a + b;
    }

    public static int resta(int a, int b) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime A");
        a = teclado.nextInt();

        System.out.println("Dime B");
        b = teclado.nextInt();

        return a - b;
    }

    public static int multiplicacion(int a, int b) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime A");
        a = teclado.nextInt();

        System.out.println("Dime B");
        b = teclado.nextInt();

        return a * b;
    }

    public static int Division(int a, int b) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime A");
        a = teclado.nextInt();

        System.out.println("Dime B");
        b = teclado.nextInt();

        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        int opcion = menu();
        boolean salir = false;

        switch (opcion) {

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }

    }
}
