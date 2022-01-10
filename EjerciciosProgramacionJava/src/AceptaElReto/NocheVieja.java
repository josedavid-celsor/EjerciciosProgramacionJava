package AceptaElReto;

import java.util.Scanner;

public class NocheVieja {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String a = teclado.nextLine();

        String[] tiempo = a.split(":");
        String hora = tiempo[0];
        String minutos = tiempo[1];

        int min = Integer.parseInt(minutos);
        int horas = Integer.parseInt(hora);

        

        while (horas != 0 || min != 0) {
            int x = 0, z = 0;
            if (horas < 23) {
                x = (24 - horas) * 60;
            } else if (horas == 23 && min == 0) {
                x = (24 - horas) * 60;
            }
            if (min != 0) {
                z = 60 - min;
            }
            int res = x + z;
            System.out.println(res);
            a = teclado.nextLine();

            tiempo = a.split(":");
            hora = tiempo[0];
            minutos = tiempo[1];

            min = Integer.parseInt(minutos);
            horas = Integer.parseInt(hora);
        }
    }
}
