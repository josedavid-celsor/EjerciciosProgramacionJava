package ud3ejercicios;
import java.util.Scanner;
/**
 * 
 * Crea un programa que pida dos cadenas de texto y luego las muestre en orden
alfabético (sin diferenciar entre mayúsculas y minúsculas).  
 */
public class Ejer3 {
    public static void main(String[] args) {
             
        Scanner texto = new Scanner(System.in);
        System.out.println("Dime un texto ");
        String s = texto.nextLine();
        
        System.out.println("Dime otro texto ");
        String s1 = texto.nextLine();
        
        if (s.compareToIgnoreCase(s1) < 0) {
            System.out.println(s);
            System.out.println(s1);
        } else if (s.compareToIgnoreCase(s1) > 0) {
            System.out.println(s1);
            System.out.println(s);
        }else {
            System.out.println("Son iguales");
        }
    }
}
