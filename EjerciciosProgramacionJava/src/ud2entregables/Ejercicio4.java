
package ud2entregables;
import java.util.Scanner;
import java.lang.Math;
/**
 *Utilizando la clase Math, escribe un programa que pida al usuario dos
números decimales (A y B) y muestre:
1. A redondeado al entero más próximo.
2. B redondeado al entero más próximo.
3. El mayor de ambos (s@author a027356383eu valor).
4. El menor de ambos (su valor).
 * @author a027356383e
 */
public class Ejercicio4 {
    public static void main(String[] args) {
       double a;
       double b;
       Scanner lector = new Scanner(System.in);
             System.out.print("Escriba un número decimal A ");
         a= lector.nextDouble();
        
             System.out.print("Escriba otro número decimal B ");
          b= lector.nextDouble();
                double redo = Math.round(a);
                double redonde = Math.round(b);
                double mayor = Math.max(a, b);
                double menor = Math.min(a,b);
      System.out.println("El número A redondeado al entero más proximo es igual a " + redo);
      System.out.println("El número B redondeado al entero más proximo es igual a " + redonde);
      System.out.println("El mayor entre A y B es " + mayor);
      System.out.println("El menor entre A y B es " + menor);
    }
  
  
    
}
