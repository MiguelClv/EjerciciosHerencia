/**
 * Created by lvpac on 01/06/2017.
 */
public class Main_Instrumento {
    public static void main(String[] args) {
        Campana c = new Campana();
        c.añadir(Instrumento.musicales.DO);
        c.añadir(Instrumento.musicales.RE);
        c.añadir(Instrumento.musicales.MI);
        c.añadir(Instrumento.musicales.FA);
        c.añadir(Instrumento.musicales.SOL);
        c.añadir(Instrumento.musicales.LA);
        c.añadir(Instrumento.musicales.SI);
        c.interpretar();
        System.out.println(c);

        Piano p = new Piano();
        p.añadir(Instrumento.musicales.DO);
        p.añadir(Instrumento.musicales.RE);
        p.añadir(Instrumento.musicales.MI);
        p.añadir(Instrumento.musicales.FA);
        p.añadir(Instrumento.musicales.SOL);
        p.añadir(Instrumento.musicales.LA);
        p.añadir(Instrumento.musicales.SI);
        p.interpretar();
        System.out.println(p);
    }
}
