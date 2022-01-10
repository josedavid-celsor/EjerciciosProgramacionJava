package ud6ejercicios.ProgramaPersona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Persona jose = new Persona();

        System.out.println("Nombre:");
        jose.setNombre(teclado.nextLine());

        System.out.println("Apellido:");
        jose.setApellido(teclado.nextLine());

        System.out.println("DNI:");
        jose.setDNI(teclado.nextLine());
        
        System.out.println("Edad:");
        jose.setEdad(teclado.nextInt());   
        
        System.out.println("Nombre:" + jose.getNombre() + " Apellido: " + jose.getApellido() + " DNI: " + jose.getDNI() + " Edad: " + jose.getEdad());
        
        if (jose.getEdad() < 18){
            System.out.println("Es menor");
        } else{
            System.out.println("Es mayor");
        }
        
        Persona iris = new Persona();

        System.out.println("Nombre:");
        iris.setNombre(teclado.nextLine());

        System.out.println("Apellido:");
        iris.setApellido(teclado.nextLine());

        System.out.println("DNI:");
        iris.setDNI(teclado.nextLine());
        
        System.out.println("Edad:");
        iris.setEdad(teclado.nextInt());   
        
        System.out.println("Nombre:" + iris.getNombre() + " Apellido: " + iris.getApellido() + " DNI: " + iris.getDNI() + " Edad: " + iris.getEdad());
        
        if (iris.getEdad() < 18){
            System.out.println("Es menor");
        } else{
            System.out.println("Es mayor");
        }
    }
}
