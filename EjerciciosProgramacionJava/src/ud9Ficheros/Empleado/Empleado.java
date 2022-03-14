package ud9Ficheros.Empleado;

/**
 * Clase que representa a un empleado
 * @author José David Rosales Rios 
 * @version 14-03-2022
 * 
 */
public class Empleado {

    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    /**
     * Metodo para aumentar el sueldo
     * 
     * @param sueldoPlus cantidad de dinero que se le suma al parametro
     * @return devuelve true si se puede hacer el aumento de sueldo y false si el aumento no ha posido hacerse
     */
    //Metodos publicos
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }

    /**
     * Metodo para comprobar el nombre 
     * 
     * @return devuelve false si el nombre esta vacio y true si el nombre no está vacio
     */
    //Metodos privados
    private boolean compruebaNombre() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }
    
    //Constructores
    /**
     * Constructor por defecto
     */
    public Empleado() {
        this("", "", 0, 0);
    }
    
    /**
     * Constructor del empleado
     * 
     * @param nombre indica el nombre del empleado
     * @param apellido indica el apellido del empleado
     * @param edad indica la edad del empleado
     * @param salario indica el salario del empleado
     */
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}
