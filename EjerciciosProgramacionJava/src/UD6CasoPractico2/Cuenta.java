package UD6CasoPractico2;

public class Cuenta {

    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) throws CuentaException {
        if (saldo >= 0) {
            this.nombre = nombre;
            this.saldo = saldo;
        } else {
            throw new CuentaException("ERROR: No se permite saldo negativo");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ingresarDinero(double dinero) throws CuentaException {
        if (dinero >= 0) {
            saldo += dinero;
        } else {
            throw new CuentaException("ERROR: No se permite numeros negativos");
        }
    }

    public boolean retirarDinero(double dinero) throws CuentaException {
        if ((saldo - dinero) >= -100 && dinero >= 0) {
            saldo -= dinero;
            return true;
        } else {
            throw new CuentaException("ERROR: cantidad no permitida");
        }
    }

    public void imprimir() {
        System.out.println(nombre + "   Saldo: " + saldo + "€");
    }

}
