package LPOO.atividade_6;

import java.util.ArrayList;

public class Delivery {
    private ArrayList<Pedido> pedidos;

    public Delivery(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void criarPedido(int index) throws Exception {
        int valorTotal = 0;
        String descricaoProdutos = "";
        int numPedido = index;
        String nomeCliente = scanner.scannerString("Informe seu nome", "nao");
        String telefoneCliente = scanner.scannerString("Informe seu telefone", "nao");
        int descricaoProdutosIndice = scanner.scannerInt("Informe seu pedido\n1 - Hamburger: R$ 18.00\n2 - Pizza: R$ 24.00", "nao");
        if (descricaoProdutosIndice == 1) {
            valorTotal = 18;
            descricaoProdutos = "Hamburger";
        } else {
            valorTotal = 24;
            descricaoProdutos = "Pizza";
        }

        Pedido pedido = new Pedido(numPedido, valorTotal, false, false, 0, 0, nomeCliente, telefoneCliente, descricaoProdutos);
        this.pedidos.add(pedido);
    }

    public void imprimirPedido() throws Exception {
        int index = 0;
        for (Pedido pedido : this.pedidos) {
            System.out.println(index + " - Cliente: " + pedido.getNomeCliente() + ", Pedido: " + pedido.getDescricaoProdutos());
            index++;
        }
        System.out.println((index) + " - Sair");
        int pedidoEscolhido = scanner.scannerInt("Qual desses pedidos você quer imprimir?", "nao");
        if(pedidoEscolhido == index) {
            System.out.println("Saindo...");
        } else {
            System.out.println(this.pedidos.get(pedidoEscolhido).toString());
        }
    }

    public void imprimirTodosPedidos() {
        int index = 0;
        for (Pedido pedido : this.pedidos) {
            System.out.println(index + " - " + pedido.toString());
            index++;
        }
    }

    public void cancelarPedido() throws Exception {
        int index = 0;
        int pedidoParaCancelar = 0;
        for (Pedido pedido : this.pedidos) {
            if(!pedido.isPedidoPago() && !pedido.isPedidoCancelado()) {
                System.out.println(index + " - Cliente: " + pedido.getNomeCliente() + ", Pedido: " + pedido.getDescricaoProdutos());
                pedidoParaCancelar++;
            }
            index++;
        }
        if(pedidoParaCancelar != 0) {
            System.out.println((index) + " - Sair");
            int pedidoEscolhido = scanner.scannerInt("Qual desses pedidos você quer cancelar?", "nao");
            if(pedidoEscolhido != index) {
                this.pedidos.get(pedidoEscolhido).setPedidoCancelado(true);
                System.out.println("Pedido " + this.pedidos.get(pedidoEscolhido).getNumPedido() + " cancelado!");
            } else {
                System.out.println("Saindo...");
            }
        } else {
            System.out.println("Nenhum pedido para cancelar!");
        }
    }
    
    public void pagarPedido() throws Exception {
        int index = 0;
        int pedidosParaPagar = 0;
        for (Pedido pedido : this.pedidos) {
            if (!pedido.isPedidoCancelado() && !pedido.isPedidoPago()) {
                System.out.println(index + " - Cliente: " + pedido.getNomeCliente() + ", Pedido: " + pedido.getDescricaoProdutos());
                pedidosParaPagar++;
            }
            index++;
        }
        if(pedidosParaPagar != 0) {
            System.out.println((index) + " - Sair");
            int pedidoEscolhido = scanner.scannerInt("Qual desses pedidos você quer pagar?", "nao");
            if(pedidoEscolhido != index) {
                if (saberClienteAniversariante()) {
                    double valorAntigo = this.pedidos.get(pedidoEscolhido).getValorTotal();
                    double valorNovo = valorAntigo - (0.2 * valorAntigo);
                    this.pedidos.get(pedidoEscolhido).setValorTotal(valorNovo);
                    System.out.println("Recebeu desconto de 20%! Novo valor: R$" + this.pedidos.get(pedidoEscolhido).getValorTotal());
                }
                this.pedidos.get(pedidoEscolhido).setPedidoPago(true);
                System.out.println("Pedido " + this.pedidos.get(pedidoEscolhido).getDescricaoProdutos() + " pago!");
            } else {
                System.out.println("Saindo...");
            }
        } else {
            System.out.println("Nenhum pedido para pagar!");
        }
                
    }
    
    public boolean saberClienteAniversariante() throws Exception {
        int diaHoje = 25;
        int mesHoje = 05;
        int diaNascimento = scanner.scannerInt("Qual o dia do seu nascimento?", "nao");
        int mesNascimento = scanner.scannerInt("Qual o mes do seu nascimento?", "nao");
        return diaHoje == diaNascimento && mesHoje == mesNascimento;
    }
}
