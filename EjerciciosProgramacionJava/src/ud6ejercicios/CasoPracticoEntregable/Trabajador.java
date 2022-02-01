package ud6ejercicios.CasoPracticoEntregable;

public class Trabajador {

    private String nombre, telefono, direccion;
    private int num_trabajador;

    public Trabajador(String nombre, int num_trabajador, String telefono, String direccion) {
        this.nombre = nombre;
        this.num_trabajador = num_trabajador;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumTrabajador() {
        return num_trabajador;
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

    public void setNumTrabajador(int num_trabajador) {
        this.num_trabajador = num_trabajador;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
