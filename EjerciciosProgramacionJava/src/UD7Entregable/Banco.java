package UD7Entregable;

public class Banco {

    private Cuenta[] cuentas;
    private final int MAX = 100;
    private int cuantos, buscar = 0;

    public Banco() {
        cuentas = new Cuenta[MAX];
        cuantos = 0;
    }

    public void ingresarDinero(int posCuenta, double dinero) throws CuentaException {
        if (cuantos > 0) {
            cuentas[posCuenta].ingresarDinero(dinero);
        } else {
            System.err.println("No hay cuentas\n");
        }
    }

    public void retirarDinero(int posCuenta, double dinero) throws CuentaException {
        cuentas[posCuenta].retirarDinero(dinero);
    }

    public void transferencia(int posCuenta1, int posCuenta2, double dinero) throws CuentaException {
        if (cuentas[posCuenta1].retirarDinero(dinero)) {
            cuentas[posCuenta2].ingresarDinero(dinero);
        }
    }

    public void agregarCuenta(Cuenta c) {
        if (cuantos < MAX) {
            cuentas[cuantos] = c;
            cuantos++;
        } else {
            System.err.println("Banco lleno\n");
        }
    }

    public void eliminarCuenta(int posCuenta) {
        if (posCuenta >= 0 && posCuenta < cuantos) {
            for (int i = posCuenta; i < (cuantos - 1); i++) {
                cuentas[i] = cuentas[i + 1];
            }
            cuantos--;
        }
    }

    public int[] buscarCuenta(String nombre) {
        int[] pos = new int[MAX];
        buscar = 0;

        for (int i = 0;
                i < cuantos;
                i++) {
            if (cuentas[i].getNombre().toUpperCase().indexOf(nombre.toUpperCase()) != -1) {
                pos[buscar] = i;
                buscar++;
            }
        }
        if (buscar == 0) {
            System.err.println("No hay cuentas con ese nombre\n");
        }
        return pos;
    }

    public String getCuenta(int posicion) {
        return posicion - 1 + ". " + cuentas[posicion - 1].getNombre() + "  Saldo: " + cuentas[posicion - 1].getsaldo();
    }

    public void imprimirBuscarCuenta(int[] pos) {
        for (int i = 0; i < buscar; i++) {
            System.out.println(getCuenta(pos[i] + 1));
        }
    }

    public void mostrarMorosos() {
        int neg = 0;
        for (int i = 0; i < cuantos; i++) {
            if (cuentas[i].getsaldo() < 0) {
                System.out.print(i + ". ");
                cuentas[i].imprimir();
                neg++;
            }
        }
        if (neg == 0) {
            System.err.println("No hay cuentas en negativo\n");
        }
    }

    public void imprimirTodos() throws CuentaException {
        if (cuantos == 0) {
            throw new CuentaException("No hay cuentas");
        } else {
            for (int i = 0; i < cuantos; i++) {
                System.out.print(i + ". ");
                cuentas[i].imprimir();
            }
        }
    }
}
