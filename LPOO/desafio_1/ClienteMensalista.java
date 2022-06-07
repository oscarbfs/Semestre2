import java.util.ArrayList;

public class ClienteMensalista extends Cliente{
    private double mensalidade;
    private boolean estaPago;

    public ClienteMensalista(String nome, String profissao, ArrayList<Veiculo> veiculos,
            double mensalidade, boolean estaPago) {
        super(nome, profissao, veiculos);
        this.mensalidade = mensalidade;
        this.estaPago = estaPago;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public boolean isEstaPago() {
        return estaPago;
    }

    public void setEstaPago(boolean estaPago) {
        this.estaPago = estaPago;
    }
}
