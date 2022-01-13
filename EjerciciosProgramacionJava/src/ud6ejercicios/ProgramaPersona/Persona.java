package ud6ejercicios.ProgramaPersona;

public class Persona {

    private String nombre, apellido;
    private final String dni;
    private int edad;
    private final int mayorDeEdad = 18;

    public Persona(String nombre, String apellido, String dni, int edad) {
        
        if(validarDNI(dni)){
            this.dni = dni;
        }else{
            this.dni = "Vaciar";
            System.err.println("Error");
        }
        this.nombre = nombre;
        this.apellido = apellido;
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

        if (e < mayorDeEdad) {
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

    public int diferenciaEdad(Persona p) {

        int diff = 0;

        if (this.edad > p.edad) {
            diff = this.edad - p.edad;
        } else {
            diff = p.edad - this.edad;
        }

        return diff;
    }

    public static boolean validarDNI(String dni) {

        boolean valido = false;
        String num = dni.substring(0, (dni.length()-1));
        int numeros;
        try{
            numeros = Integer.parseInt(num);
            valido = true;
        }catch(Exception e){
            valido = false;
        }
        return valido;
    }

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
