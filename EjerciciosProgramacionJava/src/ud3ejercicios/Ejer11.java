/*
 * Proyecto Programaci_n - Archivo Ejer11.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud3ejercicios;

import java.util.Scanner;

/**
 *
 * Crea un programa que lea una frase por teclado e indique si la frase es un
 * palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y
 * minúsculas). Supondremos que el usuario solo introducirá letras y espacios
 * (ni comas, ni puntos, ni acentos, etc.). NOTA: Un palíndromo es un texto que
 * se lee igual de izquierda a derecha que de derecha a izquierda. Por ejemplo:
 * ◦Amigo no gima ◦Dabale arroz a la zorra el abad ◦Amo la pacífica paloma ◦A
 * man a plan a canal Panama
 */
public class Ejer11 {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);

        System.out.println("Dime una cadena de textos");
        String f = texto.nextLine();

        int inicio = 0, fin = f.length();
        boolean error = false;

        while ((inicio < fin) && (!error)) {
            if (f.charAt(inicio) == f.charAt(fin)) {
                inicio++;
                fin--;
            } else {
                error = true;
            }
        }
            if (!error) {
                System.out.println("Es palindromo la frase");
            }
            else {
                System.out.println("No es palindromo la frase ");
            }
    }
}
