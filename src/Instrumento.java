/**
 * Created by lvpac on 01/06/2017.
 */
public abstract class Instrumento {
    protected enum musicales {DO, RE, MI, FA, SOL, LA, SI}

    protected musicales notas[];
    protected int numNotas;
    static protected int maxNotas = 100;

    public Instrumento(){
        notas = new musicales[maxNotas];
        numNotas = 0;
    }

    public void añadir(musicales n){
        if(numNotas < notas.length){
            notas[numNotas]=n;
            numNotas++;
        }
    }

    abstract void interpretar();
}
