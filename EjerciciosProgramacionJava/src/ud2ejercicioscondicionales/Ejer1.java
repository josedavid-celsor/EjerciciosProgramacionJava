
package ud2ejercicioscondicionales;
import java.util.Scanner;
/**
 *
 * Escribe un programa que pide la edad por teclado y muestre el mensaje de “Eres
mayor de edad” si lo somos.
 */
public class Ejer1 {
   public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    int edad;
       System.out.println("Escriba su edad ");  
       edad = lector.nextInt();
    if (edad > 18) {
        System.out.println("Eres mayor de edad");
    }
    else {
        System.out.println("Eres menor de edad");
    }
        
          
   }
     
       
    
    
    
}
