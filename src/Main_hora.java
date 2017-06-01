import java.util.Calendar;

/**
 * Created by 54167208T on 23/05/2017.
 */
public class Main_hora {
    static public void main(String args[]) {
        Calendar fecha = Calendar.getInstance();
        int h_moment = fecha.get(Calendar.HOUR_OF_DAY);
        int m_moment = fecha.get(Calendar.MINUTE);

        Hora hora = new Hora(h_moment,m_moment);
        System.out.println(hora);

        for (int i = 1; i < 61; i++) {
            hora.inc();
        }
        System.out.println(hora);

        hora.setHora(20);
        System.out.println(hora);
    }
}
