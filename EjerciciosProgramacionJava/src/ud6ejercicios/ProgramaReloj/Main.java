
package ud6ejercicios.ProgramaReloj;

public class Main {
    
    public static void main(String[] args) {
         Reloj a = new Reloj (15, 58, 59);
         a.imprime_hora();
         a.dime_hora12();
         
         a.tick();
         a.imprime_hora();
         a.imprime_hora12();
    }
    
}
