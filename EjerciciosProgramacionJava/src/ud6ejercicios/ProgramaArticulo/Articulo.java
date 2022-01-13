package ud6ejercicios.ProgramaArticulo;

public class Articulo {

    private String nombre;
    private int precio, tipo, resto;
    private final double iva = 0.21;
    private final double iva2 = 0.10;
    private final double iva3 = 0.04;

    public Articulo(String nombre, int precio, int iva, int resto) {

        if (nombre.equals("") && precio != 0) {
            System.err.println("ERROR");
        } else {
            this.nombre = nombre;
            this.precio = precio;
            this.tipo = iva;
            this.resto = resto;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getIva() {
        return tipo;
    }

    public int getResto() {
        return resto;
    }

    public void NuevoArticulo(String nombre, int precio, int iva, int resto) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.resto = resto;
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

 

    public void setResto(int resto) {
        if (resto != 0) {
            System.err.println("ERROR");
        } else {
            this.resto = resto;
        }
    }

    public double getPVP() {
        double precio = 0;
        switch(tipo){
            case 1: precio = (this.precio * iva) + this.precio;
            case 2: precio = (this.precio * iva2) + this.precio;
            case 3: precio = (this.precio * iva3) + this.precio;
            break;
        }
        return precio;
       
    }

    public double getPVPDescuento(double descuento) {

        double resultado = getPVP() - descuento;
        return resultado;
    }

    public void imprime(Articulo p) {
        System.out.println(p.nombre + "- Precio:" + p.precio + " - IVA: " + p.iva + "% " + "- PVP:" + p.getPVP() + "€");
    }

    public boolean vender(Articulo p, int cantidad) {

        if (cantidad <= p.resto) {
            p.resto -= cantidad;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean almacenar(Articulo p, int cantidad) {

        if (cantidad <= p.resto) {
            p.resto += cantidad;
            return true;
        } else {
            return false;
        }
    }
}
