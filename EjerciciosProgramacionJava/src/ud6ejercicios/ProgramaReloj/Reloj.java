package ud6ejercicios.ProgramaReloj;

public class Reloj {

    private int hora, minutos, segundos;

    //constructor
    public Reloj() {
        this.hora = 00;
        this.minutos = 00;
        this.segundos = 00;
    }

    public Reloj(int hora, int minutos, int segundos) {
        if (hora > 24 || hora < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0) {
            System.err.println("ERROR");
        } else {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

    //metodos getters
    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    //metodos setters
    public void setHora(int hora) {
        if (hora > 24 || hora < 0) {
            System.err.println("ERROR, la hora no puede ser mayor a 24");
        } else {
            this.hora = hora;
        }

    }

    public void setMinutos(int minutos) {
        if (minutos > 59 || minutos < 0) {
            System.err.println("ERROR");
        } else {
            this.minutos = minutos;
        }

    }

    public void setSegundos(int segundos) {
        if (segundos > 59 || segundos < 0) {
            System.err.println("ERROR");
        } else {
            this.segundos = segundos;
        }
    }

    public void setReloj(int hora, int minutos, int segundos) {

        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);

    }

    //metodo para devolver la hora
    public String dime_hora() {

        return String.valueOf(hora) + ":" + String.valueOf(minutos) + ":" + String.valueOf(segundos);
    }

    public String dime_hora12() {
        if (hora > 12) {
            int time = hora - 12;
            return String.valueOf(time) + "pm:" + String.valueOf(minutos) + ":" + String.valueOf(segundos);
        } else {
            return String.valueOf(hora) + "am:" + String.valueOf(minutos) + ":" + String.valueOf(segundos);
        }

    }

    //metodo para imprimir la hora
    public void imprime_hora() {
        System.out.println(dime_hora());
    }

    public void imprime_hora12() {
        System.out.println(dime_hora12());
    }

    //metodo tick
    public void tick() {
        if (segundos == 59 && minutos == 59) {
            segundos = 0;
            minutos = 0;
            hora += 1;
        } else if (segundos == 59) {
            segundos = 0;
            minutos += 1;
        } else {
            segundos += 1;
        }
    }
}
