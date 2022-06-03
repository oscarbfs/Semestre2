public class BombaDeCombustivel {
    double valorLitros;
    double preco;
    double litros;
    public BombaDeCombustivel(double valorLitros, double preco, double litros) {
        this.valorLitros = valorLitros;
        this.preco = preco;
        this.litros = litros;
    }
    @Override
    public String toString() {
        return "BombaDeCombustivel [litros=" + litros + ", preco=" + preco + ", valorLitros=" + valorLitros + "]";
    }
}
