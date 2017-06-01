/**
 * Created by 54167208T on 25/05/2017.
 */
public class HoraExacta extends Hora{
    protected int segundos;

    public HoraExacta(int hora, int minutos, int segundos){
        super(hora,minutos);
        this.segundos = segundos;
        setSegundos(segundos);
    }

    public void setSegundos (int segundos){
        if (segundos > 0 && segundos <= 60){
            this.segundos = segundos;
        }
    }

    @Override
    public void inc() {
        segundos++;
        if (segundos > 60){
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return "HoraExacta{" +
                "hora=" + hora +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                '}';
    }
}
