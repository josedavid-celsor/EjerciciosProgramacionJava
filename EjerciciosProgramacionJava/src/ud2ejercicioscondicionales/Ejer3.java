
package ud2ejercicioscondicionales;
import java.util.Scanner;
/**
 *Escribe un programa que pida 2 números enteros y muestre el mayor.
 * 
 */
public class Ejer3 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    int a;
    int b;
        System.out.println("Escribe un número ");
         a= lector.nextInt();
        System.out.println("Escribe otro número ");
         b= lector.nextInt();
     if(a>b){
         System.out.println("El número mayor es "+ a);
     }
     else{
         System.out.println("El número mayor es "+ b);
     }
}
}