package ud6ejercicios.ExtraArrayList;

import java.util.ArrayList;

public class Colores {

    public static void main(String[] args) {
        ArrayList<String> lista_colores = new ArrayList();
        lista_colores.add("Rojo");
        lista_colores.add("Azul");
        lista_colores.add("Verde");
        lista_colores.add("Naranja");
        lista_colores.add("Blanco");
        
        System.out.println(lista_colores);
        for (int i = 0; i < lista_colores.size(); i++) {
            System.out.println(lista_colores.get(i));

        }
        
        lista_colores.add("Negro");
        lista_colores.add("Cyan");
        lista_colores.add(0, "Amarillo");
        lista_colores.add(1, "Magenta");
        lista_colores.remove(2);
        lista_colores.remove(2);
        
        System.out.println(lista_colores);
        
        
    }
}
