/*
 * Proyecto EjerciciosUnidad3 - Archivo Nivel3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud3starwars;

/**
 *
 * @author José David Rosales Rios <jdrrdaw@gmail.com>
 * @version 1.2
 * @date $[date] $[time]
 */
public class Nivel3 {

    static int Nivel3() {

        //crear variales 
        int N = (int) (50 + Math.random() * (100 - 50 + 1)),
                factorial = N/10,
                resultado = 0;

        //crear texto nivel 2
        System.out.println("=== Nivel 3 ===");
        System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de\n"
                + "la   muerte,   se   equipan   con   trajes   de   soldados   imperiales   que\n"
                + "encuentran en la nave para pasar desapercibidos y bajan. Ahora\n"
                + "deben averiguar en qué nivel de los" +  N + "existentes se encuentra el\n"
                + "reactor   principal.   Se   dirigen   al   primer   panel   computerizado   que\n"
                + "encuentran y la Princesa Leia intenta acceder a los  planos de  la\n"
                + "nave   pero   necesita   introducir   una   clave   de   acceso.   Entonces\n"
                + "recuerda   la   información   que   le   proporcionó   Lando   Calrissian   “La\n"
                + "clave   de   acceso   a   los   planos   de   la   nave   es   el   factorial   de   N/10\n"
                + "(redondeando N hacia abajo), donde N es el nº de niveles”.\n"
                + "¿Cual es el nivel correcto?");

        //crear bucle para la sumatoria
        for (int i = 1; i <=factorial; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
