package ud2ejercicioscondicionales;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * Escribe un programa que pida un número entero x y un carácter c. Según el carácter
introducido se mostrará por pantalla:
◦Si c es ‘s’ => Sin(x)
◦Si c es ‘c’ => Cos(x)
◦Si c es ‘t’ => Tan(x)
◦En cualquier otro caso => “Error: carácter instroducido incorrecto”.
 */
public class Ejer19 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);    
        char charact;
       
        System.out.println("Escriba una letra ");  
        charact = lector.next().charAt(0);
        
        int a;
        System.out.println("Escriba un número ");  
        a = lector.nextInt();
        if (charact == 's'){
            double sen = Math.sin(a); 
            System.out.println("El seno del número previamente escrito es igual a " + sen);
        }
        else if (charact == 'c') {
            double cos = Math.cos(a);
            System.out.println("El coseno del número previamente escrito es igual a " + cos);
        }
        else {
            double tang = Math.tan(a);
            System.out.println("La tangente del número previamente escrito es igual a " + tang);
        }
    }    
}
