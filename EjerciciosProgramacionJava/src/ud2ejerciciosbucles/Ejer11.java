package ud2ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * Escribe un programa que dada una cantidad de euros que el usuario introduce
 * por teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán
 * necesarios para alcanzar dicha cantidad (utilizando billetes de 500, 200,
 * 100, 50, 20, 10 y 5). Hay que indicar el mínimo de billetes posible. Por
 * ejemplo, si el usuario introduce 145 el programa indicará que será necesario
 * 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por
 * ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo número de
 * billetes posible).
 */
public class Ejer11 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime una cantidad de euros ");
        int a = lector.nextInt();
        //int b5 = 0, b10 = 0, b20 = 0, b50 = 0, b100 = 0, b200 = 0, b500 = 0;
        int b[] = {0,0,0,0,0,0,0};
        
        while (a > 0){
            if (a >= 500){
                b[0] += 1;
                a -= 500;
            }
            else if (a >= 200) {
                b[1]+= 1;
                a -= 200;
            }
            else if (a >= 100){
               b[2] += 1;
                a -= 100;
            }
            else if (a >= 50){
               b[3] += 1;
                a -= 100;
            }
            else if (a >= 20){
               b[4] += 1;
                a -= 20;
            }
            else if (a >= 10) {
                b[5] +=1;
                a -= 10;
            }
            else {
                b[6] += 1;
                a -= 5;
            }
        }
        System.out.println("Billetes necesarios: \n Billetes de 500 " + b[0]+
        " \nBilletes de 200 " + b[1] +" Billetes de 100 " + b[2] +" \nBilletes de 50 " + b[3] +
        " \nBilletes de 20 " +b[4] +" \nBilletes de 10 " + b[5] +" \nBilletes de 5 " + b[6]);
    
    }
}
