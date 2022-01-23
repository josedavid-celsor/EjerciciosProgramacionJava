package ud6ejercicios.ProgramasDNI;

public class DNI {

    private int DNI;

    public DNI (int dni) {
        this.DNI = dni;
       

    }

    //metodo seters
    public void setDNI(int dni) {
        this.DNI = dni;
    }

    //metodo getters
    public int getDNI(int dni) {
        return dni;
    }

    public char getLetra() {

        String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";

        int modulo = DNI % 23;

        char letra = juegoCaracteres.charAt(modulo);

        return letra;
    }
    
    public String getNIF(){
        String dni = String.valueOf(DNI);
        return dni + getLetra();
    }
    
    //si empieza con 0 el 0 no se pone al principio
    public DNI newRandomDNI(){
        String a = "";
        for (int i = 0; i < 8; i++) {
           int num = (int)(Math.random()*(9-0+1) + 0);
           a += num + "";
        }
        DNI = Integer.parseInt(a);
        DNI rand = new DNI(DNI);
        return rand;
    }

    public void imprime() {
        System.out.println( "DNI: " + getNIF());
    }

}
