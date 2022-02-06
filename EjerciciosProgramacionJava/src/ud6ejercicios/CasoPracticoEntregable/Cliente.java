package ud6ejercicios.CasoPracticoEntregable;

public class Cliente {

    private int contador = 0;
    private String nombre, telefono, direccion;
    private Articulo[] carrito;

    public Cliente(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.carrito = new Articulo[10];
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void imprime() {
        for (int i = 0; i < contador; i++) {

            System.out.println("Nombre: " + carrito[i].getNombre() + "Precio: " + carrito[i].getPrecio() + "Iva: " + carrito[i].getIva() + "Cuantos: " + carrito[i].getCuantos());
        }
    }

    public void añadirArticulo(Articulo a) {

    }

    public void añadirArticuloCarrito(Articulo a, int cantidad) {
        if (cantidad > a.getCuantos()) {
            System.err.println("No hay esa cantidad, actualmente en stock solo quedan: " + a.getCuantos());
        } else {
            //articulos[posicion].setCuantos(articulos[posicion].getCuantos() + cantidad);
            carrito[contador] = new Articulo(a.getNombre(), a.getPrecio(), a.getIva(), cantidad);
            contador++;
            
            //this.carrito[contador].setCuantos(this.carrito[cantidad].getCuantos() + cantidad);
            //Articliente[contador] += Articliente[contador].getCuantos() + cantidad;   
        }

    }

    public void eliminarArticuloCarrito(int posicion, int cantidad) {
        if (cantidad > this.carrito[posicion].getCuantos() && posicion < this.carrito.length) {
            System.err.println("No hay esa cantidad, actualmente la cantidad de articulos en tu carrito es de:" + this.carrito[posicion].getCuantos());
        } else {
            this.carrito[posicion].setCuantos(this.carrito[posicion].getCuantos() - cantidad);
        }
    }

    public void imprimecli() {
        System.out.println("Nombre: " + getNombre() + " " + "Telefono: " + getTelefono() + " " + "Dirección: " + getDireccion());
    }

    public void comprar(int posicionArt) {

    }

    public double CalculoCarro(Cliente c) {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += carrito[i].calculoCompra(carrito[i]);

        }
        return total;
    }

    public double CalculoCarroIva(Cliente c) {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += carrito[i].calculoCompraIva(carrito[i]);

        }
        return total;
    }
}
