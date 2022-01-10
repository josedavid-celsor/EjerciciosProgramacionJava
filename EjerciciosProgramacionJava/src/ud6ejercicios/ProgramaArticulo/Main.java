package ud6ejercicios.ProgramaArticulo;

public class Main {

    public static void main(String[] args) {
        Articulo a = new Articulo("Pijama", 10, 21, 5);

        double PVP = a.getPrecio() + ((a.getIva() / 100) * a.getPrecio());

        System.out.println(a.getNombre() + "- Precio:" + a.getPrecio() + " - IVA: " + a.getIva() + "% " + "- PVP:" + PVP + "€");
    }

}
