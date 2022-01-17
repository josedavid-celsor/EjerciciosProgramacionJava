
package ud6ejercicios.ProgramaCoche;


public enum TipoCoche {
    
    MINI("mini"), UTILITARIO("utilitario"), FAMILIAR("familiar"), DEPORTIVO("deportivo");
    private String tipo;
    
    private TipoCoche(String t){
        tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
}
