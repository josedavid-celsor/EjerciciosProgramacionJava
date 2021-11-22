/*
 * Proyecto Programaci_n - Archivo Ejer2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud4entregable;

import java.util.Scanner;

/**
 *
 * @author José David Rosales Rios <jdrrdaw@gmail.com>
 * @version 1.2
 * @date $[date] $[time]
 */
public class Ejer2 {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        //pedir al usuario los valores de la matriz
        System.out.println("Dime el tamaño de la matriz");
        int tamaño = texto.nextInt();

        int[][] matriz = new int[tamaño][tamaño];
        //rellenar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Dime el valor de " + i + ":" + j);
                matriz[i][j] = texto.nextInt();
            }
        }
        //variables para guardar la suma de los lados
        int posicion = 0, vector = (tamaño * 2) + 2;
        int[] suma = new int[vector];
        int posiDiago = tamaño - 1;
        boolean magico = true;

        //suma de filas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma[posicion] += matriz[i][j];

            }
            posicion++;
        }
        //suma de columnas
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz.length; k++) {
                suma[posicion] += matriz[k][j];
            }
            posicion++;
        }

        //suma diagonal izquierda
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    suma[posicion] += matriz[i][j];
                }

            }
            posicion++;
        }
        //suma diagonal derecho
        for (int i = 0; i < matriz.length; i++) {
            for (int j = posiDiago + 1; j < matriz.length; j++) {
                suma[posicion] += matriz[i][j];
            }
            posicion++;
        }
        //Mostrar Matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
            System.out.println("");
        }
        //comprobar si los numeros son iguales
        for (int i = 0; i < posicion - 1; i++) {
            if (suma[i] == suma[i + 1]) {
                magico = true;
            } else {
                magico = false;
                break;
            }
        }

        for (int i = 0; i < posicion; i++) {
            System.out.println(suma[i] + "  ");
        }
        if (magico) {
            System.out.println("Es un cuadrado magico");
        }
        else {
            System.out.println("No es un cuadrado magico");
        }
    }
}
