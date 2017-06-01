/**
 * Created by 54167208T on 23/05/2017.
 */
public class Hora {
    protected int hora, minutos;

    Hora(int hora, int minutos) {
        this.hora = 0;
        this.minutos = 0;
        setHora(hora);
        setMinutos(minutos);
    }

    public void inc() {
        minutos++;
        if (minutos > 59){
            minutos = 0;
            hora++;
            if (hora > 23){
                hora = 0;
            }
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 60){
            this.minutos = minutos;
        }
    }

    public void setHora(int hora) {
        if ( hora >= 0 && hora <= 24){
            this.hora = hora;
        }
    }

    @Override
    public String toString() {
        String resultado_hora;
        resultado_hora = hora + ":" + minutos;
        return resultado_hora;
    }
}
