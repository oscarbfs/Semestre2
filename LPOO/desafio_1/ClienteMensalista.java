import java.util.ArrayList;

public class ClienteMensalista extends Cliente{
    private double mensalidade;

    public ClienteMensalista(String nome, Ticket ticket, String profissao, ArrayList<Veiculo> veiculos,
            double mensalidade) {
        super(nome, ticket, profissao, veiculos);
        this.mensalidade = mensalidade;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
