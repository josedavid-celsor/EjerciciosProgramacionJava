/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud6ejercicios.CasoPracticoEntregable;

import java.util.Scanner;

/**
 *
 * @author josed
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        TiendaOn TOPOPAN = new TiendaOn("TOPOPAN", "69960456", "Casa jose");
        TOPOPAN.añadirArticulo(0, "Camiseta Nike", 99.99, 1.21, 10);
        TOPOPAN.añadirArticulo(1, "Zapatillas Croko", 49.99, 1.21, 10);
        TOPOPAN.añadirArticulo(2, "Calcetines de Pokemon", 19.99, 1.16, 10);
        TOPOPAN.añadirArticulo(3, "Gorrito de maestro Pokemon", 999.99, 1.3, 10);
        TOPOPAN.añadirArticulo(4, "Gorrito huertano", 9.99, 1.11, 10);
        TOPOPAN.añadirArticulo(5, "Lentes facha", 4.99, 1.21, 10);
        TOPOPAN.añadirArticulo(6, "Camiseta Rosa", 499.99, 1.15, 10);
        TOPOPAN.añadirArticulo(7, "Camiseta Azul claro", 29.99, 1.15, 10);
        TOPOPAN.añadirArticulo(8, "Camiseta Rojo", 19.99, 1.15, 10);
        TOPOPAN.añadirArticulo(9, "Camiseta Verde menta", 29.99, 1.15, 10);
        int totalcom = 0;
        int opcion = 0;
        int cant, pos;
        int acabar = 1;
        String nc, tfl, direc;

        System.out.println("Bienvenido a nuestra tienda Online TOPOPAN todo mas barato que el pan ");
        System.out.println("Para poder entrar en la tienda tendras que darme tu nombre ");
        nc = in.nextLine();
        System.out.println("El teléfono");
        tfl = in.nextLine();
        System.out.println("Y por último tu dirección");
        direc = in.nextLine();

        Cliente n1 = new Cliente(nc, tfl, direc);

        //n1.imprimecli();
        //TOPOPAN.imprime();
        do {
            System.out.println("Dime una opcion de las siguientes!");
            System.out.println("El menu se consta de las siguientes opciones");
            System.out.println("1. Muestra los articulos de la tienda TOPOPAN");
            System.out.println("2. Muestra los datos y productos del cliente");
            System.out.println("3. Añade el producto a tu carrito");
            System.out.println("4. Elimina un producto de tu carrito");
            System.out.println("5. Calcula el precio total sin iva");
            System.out.println("6. Calculo del precio con iva");
            System.out.println("7. Comprar y pagar");
            System.out.println("8. Salir");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Aqui tienes nuestros articulos de alta calidad TOPOPAN");
                    TOPOPAN.imprime();
                    break;
                case 2:
                    n1.imprimecli();
                    n1.imprime();
                    break;
                case 3:
                    System.out.println("Dime la posicion del articulo que te haya llamado la atención para añadirla al carrito");
                    pos = in.nextInt();
                    if (pos < TOPOPAN.getArticulos().length) {
                        System.out.println("Y ahora dime la cantidad de ese objeto que deseas comprar");
                        cant = in.nextInt();
                        Articulo a = TOPOPAN.getArticulo(pos);
                        n1.añadirArticuloCarrito(a, cant); 
                        TOPOPAN.getArticulo(pos).setCuantos(TOPOPAN.getArticulo(pos).getCuantos() - cant);  
                    }
                    else{
                        System.err.println("No puedes agregar articulos que no existen");
                    }

                    break;
                case 4:
                    System.out.println("En esta opcion se eliminaran los articulos que eligas , dime su posicion");
                    pos = in.nextInt();
                    System.out.println("Dime la cantidad que deseas eliminar del objeto");
                    cant = in.nextInt();
                    n1.eliminarArticuloCarrito(pos, cant);

                    break;
                case 5:
                    System.out.println("Este es el precio total sin iva de los productos " + n1.CalculoCarro(n1));

                    break;
                case 6:

                    System.out.println("Este es el precio total con iva de los productos " + n1.CalculoCarroIva(n1));

                    break;
                case 7:

                    System.out.println("Han sido removidos de tu cuenta esta cantidad total " + n1.CalculoCarroIva(n1) + "€ , Muchas gracias por comprar en nuestra tienda TOPOPAN!");

                    acabar--;
                    break;
                case 8:
                    acabar--;
                    break;

            }
        } while (acabar != 0);
    }
}
