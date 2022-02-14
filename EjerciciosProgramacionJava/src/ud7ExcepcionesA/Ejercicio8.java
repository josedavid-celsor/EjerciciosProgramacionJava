package ud7ExcepcionesA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = 0;
        boolean correcto = false;
        do {
            try {
                System.out.println("Dime un valor entero A");
                valor = teclado.nextInt();
                correcto = true;
            } catch(InputMismatchException e){
                System.out.println("Valor introducido incorrecto");
                teclado.nextLine();
            }
        } while(!correcto);
        System.out.println("Valor introducido: " + valor );
                
                
    
    }

}
