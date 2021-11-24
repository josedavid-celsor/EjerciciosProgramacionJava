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

    public static int pedirrango(int min, int max) {

        Scanner teclado = new Scanner(System.in);
        int valor;

        do {
            System.out.println("Dime un valor entre " + min + " y " + max);
            valor = teclado.nextInt();
            if (valor < min || valor > max) {
                System.out.println("ERROR: Numero no válido.");
            }
        } while (valor < min || valor > max);
        return valor;

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
        return pedirrango(1, 9);
    }

    public static void suma() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime A");
        int a = teclado.nextInt();

        System.out.println("Dime B");
        int b = teclado.nextInt();

        int suma =  a +b;
        
        System.out.println("El resultado es " + suma);
    }

    public static void resta() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime A");
        int a = teclado.nextInt();

        System.out.println("Dime B");
        int b = teclado.nextInt();
        
        int resta = a - b;

        System.out.println("El resultado es " + resta);
    }

    public static void multiplicacion() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime A");
        int a = teclado.nextInt();

        System.out.println("Dime B");
        int b = teclado.nextInt();

        int  multiplicacion = a * b;
        System.out.println("El resultado es " + multiplicacion);
    }

    public static void Division() {

        int division;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime A");
        int a = teclado.nextInt();

        System.out.println("Dime B");
        int b = teclado.nextInt();

        if (b != 0) {
            division = a / b;
            System.out.println("EL resultado es " + division);
        } else {
            System.out.println("Error b no es diferente a 0");
        }
    }
    
    public static void AreaRectangulo() {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime base del rectangulo");
        int a = teclado.nextInt();

        System.out.println("Dime altura del rectangulo ");
        int b = teclado.nextInt();

        int  multiplicacion = a * b;
        System.out.println("El resultado es " + multiplicacion);
    }
}



    
       

