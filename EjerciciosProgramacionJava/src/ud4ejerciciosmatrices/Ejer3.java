/*
 * Proyecto Programaci_n - Archivo Ejer3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud4ejerciciosmatrices;

import java.util.Scanner;

/**
 *
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
 * teclado) e introduzca en ella NxM valores (también introducidos por teclado).
 * Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos
 * valores son mayores que cero, cuántos son menores que cero y cuántos son
 * igual a cero.
 */
public class Ejer3 {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        System.out.println("Dime valor N");
        int n = texto.nextInt();

        System.out.println("Dime valor M");
        int m = texto.nextInt();

        int contador = 0, igual = 0;
        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Dime el valor de " + i + ":" + j);
                matriz[i][j] = texto.nextInt();
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < 0) {
                    contador++;
                } else if (matriz[i][j] == 0) {
                    igual++;
                }
            }
        }
        System.out.println("Menores de cero son " + contador);
        System.out.println("Igual a cero " + igual);
    }
}
