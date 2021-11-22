/*
 * Proyecto Programaci_n - Archivo Ejer1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud4ejerciciosmatrices;

/**
 *
 * Crea un programa que cree una matriz de 10x10 e introduzca los valores de las
 * tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la
 * matriz por pantalla.
 */
public class Ejer1 {

    public static void main(String[] args) {

        int[][] tablas = new int[10][10];
        int multi = 1;

        for (int i = 0; i < tablas.length; i++) {
            System.out.print("Tabla del " + (i + 1) + ":");
            for (int j = 0; j < tablas.length; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
                System.out.println(tablas[i][j]);
            }

        }

    }
}
