package ud6ejercicios.ProgramaRectangulo;

public class Main {
    
    public static void main(String[] args) {
        Rectangulo a = new Rectangulo(0, 0, 5, 5);
        Rectangulo b = new Rectangulo(7, 9, 2, 3);
        
        System.out.println("Coordenadas rectangulo a en X" + a.getX1() + ", " + a.getX2());
        System.out.println("Coordenadas rectangulo a en Y" + a.getY1() + ", " + a.getY2());
        
        System.out.println("Coordenadas rectangulo b en X" + b.getX1() + ", " + b.getX2());
        System.out.println("Coordenadas rectangulo a en Y" + b.getY1() + ", " + b.getY2());
        
        System.out.println("Perimetro del rectangulo a " + a.Perimetro());
        System.out.println("Perimetro del rectangulo b " + b.Perimetro());
        
        System.out.println("Area del rectangulo a " + a.Area());
        System.out.println("Area del rectangulo b " + b.Area());
    }

}
