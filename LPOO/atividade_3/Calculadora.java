public class Calculadora {
    String tipo;
    int qtdeOperacoes;
    public Calculadora(String tipo, int qtdeOperacoes) {
        this.tipo = tipo;
        this.qtdeOperacoes = qtdeOperacoes;
    }
    @Override
    public String toString() {
        return "Calculadora [qtdeOperacoes=" + qtdeOperacoes + ", tipo=" + tipo + "]";
    }
}
