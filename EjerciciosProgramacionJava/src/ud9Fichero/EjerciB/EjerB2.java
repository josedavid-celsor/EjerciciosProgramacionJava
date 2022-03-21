package ud9Fichero.EjerciB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjerB2 {

    public static void main(String[] args) {

        String nombre, apellido, linea;
        int nota;

        try {
            File f = new File("Documentos/alumnos.txt");
            Scanner lector = new Scanner(f);

            int cont = 0, suma = 0;
            double media = 0;
            while (lector.hasNext()) {
                linea = lector.nextLine();

                String[] l = linea.split(" ");
                nombre = l[0];
                apellido = l[1];

                for (int i = 2; i < l.length; i++) {
                    nota = Integer.parseInt(l[i]);
                    suma += nota;
                    cont++;

                }
                media = suma / media;

                System.out.println(nombre + " " + apellido + "\tNota media:" + media);

            }

        } catch (FileNotFoundException e) {
            System.err.println("Error el fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
