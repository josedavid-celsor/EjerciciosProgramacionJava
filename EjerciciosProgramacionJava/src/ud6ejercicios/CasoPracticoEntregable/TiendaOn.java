package ud6ejercicios.CasoPracticoEntregable;

public class TiendaOn {

    private String nombre, telefono, direccion;
    private Articulo[] articulos;

    public TiendaOn(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.articulos = new Articulo[10];
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public Articulo[] getArticulos() {
        return articulos;
    }
    
    public Articulo getArticulo(int pos) {
        return articulos[pos];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void añadirArticulo(int posicion, String nombre, double precio, double iva, int cuantos) {

        Articulo x = new Articulo(nombre, precio, iva, cuantos);
        articulos[posicion] = x;

    }

    public void imprime() {
        for (int i = 0; i < articulos.length; i++) {
            System.out.println(i + " " +  articulos[i].getNombre() + " " + articulos[i].getPrecio() + "€ " + "Iva: " + articulos[i].getIva() + " " + "Stock: " + articulos[i].getCuantos());
        }
    }

}