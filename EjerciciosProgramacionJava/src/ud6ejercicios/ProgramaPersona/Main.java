package ud6ejercicios.ProgramaPersona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        

        System.out.println("Nombre:");
        String n = teclado.nextLine();

        System.out.println("Apellido:");
        String a = teclado.nextLine();

        System.out.println("DNI:");
        String d = teclado.nextLine();
        
        System.out.println("Edad:");
        int e = teclado.nextInt();
        
        Persona jose = new Persona(n,a,d,e);
        
        System.out.println("Nombre:" + jose.getNombre() + " Apellido: " + jose.getApellido() + " DNI: " + jose.getDNI() + " Edad: " + jose.getEdad());
        
        System.out.println("Nombre:");
        String n1 = teclado.nextLine();

        System.out.println("Apellido:");
        String a1 = teclado.nextLine();

        System.out.println("DNI:");
        String d1 = teclado.nextLine();
        
        System.out.println("Edad:");
        int e1 = teclado.nextInt();
       
        Persona iris = new Persona(n1, a1, d1, e1);
        
        System.out.println("Nombre:" + iris.getNombre() + " Apellido: " + iris.getApellido() + " DNI: " + iris.getDNI() + " Edad: " + iris.getEdad());
          
        
        
    }
}
