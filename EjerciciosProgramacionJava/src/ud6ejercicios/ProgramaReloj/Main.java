package ud6ejercicios.ProgramaReloj;

public class Main {

    public static void main(String[] args) {

        //crear array
        Reloj[] reloj = new Reloj[5];

        //crear objetos dentro del array
        reloj[0] = new Reloj(15, 58, 59);
        reloj[1] = new Reloj(16, 10, 20);
        reloj[2] = new Reloj(5, 58, 59);
        reloj[3] = new Reloj(20, 48, 00);
        reloj[4] = new Reloj(22, 58, 59);

        //sumando un segundo en todos los relojes
        for (int i = 0; i < reloj.length; i++) {
            reloj[i].imprime_hora();
            reloj[i].tick();
            reloj[i].imprime_hora();
            System.out.println("*************");

        }

        for (int i = 0; i < reloj.length; i++) {

            System.out.println("Sumando 60 ticks");
            for (int j = 0; j <= 60; j++) {
                reloj[i].tick();

            }
            reloj[i].imprime_hora();
            System.out.println("***************");
        }
        
        System.out.println("Pasada una hora");
        for (int i = 0; i < reloj.length; i++) {
            for (int j = reloj[i].getMinutos(); j < 3600; j++) {
                reloj[i].tick();

            }

        }

        for (int i = 0; i < reloj.length; i++) {
            for (int j = reloj[i].getMinutos(); j < 3600; j++) {
                reloj[i].tick();

            }

        }
    }
}
