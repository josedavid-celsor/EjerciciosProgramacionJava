package PracticaExamenAbastos;

public class Examen {

    private String nombre, aula;
    Fecha fecha;
    Hora hora;

    public Examen(String nombre, String aula, Fecha fecha, Hora hora) {
        this.nombre = nombre;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAula() {
        return aula;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
    
    
    
}
