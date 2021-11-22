
package ud2entregables;

import java.lang.Math;
/**
 *Escribe   un   programa   que   muestre   por   pantalla   un   número   entero
aleatorio entre 1 y 10.
 * @author a027356383e
 */
public class Ejercicio5 {
     public static void main(String[] args) {
         int ale= (int)(1 + Math.random() * 10);
         System.out.println("Su número aleatorio entre 1 y 10 será " + ale);
     }
}
