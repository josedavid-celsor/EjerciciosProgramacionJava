package ud6ejercicios.ProgramaRectangulo;

public class Rectangulo {

    private int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x2 < x1 && y2 < y1) {

            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.out.println("ERROR");
        }

    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1X2(int x1, int x2) {
        if(x2 < x1){
            this.x1 = x1;
            this.x2 = x2;
        } else{
            System.out.println("ERROR");
        }
    }
    
     public void setY1Y2(int y1, int y2) {
        if(y2 < y1){
            this.y1 = y1;
            this.y2 = y2;
        } else{
            System.out.println("ERROR");
        }
    }
    


    public void setCoordenadas(int x1, int y1, int x2, int y2) {
        if (x2 < x1 && y2 < y1) {

            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.out.println("ERROR");
        }

    }

    public int Perimetro() {
        int perimetro = Math.abs(x2 - x1) + Math.abs(y2 - y1) * 2;
        return perimetro;
    }

    public int Area() {
        int area = Math.abs(x2 - x1) * Math.abs(y2 - y1);
        return area;
    }

    public void imprime() {
        System.out.println("Coordenadas: (" + x1 + ", " + y1 + ")" + " y " + "(" + x2 + ", " + y2 + ")");
    }

}
