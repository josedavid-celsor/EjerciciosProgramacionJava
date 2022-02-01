package ud6ejercicios.CasoPracticoEntregable;

public class Articulo {
    
    private String nombre;
    private double precio, tipo;
    private final double iva = 0.21;
    private int cuantos;
    
    public Articulo(String nombre, double precio, double iva, int cuantos){
        
            this.nombre = nombre;
            this.precio = precio;
            this.tipo = iva;
            this.cuantos = cuantos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIva() {
        return tipo;
    }
    
      public void setNombre(String nombre) {
        if (nombre.equals("")) {
            System.err.println("ERROR");
        } else {
            this.nombre = nombre;
        }
    }

    public void setPrecio(int precio) {
        if (precio != 0) {
            System.err.println("ERROR");
        } else {
            this.precio = precio;
        }
    }
}
