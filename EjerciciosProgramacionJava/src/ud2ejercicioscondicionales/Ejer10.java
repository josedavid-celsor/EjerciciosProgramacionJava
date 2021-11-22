
package ud2ejercicioscondicionales;
import java.util.Scanner;

/**
 *Escribe un programa que pida introducir dos números decimales y luego muestre el
valor de su suma, resta, producto y división. Se deberá evitar dividir por cero.
 *
 */
public class Ejer10 {
     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Dime un número que será A");
        a = lector.nextDouble();
        System.out.println("Dime otro número que será B ");
        b = lector.nextDouble();
         double sum = a + b;
         double res = a - b;
         double pro = a * b;
        if (a == 0 || b == 0) {
            System.out.println("El resultado de la suma es igual a " + sum + 
            " La resta es igual igual a " + res + " La multiplicación es igual a " + pro +
            "No se puede dividir entre 0");        
        }
        else {
            double div = a / b;
            System.out.println("El resultado de la suma es igual a " + sum + 
            " La resta es igual igual a " + res + " La multiplicación es igual a " + pro +
            " La división es igual a " + div);
        }
     }
}

