package ud6ejercicios.ProgramaPunto;

public class Punto {

    private int x, y;

   /* public Punto() {
        this.x = 0;
        this.y = 0;
    }*/
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void imprime() {
        System.out.println("Coordenadas: " + x + ", " + y);
    }
    
    public void desplazamiento(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    public double distancia(Punto p){
        
        double resultado = Math.sqrt(Math.pow((p.x - this.x),2) + Math.pow((p.y - this.y), 2));
        return resultado;
    }
    
    public static Punto CrearPuntoAleatorio(){
        Punto p = new Punto((int) (Math.random()*(100-(-100)+1)+(-100)), (int)(Math.random()*(100-(-100)+1)+(-100)));
        return p;
    }

}
