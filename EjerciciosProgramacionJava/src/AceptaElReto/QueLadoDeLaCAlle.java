package AceptaElReto;

import java.util.Scanner;

public class QueLadoDeLaCAlle {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
     
        while( (a = teclado.nextInt())!=0  ){
            if(a % 2 == 0){
                System.out.println("DERECHA");
            } else{
                System.out.println("IZQUIERDA");
            }
        }
    }
}
