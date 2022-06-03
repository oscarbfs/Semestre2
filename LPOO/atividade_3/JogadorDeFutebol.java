
public class JogadorDeFutebol {
    String nome;
    String posicao;
    int numeroCamisa;
    public JogadorDeFutebol(String nome, String posicao, int numeroCamisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }
    @Override
    public String toString() {
        return "JogadorDeFutebol [nome=" + nome + ", numeroCamisa=" + numeroCamisa + ", posicao=" + posicao + "]";
    }
}
