
public class JogadorDeFutebol {
    private String nome;
    private String clube;
    private String posicao;
    private int numeroCamisa;
    public JogadorDeFutebol(String nome, String clube, String posicao, int numeroCamisa) {
        this.nome = nome;
        this.clube = clube;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }
    @Override
    public String toString() {
        return "JogadorDeFutebol [clube=" + clube + ", nome=" + nome + ", numeroCamisa=" + numeroCamisa + ", posicao="
                + posicao + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public int getNumeroCamisa() {
        return numeroCamisa;
    }
    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    public String getClube() {
        return clube;
    }
    public void setClube(String clube) {
        this.clube = clube;
    }
    public void transferir(String clube) {
        setClube(clube);
        System.out.println(this.nome + " foi transferido para o clube " + this.clube);
    }

}
