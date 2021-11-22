/*
 * Proyecto Programaci_n - Archivo EjerPractico.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author José David Rosales Rios <jdrrdaw@gmail.com>
 * @version 1.2
 * @date $[date] $[time]
 */
public class EjerPractico {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        int[] numero = new int[100];
        String[] nombre = new String[100];
        String[] mail = new String[100];
        int cuantos = 0, opcion, contador = 1;
        boolean salir = false;

        do {
            System.out.println("1.Ver contacto");
            System.out.println("2.Agregar contacto");
            System.out.println("3.Eliminar Contacto");
            System.out.println("4.Buscar Contacto");
            System.out.println("5.Salir");

            System.out.println("Elige una opción");
            opcion = texto.nextInt();

            switch (opcion) {
                //ver contactos
                case 1:
                    System.out.println("Contactos");
                    for (int i = 0; i < cuantos; i++) {
                        System.out.println("Contacto: " + contador + nombre[i] + " Tel " + numero[i] + " Mail " + mail[i]);
                        contador ++;
                    }
                    break;
                //agregar contacto
                case 2:

                    texto.nextLine();

                    System.out.print("Nombre del Contacto ");
                    nombre[cuantos] = texto.nextLine();

                    System.out.print("Numero del Contacto ");
                    numero[cuantos] = texto.nextInt();
                    texto.nextLine();

                    System.out.println("Correo del Contacto");
                    mail[cuantos] = texto.nextLine();

                    cuantos++;
                    break;
                //eliminar contacto
                case 3:
                    System.out.println("Dime el contacto que quieres eliminar ");
                    int borrar = texto.nextInt();
                    for (int i = borrar; i < cuantos ; i++) {
                        nombre[i - 1] = nombre[i]; 
                        numero [i - 1] = numero[i]; 
                        mail[i - 1] = mail[i];
                        
                    }
                    cuantos --;
                    break;
                case 4:
                    texto.nextLine();
                    System.out.println("Dime el contacto que quieres buscar ");
                    String mostrar = texto.nextLine();
                    
                    for (int i = 0; i < cuantos; i++) {
                        
 
                        if (nombre[i].indexOf(mostrar) >= 0) {
                            System.out.println("Contacto " + nombre[i] + "" + numero[i] + "" + mail[i]);
                            
                        }
                        else {
                            System.out.println("No se han encontrado contactos");
                        }
                    }
                    
                    break;
                    
                case 5:
                    salir = true;
                    break;

            }
        } while (!salir);

    }

}
