package ud3ejercicios;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida dos cadenas de texto por teclado y luego indique si
 * son iguales o no, además de si son iguales sin diferenciar entre mayúsculas y
 * minúsculas.
 */
public class Ejer2 {

    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);
        System.out.println("Dime un texto ");
        String s = texto.nextLine();
        
        System.out.println("Dime otro texto ");
        String s1 = texto.nextLine();
        
        if (s.equals(s1)){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }
        if (s.equalsIgnoreCase(s1)){
            System.out.println("Son iguales tanto en mayuscula como en minuscula");
        }
        else {
            System.out.println("No son iguales");
        }
    }
}
