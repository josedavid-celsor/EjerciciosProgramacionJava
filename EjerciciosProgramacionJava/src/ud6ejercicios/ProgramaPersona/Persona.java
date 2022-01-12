package ud6ejercicios.ProgramaPersona;

public class Persona {

    private String nombre, apellido;
    private final String dni;
    private int edad;

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esMayor(int e) {

        if (e < 18) {
            return false;
        } else {
            return true;
        }
    }

    public boolean esJubilado(int e) {

        if (e < 65) {
            return false;
        } else {
            return true;
        }
    }
    
    public int diferenciaEdad(Persona p){
        
        int diff = 0;
                
        if(this.edad > p.edad){
            diff = this.edad - p.edad;
        } else{
            diff = p.edad - this.edad;
        }
        
        return diff;
    }
   /* public static boolean validarDNI(String dni) {

        if (dni.contains()) {
            
        }
    }*/

    public void imprimir(Persona p) {
        System.out.println("Nombre:" + p.nombre + " Apellido: " + p.apellido + " DNI: " + p.dni + " Edad: " + p.edad);
        if (esMayor(edad) == true) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        if (esJubilado(edad) == true) {
            System.out.println("Es jubilado");
        } else {
            System.out.println("No es jubilado");
        }
    }
}
