import java.util.Calendar;

/**
 * Created by 54167208T on 25/05/2017.
 */
public class Main_hora12 {


    static public void main(String args[]) {
        Hora12.Cambio meridiano = Hora12.Cambio.AM;

        Calendar fecha = Calendar.getInstance();
        int h_moment = fecha.get(Calendar.HOUR_OF_DAY);
        int m_moment = fecha.get(Calendar.MINUTE);

        if (h_moment >= 12){
            h_moment = h_moment - 12;
            meridiano = Hora12.Cambio.PM;
        }

        Hora12 h = new Hora12(h_moment,m_moment,meridiano);
        System.out.println(h);

        for (int i = 1; i < 3000; i++) {
            h.inc();
        }
        System.out.println(h);

        h.setHora(12);
        System.out.println(h);
    }
}
