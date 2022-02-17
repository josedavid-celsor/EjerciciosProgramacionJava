/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejer7.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud7ExepcionesB;

/**
 *
 * @author José David Rosales Rios <jdrrdaw@gmail.com>
 * @version 1.2
 * @date $[date] $[time]
 */
public class Ejer7 {

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Excepcion en metodo ( ) ");
            e.printStackTrace();
        }
    }

    private static int metodo()  {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor al final del try : " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch :" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final de finally :" + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return : " + valor);
        return valor;
    }
}
