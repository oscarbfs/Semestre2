public class Veiculo {
    String nome;
    String tipo;
    String velocidadeMax;
    int qtdePassageiroMax;
    public Veiculo(String nome, String tipo, String velocidadeMax, int qtdePassageiroMax) {
        this.nome = nome;
        this.tipo = tipo;
        this.velocidadeMax = velocidadeMax;
        this.qtdePassageiroMax = qtdePassageiroMax;
    }
    @Override
    public String toString() {
        return "Veiculo [nome=" + nome + ", qtdePassageiroMax=" + qtdePassageiroMax + ", tipo=" + tipo
                + ", velocidadeMax=" + velocidadeMax + "]";
    }
}
