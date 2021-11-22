
package ud2entregables;
/**
 *Escribe   un   programa   que   defina   un   enumerado  para   los   niveles   de
batería   de  un   teléfono   móvil  (vacía,   baja,   media,   alta  y  completa)   y
muestre por pantalla, utilizando dicho enumerado, que la batería del móvil
está completa.
 * @author a027356383e
 */
public class Ejercicio2 {
     public enum BateriaCelular{VACÍA, BAJA, MEDIA, ALTA, COMPLETA}
    public static void main(String[] args) {
         BateriaCelular hoy = BateriaCelular.COMPLETA;
         BateriaCelular d = BateriaCelular.COMPLETA;
        System.out.println("La bateria del movil está " + hoy);
        System.out.println( d.ordinal());
    }
}
