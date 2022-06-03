import java.util.Arrays;

public class PedidoDeCompra {
    private String[] produtos;
    private double valor;
    private String prazoEntrega;
    public PedidoDeCompra(String[] produtos, double valor, String prazoEntrega) {
        this.produtos = produtos;
        this.valor = valor;
        this.prazoEntrega = prazoEntrega;
    }
    @Override
    public String toString() {
        return "PedidoDeCompra [prazoEntrega=" + prazoEntrega + ", produtos=" + Arrays.toString(produtos) + ", valor="
                + valor + "]";
    }
    public String[] getProdutos() {
        return produtos;
    }
    public void setProdutos(String[] produtos) {
        this.produtos = produtos;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getPrazoEntrega() {
        return prazoEntrega;
    }
    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }
}
