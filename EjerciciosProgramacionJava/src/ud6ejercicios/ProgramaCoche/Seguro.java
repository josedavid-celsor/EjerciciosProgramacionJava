package ud6ejercicios.ProgramaCoche;

public enum Seguro {
    
    TERCEROS("terceros"), TODO_RIESGO("todo riesgo");
    
    private String seguro;
    
    private Seguro(String s){
        seguro = s;
    }
    
    public String getSeguro(){
        return seguro;
    }
}
