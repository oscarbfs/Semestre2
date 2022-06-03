public class BombaDeCombustivel {
    private double valorLitros;
    private double preco;
    private double litros;
    public BombaDeCombustivel(double valorLitros, double preco, double litros) {
        this.valorLitros = valorLitros;
        this.preco = preco;
        this.litros = litros;
    }
    @Override
    public String toString() {
        return "BombaDeCombustivel [litros=" + litros + ", preco=" + preco + ", valorLitros=" + valorLitros + "]";
    }
    public double getValorLitros() {
        return valorLitros;
    }
    public void setValorLitros(double valorLitros) {
        this.valorLitros = valorLitros;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getLitros() {
        return litros;
    }
    public void setLitros(double litros) {
        this.litros = litros;
    }
    public void encher(double litros) {
        System.out.println("Tanque do carro cheio. Preço = " + this.valorLitros*litros);
    }

}
