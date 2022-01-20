package ud6ejercicios.ProgramaCuentaCorriente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        //crear array
        CuentaCorriente[] cuenta = new CuentaCorriente[5];
        
        //creando objetos dentro del array
        cuenta[0] = new CuentaCorriente(156415641, 100);
        cuenta[1] = new CuentaCorriente(541656156, 500);
        cuenta[2] = new CuentaCorriente(879851541, 300);
        cuenta[3] = new CuentaCorriente(931874254, 400);
        cuenta[4] = new CuentaCorriente(854841532, 900);

        int opcion;
        do {
            System.out.println("1. Ver cuentas \n" + "2. Ingresar \n"
                    + "3. Retirar \n" + "4. Transferencia \n" + "5. Salir");
            opcion = teclado.nextInt();
            
            //switch para mostrar el menu
            switch (opcion) {
                case 1:
                    for (int i = 0; i < cuenta.length; i++) {
                        System.out.println(cuenta[i]);
                    }
                    break;
                case 2:

                    System.out.println("Dime una cuenta ");
                    int c = teclado.nextInt();

                    System.out.println("Dime cantidad a ingresar");
                    double cantidad = teclado.nextDouble();

                    cuenta[c - 1].ingresar(cantidad);
                    break;
                case 3:
                    System.out.println("Dime una cuenta ");
                    c = teclado.nextInt();

                    System.out.println("Dime cantidad a retirar");
                    cantidad = teclado.nextDouble();

                    cuenta[c-1].retirar(cantidad);
                    
                    break;
                case 4: 
                    System.out.println("Dime una cuenta origen");
                    int cuenta_o = teclado.nextInt();
                    
                    System.out.println("Dime una cuenta destino");
                    int cuenta_d = teclado.nextInt();

                    System.out.println("Dime cantidad a retirar");
                    cantidad = teclado.nextDouble();
                    
                    cuenta[cuenta_o - 1].retirar(cantidad);
                    cuenta[cuenta_d - 1].ingresar(cantidad);
                    cuenta[cuenta_o - 1].imprime();
                    cuenta[cuenta_d - 1].imprime();
                    
                    break;
                    
                case 5: 
                    

            }
        } while (opcion != 5);

    }
}
