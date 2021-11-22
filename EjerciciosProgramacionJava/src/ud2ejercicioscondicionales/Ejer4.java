package ud2ejercicioscondicionales;
import java.util.Scanner;
/**
 *Escribe un programa que pida un número y me dice si es positivo o negativo.
Consideraremos el cero como positivo
 * 
 */
public class Ejer4 {
    public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);
    int a;
        System.out.print("Dime un número");
        a = lector.nextInt();
         if (a>=0) {
             System.out.println("Tu número es positivo");
         }
         else {
             System.out.println("Tu número es negativo");
         }
    }
}
