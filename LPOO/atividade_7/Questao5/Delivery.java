package Questao5;

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

    String nome = "";
    String telefone = "";
    int diaNascimento = 0;
    int mesNascimento = 0;

    public void criarPedido(int index) throws Exception {
        int valorItem = 0;
        int valorTotal = 0;
        String descricaoProdutos = "";
        int numPedido = index;

        String nomeCliente = nome;
        String telefoneCliente = telefone;
        int diaNascimentoCliente = diaNascimento;
        int mesNascimentoCliente = mesNascimento;

        if (nomeCliente == "" || telefoneCliente == "" || diaNascimentoCliente == 0 || mesNascimentoCliente == 0) {
            nomeCliente = scanner.scannerString("Informe seu nome", "nao");
            telefoneCliente = scanner.scannerString("Informe seu telefone", "nao");
            diaNascimentoCliente = scanner.scannerInt("Informe seu dia de nascimento", "nao");
            mesNascimentoCliente = scanner.scannerInt("Informe seu mes de nascimento", "nao");
        } else {
            int ordem = scanner.scannerInt("Você é:\n1 - Cliente Anterior\n2 - Outro Cliente", "nao");
            if (ordem == 2) {
                nomeCliente = scanner.scannerString("Informe seu nome", "nao");
                telefoneCliente = scanner.scannerString("Informe seu telefone", "nao");
                diaNascimentoCliente = scanner.scannerInt("Informe seu dia de nascimento", "nao");
                mesNascimentoCliente = scanner.scannerInt("Informe seu mes de nascimento", "nao");
            }
        }

        Cliente cliente = new Cliente(nomeCliente, telefoneCliente, diaNascimentoCliente, mesNascimentoCliente);
        nome = nomeCliente;
        telefone = telefoneCliente;
        diaNascimento = diaNascimentoCliente;
        mesNascimento = mesNascimentoCliente;

        ArrayList<ItemPedido> items = new ArrayList<>();

        while (true) {
            int descricaoProdutosIndice = scanner.scannerInt(
                    "Informe seu pedido\n1 - Finalizar\n2 - Hamburger: R$ 18.00\n3 - Pizza: R$ 24.00", "nao");
            if (descricaoProdutosIndice == 1) {
                break;
            } else if (descricaoProdutosIndice == 2) {
                valorItem = 18;
                descricaoProdutos = "Hamburger";
            } else if (descricaoProdutosIndice == 3) {
                valorItem = 24;
                descricaoProdutos = "Pizza";
            }
            valorTotal += valorItem;

            ItemPedido itemPedido = new ItemPedido(descricaoProdutos, valorItem);
            items.add(itemPedido);
        }

        if (items.size() != 0) {
            Pedido pedido = new Pedido(numPedido, cliente, items, valorTotal, false, false);
            this.pedidos.add(pedido);
        }

    }

    public void imprimirPedido() throws Exception {
        int index = 0;
        for (Pedido pedido : this.pedidos) {
            System.out.println(index + " - Cliente: " + pedido.getCliente().getNome() + "\n  Pedido: ");
            int indexItem = 1;
            for (ItemPedido item : pedido.getItems()) {
                System.out.println("  " + indexItem + "° item - " + item.descricao + ". Valor = R$ " + item.valor);
                indexItem++;
            }
            index++;
            System.out.println("Valor total: R$ " + pedido.getValorTotal() + "\n");
        }
        System.out.println((index) + " - Sair");
        int pedidoEscolhido = scanner.scannerInt("Qual desses pedidos você quer imprimir?", "nao");
        if (pedidoEscolhido == index) {
            System.out.println("Saindo...");
        } else {
            System.out.println((pedidoEscolhido + 1) + "° Pedido:\n" + this.pedidos.get(pedidoEscolhido).toString());
        }
    }

    public void imprimirTodosPedidos() {
        int index = 1;
        for (Pedido pedido : this.pedidos) {
            System.out.println(index + "° Pedido:\n" + pedido.toString() + "\n");
            index++;
        }
    }

    public void cancelarPedido() throws Exception {
        int index = 0;
        int pedidoParaCancelar = 0;
        for (Pedido pedido : this.pedidos) {
            if (!pedido.isPedidoPago() && !pedido.isPedidoCancelado()) {
                System.out.println(index + " - Cliente: " + pedido.getCliente().getNome() + "\n  Pedido: ");
                int indexItem = 1;
                for (ItemPedido item : pedido.getItems()) {
                    System.out.println("  " + indexItem + "° item - " + item.descricao + ". Valor = R$ " + item.valor);
                    indexItem++;
                }
                pedidoParaCancelar++;
                System.out.println("Valor total: R$ " + pedido.getValorTotal() + "\n");
            }
            index++;
        }
        if (pedidoParaCancelar != 0) {
            System.out.println((index) + " - Sair");
            int pedidoEscolhido = scanner.scannerInt("Qual desses pedidos você quer cancelar?", "nao");
            if (pedidoEscolhido != index) {
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
                System.out.println(index + " - Cliente: " + pedido.getCliente().getNome() + "\n  Pedido: ");
                int indexItem = 1;
                for (ItemPedido item : pedido.getItems()) {
                    System.out.println("  " + indexItem + "° item - " + item.descricao + ". Valor = R$ " + item.valor);
                    indexItem++;
                }
                System.out.println("Valor total: R$ " + pedido.getValorTotal() + "\n");
                pedidosParaPagar++;
            }
            index++;
        }
        if (pedidosParaPagar != 0) {
            System.out.println((index) + " - Sair");
            int pedidoEscolhido = scanner.scannerInt("Qual desses pedidos você quer pagar?", "nao");
            if (pedidoEscolhido != index) {
                if (saberClienteAniversariante(pedidoEscolhido)) {
                    double valorAntigo = this.pedidos.get(pedidoEscolhido).getValorTotal();
                    double valorNovo = valorAntigo - (0.2 * valorAntigo);
                    this.pedidos.get(pedidoEscolhido).setValorTotal(valorNovo);
                    System.out.println("Recebeu desconto de 20%! Novo valor: R$"
                            + this.pedidos.get(pedidoEscolhido).getValorTotal());
                }
                this.pedidos.get(pedidoEscolhido).setPedidoPago(true);
                System.out.println("Pedido " + this.pedidos.get(pedidoEscolhido).getNumPedido() + " pago!");
            } else {
                System.out.println("Saindo...");
            }
        } else {
            System.out.println("Nenhum pedido para pagar!");
        }

    }

    public boolean saberClienteAniversariante(int pedidoEscolhido) throws Exception {
        int diaHoje = 25;
        int mesHoje = 05;
        return diaHoje == this.pedidos.get(pedidoEscolhido).getCliente().getDiaNascimneto() && mesHoje == this.pedidos.get(pedidoEscolhido).getCliente().getMesNascimneto();
    }
}
