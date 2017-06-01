/**
 * Created by 54167208T on 23/05/2017.
 */
public class Hora12 extends Hora {
    public enum Cambio {AM, PM}

    protected Cambio c;

    public Hora12(int hora, int minutos, Cambio c) {
        super(hora,minutos);
        setHora(hora);
        this.c = c;
    }

    @Override
    public void setHora(int hora) {
        if (hora >= 1 && hora <= 12){
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("La hora tiene que estar entre 1 y 12! La hora introducida es: " + hora);
        }
    }

    @Override
    public void inc() {
        super.inc();
        if (hora > 12){
            hora = 1;
            c = c == Cambio.AM ? Cambio.PM : Cambio.AM;
        }
    }

    @Override
    public String toString() {
        return "Hora12{" +
                "hora=" + hora +
                ", minutos=" + minutos +
                ", c=" + c +
                '}';
    }
}
