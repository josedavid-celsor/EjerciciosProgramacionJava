package ud2ejercicioscondicionales;
import java.util.Scanner;
/**
 *
 * Escribe un programa que pida dos números (A y B) y muestre un mensaje por
pantalla indicando si alguno de ellos es múltiplo del otro.
 */
public class Ejer9 {
       public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Dime un número que será A");
        a = lector.nextInt();
        System.out.println("Dime otro número que será B ");
        b = lector.nextInt();
        if (a % b == 0) {
            System.out.println("A es multiplo de B");
        }
        else if (b % a == 0){
            System.out.println("B es multiplo de A");
        }
        else {
            System.out.println("No son multiplos");
        }
     }
}
