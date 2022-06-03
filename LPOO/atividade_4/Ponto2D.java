
public class Ponto2D {
    private double pontoX;
    private double pontoY;
    public Ponto2D(double pontoX, double pontoY) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }
    @Override
    public String toString() {
        return "Ponto2D = (" + pontoX + ", " + pontoY + ")";
    }
    public double getPontoX() {
        return pontoX;
    }
    public void setPontoX(double pontoX) {
        this.pontoX = pontoX;
    }
    public double getPontoY() {
        return pontoY;
    }
    public void setPontoY(double pontoY) {
        this.pontoY = pontoY;
    }
    public void saberDistancia(Ponto2D outroPonto) {
        double distanciaX = this.pontoX - outroPonto.pontoX;
        if(distanciaX < 0) {
            distanciaX = distanciaX * -1;
        }
        double distanciaY = this.pontoY - outroPonto.pontoY;
        if(distanciaY < 0) {
            distanciaY = distanciaY * -1;
        }
        System.out.println("Distancia entre os pontos x: " + distanciaX + ". Distancia entre os pontos y: " + distanciaY);
    }
}
