/*
 * Proyecto EjerciciosUnidad3 - Archivo Nivel1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud3starwars;
import java.lang.Math;
/**
 *
 * @author José David Rosales Rios <jdrrdaw@gmail.com>
 * @version 1.2
 * @date $[date] $[time]
 */

//creando metodos estatico
public class Nivel1 {

    static int Nivel1() {
        
        //crear variales 
        int S1 = (int) (1 + Math.random() * (10 - 1 + 1)),
                S2 = (int) (20 + Math.random() * (30 - 20 + 1)),
                resultado = 0;
        
        //crear texto nivel 1
        System.out.println("=== Nivel 1 ===");
        System.out.println("Los   problemas   empiezan   cuando  deben   realizar   un   salto\n"
                + "hiperespacial hasta el sistema estelar " + S1 + " en el sector " + S2 + " , pero el\n"
                + "control  de   navegación   está   estropeado   y   el   computador   tiene\n"
                + "problemas   para   calcular   parte   de   las   coordenadas   de   salto.\n"
                + "Chewbacca,   piloto   experto,   se   da   cuenta   que   falta   el   cuarto\n"
                + "número de la serie. Recuerda de sus tiempos en la academia de\n"
                + "pilotos que para calcularlo hay que calcular el sumatorio entre el\n"
                + "nº   del   sistema   y   el   nº   del   sector   (ambos   inclusive).   "
                + "\n¿Qué   debe introducir?");
        
        //crear bucle para la sumatoria
        for (int i = S1; i <= S2; i++) {
            resultado += i;
        }

        return resultado;
    }
}
