package ud6ejercicios.ProgramaCoche;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //crear contadores
        int cont_pintura = 0;
        int cont_fabri = 0;
        int cont_terceros = 0;
        int cont_riesgos = 0;
        
        //crear array
        Coche[] coche = new Coche[3];
        Scanner teclado = new Scanner(System.in);
        
        //bucle para crear el objeto que ira dentro del array
        for (int i = 0; i < coche.length; i++) {
            System.out.println("Modelo: ");
            String modelo = teclado.nextLine();

            System.out.println("Color: ");
            String color = teclado.nextLine();

            System.out.println("Tiene pintura metalizada? ");
            boolean pintura = teclado.nextBoolean();

            teclado.nextLine();
            System.out.println("Matrícula: ");
            String matricula = teclado.nextLine();

            System.out.println("Año de Fabricación: ");
            int fabricacion = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Tipo de coche: ");
            String tipo = teclado.nextLine();
            Coche.tipoCoche t = Coche.tipoCoche.valueOf(tipo.toUpperCase());

            System.out.println("Modalidad de seguro: ");
            String modalidad = teclado.nextLine();
            Coche.modalidadSeguro m = Coche.modalidadSeguro.valueOf(modalidad.toUpperCase());

            if (pintura == true) {
                cont_pintura++;
            }

            if (fabricacion < 2000) {
                cont_fabri++;
            }

            if (modalidad.equals("TERCEROS")) {
                cont_terceros++;
            } else {
                cont_riesgos++;
            }

            coche[i] = new Coche(modelo, color, pintura, matricula, fabricacion, t, m);
            coche[i].imprime();

        }
        System.out.println("Hay " + cont_pintura + " con pintura metalizada");
        System.out.println("Hay " + cont_fabri + " fabricados antes del 2000");
        System.out.println("Hay " + cont_riesgos + " con seguro a riesgos");
        System.out.println("Hay " + cont_terceros + " con seguro a terceros");

        /* Coche a = new Coche("Mercedes", "Verde", true, TipoCoche.DEPORTIVO, 1998, Seguro.TERCEROS, "A4587VD");
        Coche b = new Coche("Ferrari", "Rojo", false, TipoCoche.DEPORTIVO, 1988, Seguro.TODO_RIESGO, "A9687VD");
        Coche c = new Coche("Mini", "Gris", true, TipoCoche.MINI, 1998, Seguro.TERCEROS, "A2567VD");*/
    }
}
