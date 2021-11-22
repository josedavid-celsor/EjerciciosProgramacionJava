/*
 * Proyecto EjerciciosUnidad3 - Archivo Nivel2.java - Compañia DAW
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
//creando metodo estatico nivel 2
public class Nivel2 {

    static int Nivel2() {

        //crear variales 
        int P1 = (int) (1 + Math.random() * (7 - 1 + 1)),
                P2 = (int) (8 + Math.random() * (12 - 8 + 1)),
                resultado = 0;

        //crear texto nivel 2
        System.out.println("=== Nivel 2 ===");
        System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a\n"
                + "lo lejos la estrella de la muerte. Como van en una nave imperial\n"
                + "robada   se   aproximan   lentamente   con   la   intención   de   pasar\n"
                + "desapercibidos. De  repente suena el comunicador. “Aquí agente\n"
                + "de espaciopuerto"+ P1 + "contactando con nave imperial" + P2 + ". No están\n"
                + "destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el\n"
                + "comunicador   e   improvisa.   “Eh...   tenemos   un   fallo   en   el...   eh...\n"
                + "condensador   de   fluzo...   Solicitamos   permiso   para   atracar   y\n"
                + "reparar   la   nave”.   El   agente,   que   no   se   anda   con   tonterías,\n"
                + "responde “Proporcione código de acceso o abriremos fuego”. Han\n"
                + "Solo   ojea   rápidamente   el   manual   del   piloto   que   estaba   en   la\n"
                + "guantera y da con la página correcta. El código es el productorio\n"
                + "entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                "¿Cuál es el código?");
        
        //crear bucle para la sumatoria
        for (int i = P1; i <= P2; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
