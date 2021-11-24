/*
 * Proyecto Programaci_n - Archivo Ejer10.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud3ejercicios;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida una cadena de texto y luego muestre sus palabras
 * una a una en líneas separadas. Por ejemplo, dada la cadena de texto “Hola,
 * ¿qué tal estás?” mostrará por pantalla: Hola, ¿qué tal estás?
 */
public class Ejer10 {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        System.out.println("Dime una cadena de textos");
        String f = texto.nextLine();
        for (int i = 0; i < f.length(); i++) {
            char a = f.charAt(i);
            System.out.println(i);
            if (i == ' ') {
                System.out.println("");
                
            }
    }
    }
}
