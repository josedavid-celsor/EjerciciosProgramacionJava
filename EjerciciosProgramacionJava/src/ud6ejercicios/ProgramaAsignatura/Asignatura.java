package ud6ejercicios.ProgramaAsignatura;

public class Asignatura {
    
    private String nombre;
    private int cod_num, curso;
    
    //creando constructor
    public Asignatura(String nombre,int cod_num,int curso){
        
        this.nombre = nombre;
        this.cod_num = cod_num;
        this.curso = curso;
        
    }
    
    //metodo getters
    public String getNombre(){
        return nombre;
    }
    
    public int getCod_num(){
        return cod_num;
    }
    
    public int getCurso(){
        return curso;
    }
    
    //metodo setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCod_num(int cod_num){
        this.cod_num = cod_num;
    }
    
    public void setCurso(int curso){
        this.curso = curso;
    }
    
    public void imprime(){
        System.out.println("Nombre: " + nombre + ", Código: " + cod_num + ", Curso: " + curso);
        
    }
    
    
    
}
