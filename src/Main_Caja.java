/**
 * Created by lvpac on 01/06/2017.
 */
public class Main_Caja {
    public static void main(String[] args) {
    Caja c = new Caja(25,30,40, Caja.unidad.CM);
    c.etiqueta = "Miguel Clv - Macia 7";
    c.getVolumen();

    System.out.println(c);
    System.out.println(c.getVolumen());
    }
}
