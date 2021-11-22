package ud2ejercicioscondicionales;
import java.util.Scanner;
/**
 *Escribe un programa que pida 2 números enteros y muestre el mayor. Si son iguales,
deberá mostrar el mensaje “Son iguales”.
 * 
 */
public class Ejer6 {
    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Dime un número entero ");
          a = lector.nextInt();
        System.out.println("Dime otro número entero ");
          b = lector.nextInt();
        if (a > b) {
            System.out.println("El mayor es " + a);
        }
        else if (a == b) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("El mayor es " + b);
        }
    }
    
}
