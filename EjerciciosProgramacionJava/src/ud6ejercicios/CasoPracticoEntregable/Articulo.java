package ud6ejercicios.CasoPracticoEntregable;

public class Articulo {

    private String nombre;
    private double precio;
    private double iva;
    private int cuantos;

    public Articulo(String nombre, double precio, double iva, int cuantos) {

        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantos = cuantos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIva() {
        return iva;
    }

    public int getCuantos() {
        return cuantos;
    }

    public void setCuantos(int cuantos) {
        this.cuantos = cuantos;
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

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void restaCant(int cantidad) {

        this.cuantos -= cantidad;
    }
    
    public double calculoCompra(Articulo a){
       return this.precio * this.cuantos;
    }
        public double calculoCompraIva(Articulo a){
       return this.precio * this.cuantos * this.iva;
    }
    
    
    
    
}
