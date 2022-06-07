import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String profissao;
    private ArrayList<Veiculo> veiculos;
    
    public Cliente(String nome, String profissao, ArrayList<Veiculo> veiculos) {
        this.nome = nome;
        this.profissao = profissao;
        this.veiculos = veiculos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    @Override
    public String toString() {
        return "Nome = " + nome + "\nProfissao = " + profissao  + "\nVeiculos=" + veiculos;
    }
}
