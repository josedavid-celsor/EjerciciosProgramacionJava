/*
 * Proyecto EjerciciosUnidad3 - Archivo Inicio.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/license/by-nc-by-sa/4.0/
 */
package ud3starwars;

import static ud3starwars.Bienvenida.Bienvenida;
import static ud3starwars.Nivel2.Nivel2;
import static ud3starwars.Nivel3.Nivel3;
import static ud3starwars.Perder.Perder;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author José David Rosales Rios <jdrrdaw@gmail.com>
 * @version 1.2
 * @date $[date] $[time]
 */
public class Inicio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //llamar la función bienvenida para empezar el juego
        Bienvenida();
        String inicio = teclado.nextLine();

        //hacer el for
        while (!inicio.equals("")) {
            System.out.println("Codigo incorrecto, presione intro para continuar");
            inicio = teclado.nextLine();
        }

        //Llamar  nivel 1
        int resultadoNivel1 = Nivel1.Nivel1();

        //recibir respuesta de resultado
        int respuesta = teclado.nextInt();

        //Variables siguientes niveles
        int resultadoNivel2 = 0;
        int resultadoNivel3 = 0;
        int resultadoNivel4 = 0;
        int resultadoNivel5 = 0;

        //comparar respuestas del usuario en el Nivel1
        if (respuesta == resultadoNivel1) {

            //llamar a la función nivel 2 y almacena resultado nivel 2
            resultadoNivel2 = Nivel2.Nivel2();
        } else {
            Perder();
        }

        //recibir respuesta de resultado
        respuesta = teclado.nextInt();

        //evaluar respuesta nivel 3
        respuesta = teclado.nextInt();
        if (respuesta == resultadoNivel3) {

            //llamar a la función nivel 3 y almacena resultado nivel 3
            resultadoNivel3 = Nivel3();
        } else {
            Perder();
        }
    }

}
