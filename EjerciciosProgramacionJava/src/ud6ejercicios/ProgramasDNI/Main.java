package ud6ejercicios.ProgramasDNI;

public class Main {

    public static void main(String[] args) {

        int contador = 0;
        DNI[] dniRand = new DNI[10000];

        for (int i = 0; i < dniRand.length; i++) {
            dniRand[i] = new DNI(0);
            dniRand[i].newRandomDNI();
            dniRand[i].imprime();
        }

        

        for (int i = 0; i < dniRand.length; i++) {

            if (dniRand[i].getLetra() == 'A' || dniRand[i].getLetra() == 'E' || dniRand[i].getLetra() == 'I' || dniRand[i].getLetra() == 'O' || dniRand[i].getLetra() == 'U') {
                contador++;
            }

        }
        System.out.println("Hay " + contador + " DNI que contiene vocales");
        
        

    }
}
