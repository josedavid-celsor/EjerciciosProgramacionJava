package ud6ejercicios.ProgramaAsignatura;

public class Main {

    public static void main(String[] args) {

        Asignatura mates = new Asignatura("Matemáticas", 1017, 1);
        Asignatura lenguaje = new Asignatura("Lenguaje", 150, 2);
        Asignatura info = new Asignatura("Informática", 160, 3);
        
        mates.imprime();
        lenguaje.imprime();
        info.imprime();

       
    }
}
