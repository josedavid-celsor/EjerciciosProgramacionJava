package ud6ejercicios.ProgramaAsignatura;

public class Main {

    public static void main(String[] args) {

        //crear array
        Asignatura[] asig = new Asignatura[5];
        
        //crear objetos dentro del array
        asig[0] = new Asignatura("Matemáticas", 1017, 1);
        asig[1] = new Asignatura("Lenguaje", 150, 2);
        asig[2] = new Asignatura("Informática", 160, 3);
        asig[3] = new Asignatura("Sistema", 158, 4);
        asig[4] = new Asignatura("Bases", 180, 5);
        
        asig[0].imprime();
        asig[1].imprime();
        asig[2].imprime();
        asig[3].imprime();
        asig[4].imprime();
    }
}
