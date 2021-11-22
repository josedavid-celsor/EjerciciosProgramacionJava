package ud2ejercicioscondicionales;
import java.util.Scanner;
import java.lang.Math;
/**
 *Escribe programa  que pida  las 3 notas (números enteros) de un alumno y luego
muestre su  nota final, calculada como la nota media expresada como un entero y
redondeada al valor entero más próximo. Téngase en cuenta también que si alguna
de las 3 notas es inferior a 5 la nota final debe ser como máximo un 4.
 * 
 */
public class Ejer15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);    
        int a;
        int b;
        int c;
            System.out.println("Escriba la nota de su primer examen ");  
        a = lector.nextInt();
            System.out.println("Escriba la nota de su segundo examen ");  
        b = lector.nextInt();
            System.out.println("Escriba la nota de su tercer examen ");  
        c = lector.nextInt();
        double sum = (a + b + c) / 3.0;
        double red = Math.round(sum);
        if ((a < 5 || b < 5 || c < 5) && sum > 4){
             red =4;
        }
           System.out.println("Su nota final es "+ red);
    }
}
