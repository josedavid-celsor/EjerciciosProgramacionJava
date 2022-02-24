package ud8POOAvanzada;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> p = new ArrayList();

        Profesor prof = new Profesor("Lionel", "Tarazon", "19-09-1997", 1200, "Profesor");
        Profesor prof2 = new Profesor("Pedro", "Garcia", "19-09-1998", 1200, "Profesor");
        Profesor prof3 = new Profesor("Juan", "Ignacio", "19-09-1997", 1200, "Profesor");
        Profesor prof4 = new Profesor("Sergio", "Rios", "19-09-1997", 1200, "Profesor");
        Profesor prof5 = new Profesor("Iris", "Suay", "19-09-1997", 1200, "Profesor");

        Alumno alum = new Alumno("Carla", "Zamorano", "15-03-2001", 1, 10);
        Alumno alum2 = new Alumno("Aida", "Piqueras", "15-03-2001", 1, 5);
        Alumno alum3 = new Alumno("Hector ", "Aguilar", "15-03-2001", 1, 4);
        Alumno alum4 = new Alumno("Simon", "Aranda", "15-03-2001", 1, 7);
        Alumno alum5 = new Alumno("Nancy", "Rosado", "15-03-2001", 1, 8);
        
       p.add(prof);
       p.add(prof2);
       p.add(prof3);
       p.add(prof4);
       p.add(prof5);
       p.add(alum);
       p.add(alum2);
       p.add(alum3);
       p.add(alum4);
       p.add(alum5);
       
        for (int i = 0; i < p.size(); i++) {
            p.get(i).mostrar();
            System.out.println("");
        }
       
    }
}
