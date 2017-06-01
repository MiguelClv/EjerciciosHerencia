/**
 * Created by lvpac on 01/06/2017.
 */
public class Campana extends Instrumento {
    public Campana(){
        super();
    }

    @Override
    public void interpretar() {
        for(int i =0; i <= numNotas;i++){
            switch (notas[i]){
                case DO:
                    System.out.println("DOLOOON");
                    break;
                case RE:
                    System.out.println("REEEEEN");
                    break;
                case MI:
                    System.out.println("MIIIIIIN");
                    break;
                case FA:
                    System.out.println("FAAAAAAA");
                    break;
                case SOL:
                    System.out.println("SOOOOOOOL");
                    break;
                case LA:
                    System.out.println("LAAAAAAAA");
                    break;
                case SI:
                    System.out.println("SIIIIIIIN");
                    break;
            }
        }
        System.out.println("");
    }
}
