package ud6ejercicios.ProgramaArticulo;

public class Articulo {

    private String nombre;
    private int precio, iva, resto;

    public Articulo(String nombre, int precio, int iva, int resto) {

        if (nombre.equals("") && precio != 0) {
            System.out.println("ERROR");
        } else {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
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
        return iva;
    }

    public int getResto() {
        return resto;
    }

    public void NuevoArticulo(String nombre, int precio, int iva, int resto) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.resto = resto;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("")) {
            System.out.println("ERROR");
        } else {
            this.nombre = nombre;
        }
    }

    public void setPrecio(int precio) {
        if (precio != 0) {
            System.out.println("ERROR");
        } else {
            this.precio = precio;
        }
    }

    public void setIva(int iva) {
        if (iva != 0) {
            System.out.println("ERROR");
        } else {
            this.iva = iva;
        }
    }

    public void setResto(int resto) {
        if (resto != 0) {
            System.out.println("ERROR");
        } else {
            this.resto = resto;
        }
    }

    public double getPVP() {
        double PVP = precio + (iva / 100) * precio;
        return PVP;
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
