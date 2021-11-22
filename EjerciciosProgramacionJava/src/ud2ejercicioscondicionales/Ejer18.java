package ud2ejercicioscondicionales;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * Escribe un programa que pida al usuario introducir una letra y luego muestre un
mensaje indicando si es mayúscula o minúscula.
 */
public class Ejer18 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);    
        char charact;
        System.out.println("Escriba una letra ");  
        charact = lector.next().charAt(0);
        if (Character.isUpperCase(charact)){
            System.out.println("Es mayuscula ");    
        }
        else  {
            System.out.println("Es miniscula ");
        }
    }    
}
