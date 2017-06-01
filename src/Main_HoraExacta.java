import java.util.Calendar;

/**
 * Created by 54167208T on 25/05/2017.
 */
public class Main_HoraExacta {
    static public void main(String args[]) {
        Calendar fecha = Calendar.getInstance();
        int h_moment = fecha.get(Calendar.HOUR_OF_DAY);
        int m_moment = fecha.get(Calendar.MINUTE);
        int s_moment = fecha.get(Calendar.SECOND);

        HoraExacta h = new HoraExacta(h_moment,m_moment,s_moment);
        System.out.println(h);

        for (int i = 1; i < 3000; i++) {
            h.inc();
        }
        System.out.println(h);

        h.setHora(2);
        System.out.println(h);
    }
}
