package ud6ejercicios.ProgramaCuentaCorriente;

public class CuentaCorriente {

    private int num;
    private double saldo;

    //constructor
    public CuentaCorriente(int num, double saldo) {
        if (saldo < 0) {
            System.err.println("ERROR, no se permite tener cuentas con saldo negativo");
        } else {
            this.num = num;
            this.saldo = saldo;
            imprime();
        }
    }

    //metodo getters
    public int getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }

    //metodos setters
    public void setNum(int num) {
        this.num = num;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double saldo) {
        if (saldo < 0) {
            System.err.println("ERROR, no puedes ingresar numeros negativos");
        } else if (this.num == 0) {
            System.err.println("Error, cuenta no existente");
        } else {
            this.saldo += saldo;
        }

    }

    public boolean retirar(double saldo) {

        if (this.saldo <= 0) {
            System.err.println("ERROR, No hay dinero en la cuenta");
            return false;
        } else if (saldo < 0) {
            System.err.println("ERROR, No puedes retirar numeros negativos");
            return false;
        } else {
            this.saldo -= saldo;
            return true;
        }
    }

    //metodo para imprimir
    public void imprime() {
        System.out.println("Cuenta: " + num + ", Saldo: " + saldo);
    }

}
