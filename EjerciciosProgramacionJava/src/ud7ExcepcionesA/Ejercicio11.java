package ud7ExcepcionesA;

import java.util.*;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = (int) (Math.random() * (100 - 1) + 1);
        int res = 0;
        int[] vector = new int[tamaño];

        for (int i = 0; i < vector.length; i++) {
            int relleno = (int) (Math.random() * (10 - 1) + 1);
            vector[i] = relleno;

        }
        do {
            try{
                 System.out.println("Dime una posición del vector");
                 res = teclado.nextInt();
                 System.out.println(vector[res]);
            }catch (InputMismatchException e) {
                System.out.println("Valor incorrecto");
                teclado.nextLine();
            }catch(IndexOutOfBoundsException e){
                System.out.println("Valor fuera de rango");
                teclado.nextLine();
            }
           
            
        }while(res < 0);
        
    
    }
}
