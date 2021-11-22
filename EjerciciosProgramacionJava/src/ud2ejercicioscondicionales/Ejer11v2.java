package ud2ejercicioscondicionales;
import java.util.Scanner;
/**
 *.Realiza un programa que pida el día de la semana (del 1 al 7) y muestre por pantalla
el día correspondiente (Lunes, martes...). Si introducimos otro número mostrará un
mensaje de error.
 * 
 */
public class Ejer11v2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dias;
        
        System.out.println("Escriba un número del 1 al 7, para saber el día de la semana ");  
        dias = lector.nextInt();
        
        String dia = "";
        
        switch(dias) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "error";
                break;
        }
        
        System.out.println("El día correspondiente es " + dia);
        
    }
}
