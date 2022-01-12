package ud6ejercicios.ProgramaPunto;

public class Main {
    
    public static void main(String[] args) {
        Punto a = new Punto(5, 10);
        
        Punto b = new Punto(10,10);
        
        Punto c = new Punto (-3, 7);
        
        System.out.println("La diferencia es: " + c.distancia(b));
        System.out.println("Las coordenadas del punto a  son: " + a.getX() + "," + a.getY());
       /* System.out.println("Las coordenadas del punto b  son: " + b.getX() + "," + b.getY());
        System.out.println("Las coordenadas del punto c  son: " + c.getX() + "," + c.getY());*/
    }
}
