package ud2ejercicioscondicionales;
import java.util.Scanner;
/**
 *Escribe un programa que pida cuantas mujeres y hombres hay en un aula y muestre
el  porcentaje   de   mujeres   y   hombres   que   hay.   También   mostrará   un   mensaje
indicando si hay más mujeres, o más hombres o si hay los mismos.
 * 
 */
public class Ejer14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);    
        int mujeres;
        int hombres;
        
        System.out.println("Escriba la cantidad de mujeres ");  
        mujeres = lector.nextInt();
        System.out.println("Escriba la cantidad de hombres ");
        hombres = lector.nextInt();
        
        int suma = mujeres + hombres;
        double porcentH = (double) hombres / suma * 100;
        double porcentM = (double) mujeres / suma * 100;
        
        if (hombres > mujeres){
            System.out.println("Hay más hombres que mujeres y el porcentaje de "
                    + "hombres es igual a " + porcentH + "%");
        }
        else if (mujeres > hombres){
            System.out.println("Hay más mujeres que hombres y el porcentaje de "
                    + "hombres es igual a " + porcentH + "%");
        }
        else {
            System.out.println("Hay la misma cantidad de hombres que mujeres y el porcentaje de ");
        }
    }
}
