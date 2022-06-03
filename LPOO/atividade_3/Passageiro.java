
public class Passageiro {
    String pontoPartida;
    String pontoChegada;
    String nome;
    boolean pessoaComDeficiencia;
    public Passageiro(String pontoPartida, String pontoChegada, String nome, boolean pessoaComDeficiencia) {
        this.pontoPartida = pontoPartida;
        this.pontoChegada = pontoChegada;
        this.nome = nome;
        this.pessoaComDeficiencia = pessoaComDeficiencia;
    }
    @Override
    public String toString() {
        return "Passageiro [nome=" + nome + ", pessoaComDeficiencia=" + pessoaComDeficiencia + ", pontoChegada="
                + pontoChegada + ", pontoPartida=" + pontoPartida + "]";
    }
}
