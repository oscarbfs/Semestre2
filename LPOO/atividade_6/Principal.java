import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Pedido pedido = new Pedido(0, 0, false, false, 0, 0, "", "", "");

        ArrayList<Pedido> pedidos = new ArrayList<>();

        Delivery delivery = new Delivery(pedidos);

        int index = 0;
        while(true) {
            try {
                int ordem = scanner.scannerInt("\nO que deseja fazer:\n0 - Fazer pedido\n1 - Imprimir o pedido\n2 - Imprimir todos os pedidos\n3 - Cancelar o pedido\n4 - Pagar o pedido\n5 - Sair", "nao");
                if(ordem == 0){
                    delivery.criarPedido(index);
                } else if(ordem == 1) {
                    delivery.imprimirPedido();
                } else if(ordem == 2) {
                    delivery.imprimirTodosPedidos();
                } else if(ordem == 3) {
                    delivery.cancelarPedido();
                } else if(ordem == 4) {
                    delivery.pagarPedido();
                } else if(ordem == 5) {
                    System.out.println("Saindo...");
                    break;
                } 
                index++;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
