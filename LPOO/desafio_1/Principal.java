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

        Estacionamento estacionamento = new Estacionamento(capacidade, mensalidade,status,veiculos,cliente,profissoes);
        // int index = 0;
        while(true) {
            try {
                int ordem = scanner.scannerInt("\nO que deseja fazer:"
                        + "\n0 - Consultar Capacidade"
                        + "\n1 - Cadastrar Profissão"
                        + "\n2 - Listar Profissões"
                        + "\n3 - Cadastrar Cliente"
                        + "\n4 - Consultar Cliente"
                        + "\n5 - Listar Clientes"
                        + "\n6 - Cadastrar Cliente"
                        + "\n7 - Consultar Veiculo"
                        + "\n8 - Listar Veiculo"
                        + "\n9 - Gerar Ticket"
                        + "\n10 - Pagamento mensalista"
                        + "\n11 - Pagamento horista"
                        + "\n12 - Sair",
                         "nao");
                if(ordem == 0){
                    estacionamento.consultarCapacidade();
                } else if(ordem == 1) {
                    estacionamento.cadastrarProfissao();
                } else if(ordem == 2) {
                    estacionamento.listarProfissoes();
                } else if(ordem == 3) {
                    estacionamento.cadastrarCliente();
                } else if(ordem == 4) {
                    estacionamento.consultarCliente();
                } else if(ordem == 5) {
                    estacionamento.listarClientes();
                } else if(ordem == 6) {
                    estacionamento.cadastrarVeiculos();
                } else if(ordem == 7) {
                    estacionamento.consultarVeiculo();
                } else if(ordem == 8) {
                    estacionamento.listarVeiculos();
                } else if(ordem == 9) {
                    estacionamento.gerarTicket();
                } else if(ordem == 10) {
                    estacionamento.pagamentoMensalista();
                } else if(ordem == 11) {
                    estacionamento.pagamentoHorista();
                } else if(ordem == 12) {
                    System.out.println("Saindo...");
                    break;
                } 
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
