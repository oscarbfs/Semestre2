
public class MovimentoUniforme {
    private double velociadade;
    private double tempo;
    public MovimentoUniforme(double velociadade, double tempo) {
        this.velociadade = velociadade;
        this.tempo = tempo;
    }
    @Override
    public String toString() {
        return "MovimentoUniforme [tempo=" + tempo + ", velociadade=" + velociadade + "]" + "MovimentoUniforme = " + (velociadade*tempo);
    }
    public double getVelociadade() {
        return velociadade;
    }
    public void setVelociadade(double velociadade) {
        this.velociadade = velociadade;
    }
    public double getTempo() {
        return tempo;
    }
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    public void calcular() {
        System.out.println("Movimento Uniforme = " + (this.tempo * this.velociadade));
    }
}
