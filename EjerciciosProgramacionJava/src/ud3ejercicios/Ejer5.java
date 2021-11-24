/*
 * Proyecto Programaci_n - Archivo Ejer5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */

package ud3ejercicios;

import java.util.Scanner;

/**
 * 
 * Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
(cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
diferenciar entre mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me
mima” dirá que hay:
◦Nº de A: 3
◦Nº de E: 1
◦Nº de I: 2
◦Nº de O: 0
◦Nº de U: 0 
 */
public class Ejer5 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Dime un texto ");
        String s = texto.nextLine();
        
        char vocales [] = { 'a', 'e', 'i', 'o', 'u'};
        int cantidad [] = new int [5];
        
        for (int i = 0; i < vocales.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)== vocales[i]){
                   cantidad[i]++; 
                }
                
            }
            System.out.println(cantidad[i]);  
        }
            

    }

}
