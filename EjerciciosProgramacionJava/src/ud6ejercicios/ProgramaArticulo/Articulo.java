package ud6ejercicios.ProgramaArticulo;


public class Articulo {

    private String nombre;
    private int precio;
    private int iva;
    private int resto;
    
    public Articulo (String nombre, int precio, int iva, int resto){
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.resto = resto;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public int getIva(){
        return iva;
    }
    public int getResto(){
        return resto;
    }
    
     public void NuevoArticulo (String nombre, int precio, int iva, int resto){
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.resto = resto;
    }
}
