package ud9Fichero.EjerciB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjerB1 {

    public static void main(String[] args) {

        int numero, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        try {
            File f = new File("Documentos/numeros.txt");
            Scanner lector = new Scanner(f);

            while (lector.hasNext()) {
                numero = lector.nextInt();
                if (numero > max) {
                    max = numero;
                }
                if (numero < min) {
                    min = numero;
                }
            }

            lector.close();

            System.out.println("El valor mayor es: " + max);
            System.out.println("El valor minumo es: " + min);

        } catch (FileNotFoundException e) {
            System.err.println("Error el fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
