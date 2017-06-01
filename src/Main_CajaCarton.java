/**
 * Created by lvpac on 01/06/2017.
 */
public class Main_CajaCarton {
    public static void main(String[] args) {
        CajaCarton c = new CajaCarton(30,25,35);
        c.etiqueta = 65;

        System.out.println("Cliente: " + c.etiqueta + " Volumen: " + c.getVolumen());
        System.out.println(c);
    }
}
