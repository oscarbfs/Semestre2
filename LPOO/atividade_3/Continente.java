
public class Continente {
    String nome;
    String regiao;
    int qtdePaises;
    public Continente(String nome, String regiao, int qtdePaises) {
        this.nome = nome;
        this.regiao = regiao;
        this.qtdePaises = qtdePaises;
    }
    @Override
    public String toString() {
        return "Continente [nome=" + nome + ", qtdePaises=" + qtdePaises + ", regiao=" + regiao + "]";
    }
}
