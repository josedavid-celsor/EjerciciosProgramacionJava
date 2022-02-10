package ud6ejercicios.ExtraArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Precios {

    public static void main(String[] args) {

        ArrayList<Double> almacen_precios = new ArrayList();

        Scanner teclado = new Scanner(System.in);
        double precio = 0;

        do {
            System.out.println("Dime el precio");
            if (precio >= 0) {
                precio = teclado.nextInt();
                almacen_precios.add(precio);
            }

        } while (precio >= 0);

        System.out.println(almacen_precios);

        ArrayList<Double> barato = new ArrayList();
        ArrayList<Double> caros = new ArrayList();

        for (int i = 0; i < almacen_precios.size(); i++) {
            if (almacen_precios.get(i) < 100) {
                barato.add(almacen_precios.get(i));

            } else {
                caros.add(almacen_precios.get(i));

            }
        }
        almacen_precios.clear();
        System.out.println("Productos" + almacen_precios
                + "\nProductos caros " + caros
                + "\nProductos Baratos " + barato);

    }
}
