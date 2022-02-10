package ud6ejercicios.ExtraArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        ArrayList<Integer> lista_nums = new ArrayList();

        int not, apro = 0, sus = 0;
        double notmed = 0;
        boolean cero = false;
        boolean diez = false;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Dime una nota");
            not = teclado.nextInt();
            if (not >= 0 && not <= 10) {
                lista_nums.add(not);
                notmed += not;
                if (not >= 5) {
                    apro++;
                } else {
                    sus++;
                }
                if (not == 0) {
                    cero = true;
                }
                if (not == 10) {
                    diez = true;
                }
            }

        } while (not != -1);

        notmed /= lista_nums.size();
        System.out.println("Suspendidos:" + sus);
        System.out.println("Aprobados:" + apro);
        System.out.println("Hay ceros? " + cero);
        System.out.println("Hay diez?" + diez);
        System.out.println("Nota media:" + notmed);
    }
}
