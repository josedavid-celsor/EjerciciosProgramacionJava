package ud2ejercicioscondicionales;
import java.util.Scanner;
/**
 * Escribe un programa que lee dos números y los visualiza en orden ascendente.
 * 
 */
public class Ejer5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
    int a;
    int b;
      System.out.print("Dime un número");
        a = lector.nextInt();
      System.out.print("Dime otro número");
        b = lector.nextInt();
          if (a>b) {
              System.out.print("Orden ascendente " + a + "  " + b);
          }
          else {
              System.out.print("Orden ascendente " + b + "  " + a);
          }
    }
}
