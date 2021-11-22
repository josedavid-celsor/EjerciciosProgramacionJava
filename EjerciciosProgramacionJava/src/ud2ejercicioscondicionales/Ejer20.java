package ud2ejercicioscondicionales;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * .Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
calificación alfabética, escribiendo el resultado.
◦de 0 a < 3 Muy Deficiente.
◦de 3 a < 5 Insuficiente.
◦de 5 a < 6 Bien.
◦de 6 a < 9 Notable
◦de 9 a 10 Sobresaliente
 */
public class Ejer20 {
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);    
    int cal;
    System.out.println("Escriba su nota ");  
       cal = lector.nextInt();
    if (cal < 3) {
        System.out.println("Muy deficiente");
    }
    else if (cal <= 5){
        System.out.println("Insuficiente");
    }
    else if (cal <= 6){
         System.out.println("Bien");
    }
    else if (cal <= 9){
        System.out.println("Notable");
    }
    else {
        System.out.println("Sobresaliente");
    }
    }
}
