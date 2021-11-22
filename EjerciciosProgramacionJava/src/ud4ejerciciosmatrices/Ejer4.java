/*
 * Proyecto Programaci_n - Archivo Ejer4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud4ejerciciosmatrices;

import java.util.Scanner;

/**
 * 
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
“Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
teclado y luego el programa mostrará la nota mínima, máxima y media de cada
alumno.   
 */
public class Ejer4 {
    
    public static void main(String[] args) {
        
        double[][] notas = new double [4][5];
        int suma = 0;
        
        Scanner texto = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + i + 1);
            for (int j = 0; j < notas.length; j++) {
                System.out.println("Nota Asignatura " + j + 1 + ":");
                notas[i][j] = texto.nextInt();
                suma += notas[i][j];
            }
        }
        for (int i = 0; i < notas.length; i++) {
            double[] nota = notas[i];
            
        }
    }

}
