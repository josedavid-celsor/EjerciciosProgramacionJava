package ud6ejercicios.ProgramaPersona;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    public Persona() {
        this.nombre ="";
        this.apellido = "";
        this.dni = "";
        this.edad = 0;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getDNI(){
        return dni;
    }
    
    public int getEdad(){
        return edad;
    }
    
    //SETTERS
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setDNI(String dni){
        this.dni = dni;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
}
