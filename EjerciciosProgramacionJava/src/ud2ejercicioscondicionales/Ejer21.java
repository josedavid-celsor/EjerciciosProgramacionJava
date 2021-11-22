package ud2ejercicioscondicionales;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * Escribe un programa que calcule el índice de masa corporal de un paciente. IMC =
peso (kg) / altura² (m). Luego, mostrará el diagnóstico según la siguiente tabla
 */
public class Ejer21 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double kg;
        System.out.println("Dime tu peso ");
        kg=lector.nextDouble();
        
        double m;
        System.out.println("Dime tu altura ");
        m= lector.nextDouble();
       
        double IMC = kg / Math.pow(m, 2);
        
        if (IMC < 16){
            System.out.println("Criterio de ingreso al hospital");
        }
        else if (IMC < 17){
            System.out.println("Infrapeso");
        }
        else if (IMC < 18){
            System.out.println("Bajo peso");
        }
        else if (IMC < 25){
            System.out.println("Peso normal (saludable)");
        }
        else if (IMC < 30){
            System.out.println("Sobrepeso (obesidad de grado I)");
        }
        else if (IMC < 35){
            System.out.println("Sobre peso cronico");
        }
        else if (IMC < 40){
            System.out.println("Obesidad premorbida");
        }
        else{
            System.out.println("Obesidad morbida");
        }
    }
}
