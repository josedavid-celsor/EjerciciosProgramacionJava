package ud2ejercicioscondicionales;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * Escribe un programa en el que el usuario intenta adivinar el valor que saldrá al “tirar”
un dado de 6 caras. Se le pedirá el valor al usuario, y luego se mostrará un número
aleatorio entre 1 y 6. Por ultimo, se mostrará un mensaje indicando si el usuario
acertó o no.
 */
public class Ejer16 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);    
        int a;
        System.out.println("Escriba un número del 1 al 6 para intentar adivinar el número del dado ");  
        a = lector.nextInt();
        
       double dado = (int)(Math.random() * 6 + 1);
        
        if (a == dado) {
            System.out.println("Correcto ha acertado el número");
        }
        else {
            System.out.println("No ha acertado el número");
        }
        
        
        
    }
}
