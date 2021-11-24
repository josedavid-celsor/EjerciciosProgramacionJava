package ud3ejercicios;
import java.util.Scanner;
/**
 * Crea un programa que pida una cadena de texto y luego la muestre tanto en
mayúsculas como en minúsculas
 *  
 */
public class Ejer1 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Dime un texto ");
        String s = texto.nextLine();
        System.out.println("Texto en mayuscula " + s.toUpperCase());
        System.out.println("Texto en minuscula " + s.toLowerCase());
    }
}
