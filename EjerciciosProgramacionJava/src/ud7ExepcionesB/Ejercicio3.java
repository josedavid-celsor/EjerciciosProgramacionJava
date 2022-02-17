/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejercicio3.java - Compañia DAW
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
public class Ejercicio3 {

    public static void main(String[] args) {
        double[] v = new double[15];
        acceso(v, 16);
    }

    public static double acceso(double[] v, int j) throws Exception {
        try {
            if ((0 <= j) && (j <= v.length)) {
                return v[j];
            } else {
                throw new Exception("El indice " + j
                        + " no existe en el vector");
            }
        } catch (Exception exc) {
            throw exc;
        }
    }
}
