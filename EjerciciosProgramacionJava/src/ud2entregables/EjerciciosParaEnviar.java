
package ud2entregables;
import java.util.Scanner;
import java.lang.Math;
/**
 *Escribe un programa que pida al usuario la nota final de 3 evaluaciones
(números enteros) y muestre por pantalla la nota media (con decimales).
 * @author a027356383e
 */
public class EjerciciosParaEnviar {

   
  
    public static void main(String[] args) {
       
        int eva1;
        int ev2;
        int ev3;
        Scanner lector = new Scanner(System.in);
             System.out.print("Escriba la  nota final de su primer examen ");
          eva1= lector.nextInt();
             System.out.print("Escriba la nota final de su segundo examen ");
          ev2= lector.nextInt();
             System.out.print("Escriba la nota final de su tercer examen ");
          ev3= lector.nextInt();
        double media= (double)eva1 +(double) ev2 + (double)ev3 / 3;
             System.out.println("Su nota media es de "+ media);
    }
    
}
