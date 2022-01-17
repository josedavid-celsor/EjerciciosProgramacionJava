package ud6ejercicios.ProgramaCoche;

public class Coche {
    
    private String modelo, color, matricula;
    private boolean pintura;
    private int año; 
    
    
    private TipoCoche tipo;
    private Seguro seguro;
    //constructor
    public Coche(String modelo, String color, boolean pintura,TipoCoche tipo, int año, Seguro seguro, String matricula){
        this.modelo = modelo;
        this.color = color;
        this.pintura = pintura;
        this.tipo = tipo;
        this.año = año;
        this.seguro = seguro;
        this.matricula = matricula;
        imprime();
    }
    
    //metodos getters
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public boolean getPintura(){
        return pintura;
    }
   
    public int getAño(){
        return año;
    }
    
   
    
    
    //metodos setters
     public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPintura(boolean pintura){
        this.pintura = pintura;
    }
  
    public void setAño(int año){
        this.año = año;
    }
    
   
  
     
    //metodo para imprimir
    public void imprime(){
        System.out.println("Modelo: " + modelo + ", Color: " + color + ", Pintura: " + pintura + ", Tipo: " + tipo.getTipo() + ", Año: " + año + ", Seguro: " + seguro.getSeguro());
    }
            
    
    
}
