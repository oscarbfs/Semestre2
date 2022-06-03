import java.util.Arrays;

public class PedidoDeCompra {
    String[] produtos;
    double valor;
    String prazoEntrega;
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
}
