package ud2ejercicioscondicionales;
import java.util.Scanner;
/**
 *.Realiza un programa que pida el día de la semana (del 1 al 7) y muestre por pantalla
el día correspondiente (Lunes, martes...). Si introducimos otro número mostrará un
mensaje de error.
 * 
 */
public class Ejer11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dias;
        System.out.println("Escriba un número del 1 al 7, para saber el día de la semana ");  
        dias = lector.nextInt();
        switch(dias) {
            case 1:
                System.out.println("El día correspondiente es Lunes");
                break;
            case 2:
                System.out.println("El día correspondiente es Martes");
                break;
            case 3:
                System.out.println("El día correspondiente es Miercoles");
                break;
            case 4:
                System.out.println("El día correspondiente es Jueves");
                break;
            case 5:
                System.out.println("El día correspondiente es Viernes");
                break;
            case 6:
                System.out.println("El día correspondiente es Sabado");
                break;
             case 7:
                System.out.println("El día correspondiente es Domingo");
                break;
        }
        
            
        
    }
}
