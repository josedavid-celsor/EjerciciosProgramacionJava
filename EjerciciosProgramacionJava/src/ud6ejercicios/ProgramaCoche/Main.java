package ud6ejercicios.ProgramaCoche;

public class Main {

    public static void main(String[] args) {
        Coche a = new Coche("Mercedes", "Verde", true, TipoCoche.DEPORTIVO, 1998, Seguro.TERCEROS, "A4587VD");
        Coche b = new Coche("Ferrari", "Rojo", false, TipoCoche.DEPORTIVO, 1988, Seguro.TODO_RIESGO, "A9687VD");
        Coche c = new Coche("Mini", "Gris", true, TipoCoche.MINI, 1998, Seguro.TERCEROS, "A2567VD");
    }
}
