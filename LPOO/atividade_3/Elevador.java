
public class Elevador {
    String material;
    double velocidade;
    double qtdeAndares;
    public Elevador(String material, double velocidade, double qtdeAndares) {
        this.material = material;
        this.velocidade = velocidade;
        this.qtdeAndares = qtdeAndares;
    }
    @Override
    public String toString() {
        return "Elevador [material=" + material + ", qtdeAndares=" + qtdeAndares + ", velocidade=" + velocidade + "]";
    }
}
