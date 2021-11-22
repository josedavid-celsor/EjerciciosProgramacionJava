package ud2ejercicioscondicionales;
import java.util.Scanner;

/**
 *
 *Realiza un programa que pida un número entero entre uno y doce e imprima el
número de días que tiene el mes correspondiente.
 */
public class Ejer12 {
     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int mes;
        
        System.out.println("Escriba un número del 1 al 7, para saber el mes");  
        mes = lector.nextInt();
        
        String meses = "";
        
        switch(mes) {
            case 1:
                meses = "Enero";
                break;
            case 2:
                meses = "Febrero";
                break;
            case 3:
                meses = "Marzo";
                break;
            case 4:
                meses = "Abril";
                break;
            case 5:
                meses = "Mayo";
                break;
            case 6:
                meses = "Junio";
                break;
             case 7:
                meses = "Julio";
                break;
             case 8:
                meses = "Agosto";
                break;  
             case 9:
                meses = "Septiembre";
                break;    
            case 10:
                meses = "Octubre";
                break;
            case 11:
                meses = "Noviembre";
                break;
             case 12:
                meses = "Diciembre";
                break;    
        }
        
        System.out.println("El mes correspondiente es " + meses);
        
    }
}
