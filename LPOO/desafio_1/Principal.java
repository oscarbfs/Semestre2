import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // ArrayList<Pedido> pedidos = new ArrayList<>();

        int capacidade = 100;
        double mensalidade = 50;
        String status = "vazio";
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<String> profissoes = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();

        Estacionamento estacionamento = new Estacionamento(capacidade, mensalidade,status,veiculos,cliente,profissoes, tickets);
        // int index = 0;
        while(true) {
            try {
                int ordem = scanner.scannerInt("\nO que deseja fazer:"
                        + "\n0 - Sair"
                        + "\n1 - Consultar Capacidade"
                        + "\n2 - Cadastrar Profissão"
                        + "\n3 - Listar Profissões"
                        + "\n4 - Cadastrar Cliente"
                        + "\n5 - Consultar Cliente"
                        + "\n6 - Listar Clientes"
                        + "\n7 - Cadastrar Veiculo"
                        + "\n8 - Consultar Veiculo"
                        + "\n9 - Listar Veiculo"
                        + "\n10 - Gerar Ticket"
                        + "\n11 - Pagamento mensalista"
                        + "\n12 - Pagamento horista",
                         "nao");
                if(ordem == 0){
                    System.out.println("Saindo...");
                    break;
                } else if(ordem == 1) {
                    estacionamento.consultarCapacidade();
                } else if(ordem == 2) {
                    estacionamento.cadastrarProfissao();
                } else if(ordem == 3) {
                    estacionamento.listarProfissoes();
                } else if(ordem == 4) {
                    estacionamento.cadastrarCliente();
                } else if(ordem == 5) {
                    estacionamento.consultarCliente();
                } else if(ordem == 6) {
                    estacionamento.listarClientes();
                } else if(ordem == 7) {
                    estacionamento.cadastrarVeiculos();
                } else if(ordem == 8) {
                    estacionamento.consultarVeiculo();
                } else if(ordem == 9) {
                    estacionamento.listarVeiculos();
                } else if(ordem == 10) {
                    estacionamento.gerarTicket();
                } else if(ordem == 11) {
                    estacionamento.pagamentoMensalista();
                } else if(ordem == 12) {
                    estacionamento.pagamentoHorista();
                } 
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
