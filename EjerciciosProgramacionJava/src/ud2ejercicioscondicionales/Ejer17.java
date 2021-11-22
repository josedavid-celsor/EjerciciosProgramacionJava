package ud2ejercicioscondicionales;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * Escribe un programa que pida un precio sin IVA y el % de IVA a aplicar. Luego
mostrará el precio con IVA. Si alguno de los valores introducidos es cero o negativo
avisará al usuario mediante un mensaje de erro
 */
public class Ejer17 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);    
        int a;
        System.out.println("Escriba el precio sin IVA ");  
        a = lector.nextInt();
            
        int b;
        System.out.println("Escriba el IVA a aplicar ");  
        b = lector.nextInt();
        
   
        if (b <= 0 || a <= 0) {
            System.out.println("Error");
        }
        else {
            double pre = a + (b / 100.0) * a;
            System.out.println("El precio es " + pre);
        }
          
    }
}
