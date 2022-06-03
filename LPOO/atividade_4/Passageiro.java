
public class Passageiro {
    private String pontoPartida;
    private String pontoChegada;
    private String nome;
    private boolean pessoaComDeficiencia;
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
    public String getPontoPartida() {
        return pontoPartida;
    }
    public void setPontoPartida(String pontoPartida) {
        this.pontoPartida = pontoPartida;
    }
    public String getPontoChegada() {
        return pontoChegada;
    }
    public void setPontoChegada(String pontoChegada) {
        this.pontoChegada = pontoChegada;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isPessoaComDeficiencia() {
        return pessoaComDeficiencia;
    }
    public void setPessoaComDeficiencia(boolean pessoaComDeficiencia) {
        this.pessoaComDeficiencia = pessoaComDeficiencia;
    }
    public void descerAntes() {
        System.out.println(this.nome + " desceu antes e não chegou no destino final.");
    }
}
