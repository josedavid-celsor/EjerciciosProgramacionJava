package ud6ejercicios.ProgramasDNI;

public class DNI {

    private int DNI;

    public DNI(int dni) {
        this.DNI = dni;
        imprime();

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

    public void imprime() {
        System.out.println( "DNI: " + getNIF());
    }

}
