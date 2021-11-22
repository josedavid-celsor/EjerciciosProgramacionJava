package ud2ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Escribe un programa donde el usuario "piensa" un número del 1 al 100 y el
 * ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
 * una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si
 * es mayor, menor o igual al número que ha pensado).
 */
public class Ejer12 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Piensa en un número");
        int num= 50, max = 100, min = 1;
        String resp;
        
        do {
            System.out.println(num + " Tu número es menor, igual o mayor?");
            resp = lector.next();
            if (resp.equals("mayor")) {
                min = num;
                num = (min + max) / 2;
            } else {
                max = num;
                num = (max + min) / 2;
            }
        } while (!resp.equals("igual"));
        
        System.out.println("He acertado tu número es " + num);
        
        

    }
}
