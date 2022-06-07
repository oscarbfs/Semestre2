import java.util.ArrayList;

public class ClienteHorista extends Cliente{
    private double valorTotal;
    private String tipo;

    public ClienteHorista(String nome, String profissao, ArrayList<Veiculo> veiculos, double valorTotal,
            String tipo) {
        super(nome, profissao, veiculos);
        this.valorTotal = valorTotal;
        this.tipo = tipo;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
