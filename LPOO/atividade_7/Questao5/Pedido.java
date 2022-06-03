package Questao5;

import java.util.ArrayList;

public class Pedido {
    private int numPedido;
    private Cliente cliente;
    private ArrayList<ItemPedido> items;
    private double valorTotal;
    private boolean pedidoPago;
    private boolean pedidoCancelado;

    

    public Pedido(int numPedido, Cliente cliente, ArrayList<ItemPedido> items, double valorTotal, boolean pedidoPago,
            boolean pedidoCancelado) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.items = items;
        this.valorTotal = valorTotal;
        this.pedidoPago = pedidoPago;
        this.pedidoCancelado = pedidoCancelado;
    }



    // public void criarPedido(int index) throws Exception {
    //     this.numPedido = index;
    //     this.cliente.nome = scanner.scannerString("Informe seu nome", "nao");
    //     this.cliente.telefone = scanner.scannerString("Informe seu telefone", "nao");
    //     // int descricaoProdutos = scanner.scannerInt("Informe seu pedido\n1 - Hamburger: R$ 18.00\n2 - Pizza: R$ 24.00", "nao");
    //     // if (descricaoProdutos == 1) {
    //     //     this.valorTotal = 18;
    //     //     this.descricaoProdutos = "Hamburger";
    //     // } else {
    //     //     this.valorTotal = 24;
    //     //     this.descricaoProdutos = "Pizza";
    //     // }
    // }



    public int getNumPedido() {
        return numPedido;
    }



    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }



    public Cliente getCliente() {
        return cliente;
    }



    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public ArrayList<ItemPedido> getItems() {
        return items;
    }



    public void setItems(ArrayList<ItemPedido> items) {
        this.items = items;
    }



    public double getValorTotal() {
        return valorTotal;
    }



    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }



    public boolean isPedidoPago() {
        return pedidoPago;
    }



    public void setPedidoPago(boolean pedidoPago) {
        this.pedidoPago = pedidoPago;
    }



    public boolean isPedidoCancelado() {
        return pedidoCancelado;
    }



    public void setPedidoCancelado(boolean pedidoCancelado) {
        this.pedidoCancelado = pedidoCancelado;
    }



    @Override
    public String toString() {
        String pedido = " numPedido = " + numPedido + "\n pedidoCancelado = "
                + pedidoCancelado + "\n pedidoPago = " + pedidoPago + "\n valorTotal = " + valorTotal + "\n cliente: \n" + cliente + "\n items:";
        int indexItem = 1;
        for (ItemPedido item : items) {
            pedido += "\n  " + indexItem + "° item - " + item.descricao + ". Valor = R$ " + item.valor;
            indexItem++;
        }
        return pedido;
    }
}