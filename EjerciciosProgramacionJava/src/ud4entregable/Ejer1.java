/*
 * Proyecto Programaci_n - Archivo Ejer1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud4entregable;

import java.util.Scanner;

/**
 *
 * @author José David Rosales Rios <jdrrdaw@gmail.com>
 * @version 1.2
 * @date $[date] $[time]
 */
public class Ejer1 {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        double[] saldo = new double[100];
        String[] nombre = new String[100];
        double dinero;
        int cuantos = 0, opcion;
        boolean salir = false;

        do {
            System.out.println("1.Ver cuentas.");
            System.out.println("2.Ingresar dinero.");
            System.out.println("3.Retirar dinero.");
            System.out.println("4.Agregar cuenta.");
            System.out.println("5.Eliminar cuenta.");
            System.out.println("6.Buscar cuenta.");
            System.out.println("7.Mostrar morosos.");
            System.out.println("8.Salir");

            System.out.println("Elige una opción");
            opcion = texto.nextInt();

            switch (opcion) {
                //ver contactos
                case 1:
                    if (cuantos > 0) {
                        System.out.println("Cuentass");
                        for (int i = 0; i < cuantos; i++) {
                            System.out.println("Cuenta: " + i + nombre[i] + " Saldo " + saldo[i] + "€");

                        }
                    } else {
                        System.out.println("No hay cuentas");
                    }
                    break;
                //agregar contacto
                case 2:

                    System.out.println("¿En que cuenta desea ingresar el dinero?");
                    opcion = texto.nextInt();

                    System.out.println("Dime la cantidad de dinero que deseas ingresar ");
                    dinero = texto.nextDouble();

                    for (int i = 0; i < cuantos; i++) {
                        if (i == opcion) {
                            saldo[i] += dinero;
                        }

                    }
                    break;

                //eliminar contacto
                case 3:

                    System.out.println("¿De que cuenta desea retorar el dinero?");
                    opcion = texto.nextInt();

                    System.out.println("Dime la cantidad de dinero que deseas ingresar ");
                    dinero = texto.nextDouble();

                    for (int i = 0; i < cuantos; i++) {
                        if (i == opcion) {
                            saldo[i] -= dinero;
                        }

                    }
                    break;

                case 4:
                    if (cuantos < 100) {
                        texto.nextLine();

                        System.out.print("Cuenta ");
                        nombre[cuantos] = texto.nextLine();

                        System.out.print("Saldo ");
                        saldo[cuantos] = texto.nextDouble();
                        texto.nextLine();

                        cuantos++;

                    }
                    else {
                        System.out.println("Espacio lleno");
                    }

                    break;

                case 5:

                    int borrar = texto.nextInt();
                    for (int i = borrar + 1; i < cuantos; i++) {
                        nombre[i - 1] = nombre[i];
                        saldo[i - 1] = saldo[i];

                    }
                    cuantos--;

                case 6:

                    boolean buscar = false;
                    texto.nextLine();
                    System.out.println("Dime la cuenta que quieres buscar ");
                    String mostrar = texto.nextLine();

                    for (int i = 0; i < cuantos; i++) {

                        if (nombre[i].indexOf(mostrar) >= 0) {
                            System.out.println("Contacto " + nombre[i] + "" + saldo[i] + "€");
                            buscar = true;
                        }

                    }
                    if (buscar == false) {
                        System.out.println("No se han encontrado contactos");
                    }

                case 7:
                    for (int i = 0; i < cuantos; i++) {
                        if (saldo[i] < 0) {
                            System.out.println("Nombre " + nombre[i] + "Saldo" + saldo[i]);
                            System.out.println("");
                        }
                    }
                case 8:
                    salir = true;
                    break;

            }

        } while (!salir);

    }

}
