package ud9Fichero.EjerciB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejerb3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Nombre del archivo a leer: ");
            String archivo = in.nextLine();
            File origen = new File("Documentos/" + archivo);

            System.out.println("Nombre del archivo a escribir: ");
            String archivo1 = in.nextLine();

            File destino = new File("Documentos/" + archivo1);

            if (!origen.exists()) {
                throw new FileNotFoundException();
            }

            Scanner reader = new Scanner(origen);
            FileWriter writer = new FileWriter(destino);

            ArrayList<String> nomPersonas = new ArrayList();
            while (reader.hasNext()) {
                nomPersonas.add(reader.nextLine());
            }

           
            Collections.sort(nomPersonas);

            
            for (String nom : nomPersonas) {
                writer.write(nom + "\n");
            }

            
            reader.close();
            writer.close();

            System.out.println("El fichero " + destino.getName() + " ha sido creado correctamente");

        } catch (FileNotFoundException e) {
            System.err.println("Error el fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

}
