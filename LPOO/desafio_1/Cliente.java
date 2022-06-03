import java.util.ArrayList;

public class Cliente {
    private String nome;
    private Ticket ticket;
    private String profissao;
    private ArrayList<Veiculo> veiculos;
    
    public Cliente(String nome, Ticket ticket, String profissao, ArrayList<Veiculo> veiculos) {
        this.nome = nome;
        this.ticket = ticket;
        this.profissao = profissao;
        this.veiculos = veiculos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
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
        return "Nome = " + nome + "\nProfissao = " + profissao + "\nTicket = " + ticket.toString() + "\nVeiculos=" + veiculos;
    }
}
