package ud8POOAvanzada;

public class Alumno extends Persona{
    
    private int grupo;
    private double nota;
    
    public Alumno(String n, String a, String f, int grupo, int nota){
        super(n,a,f);
        this.grupo = grupo;
        this.nota = nota;
    }
    
    public String getNombre(){
        return "Alumno" + super.getNombre();
    }
    public int getGrupo() {
        return grupo;
    }

    public double getNota() {
        return nota;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public void mostrar(){
      super.mostrar();
        System.out.println("Grupo: " + grupo + "\nNota: " + nota );
    }
}
