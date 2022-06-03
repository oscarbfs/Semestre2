
public class MovimentoUniforme {
    double velociadade;
    double tempo;
    public MovimentoUniforme(double velociadade, double tempo) {
        this.velociadade = velociadade;
        this.tempo = tempo;
    }
    @Override
    public String toString() {
        return "MovimentoUniforme [tempo=" + tempo + ", velociadade=" + velociadade + "]" + "MovimentoUniforme = " + (velociadade*tempo);
    }
}
