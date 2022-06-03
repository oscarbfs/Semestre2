
public class Continente {
    private String nome;
    private String regiao;
    private int qtdePaises;
    public Continente(String nome, String regiao, int qtdePaises) {
        this.nome = nome;
        this.regiao = regiao;
        this.qtdePaises = qtdePaises;
    }
    @Override
    public String toString() {
        return "Continente [nome=" + nome + ", qtdePaises=" + qtdePaises + ", regiao=" + regiao + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    public int getQtdePaises() {
        return qtdePaises;
    }
    public void setQtdePaises(int qtdePaises) {
        this.qtdePaises = qtdePaises;
    }
}
