package ud2ejercicioscondicionales;
import java.util.Scanner;
/**
 *
 * Escribe un programa que lea la temperatura en centígrados (entero) del día e imprima
el tipo de clima de acuerdo a la siguiente lista:
◦Temperatura menor que 10 => Frío
◦Temperatura entre 10 y 19 => Templado
◦Temperatura entre 20 y 29 => Caluroso
◦Temperatura mayor que 29 => Tropical
 */
public class Ejer13 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);    
    int tem;
    System.out.println("Escriba la temperatura ");  
       tem = lector.nextInt();
    if (tem < 10) {
        System.out.println("Frio");
    }
    else if (tem <= 19){
        System.out.println("Templado");
    }
    else if (tem <= 29){
         System.out.println("Caluroso");
    }
    else if (tem > 29){
        System.out.println("Tropical");
    }
    }
}
