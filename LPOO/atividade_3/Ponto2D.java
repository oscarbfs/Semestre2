
public class Ponto2D {
    double pontoX;
    double pontoY;
    public Ponto2D(double pontoX, double pontoY) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }
    @Override
    public String toString() {
        return "Ponto2D = (" + pontoX + ", " + pontoY + ")";
    }
}
