package ud6ejercicios.ProgramaPunto;

public class Punto {

    private int x;
    private int y;

   /* public Punto() {
        this.x = 0;
        this.y = 0;
    }*/
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
