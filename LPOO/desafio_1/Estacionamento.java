import java.util.ArrayList;

public class Estacionamento {
    private int capacidade;
    private double mensalidade;
    private String status;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<String> profissoes;

    public Estacionamento(int capacidade, double mensalidade, String status, ArrayList<Veiculo> veiculos,
            ArrayList<Cliente> clientes, ArrayList<String> profissoes) {
        this.capacidade = capacidade;
        this.mensalidade = mensalidade;
        this.status = status;
        this.veiculos = veiculos;
        this.clientes = clientes;
        this.profissoes = profissoes;
    }

    public void consultarCapacidade() {
        System.out.println("A capacidade total do estacionamento é de " + this.capacidade + ". E tem " + (this.capacidade - veiculos.size()) + " vagas disponiveis.");
    }

    public void cadastrarProfissao() {
        String profissao = scanner.scannerString("Informe a profissão:", "nao");
        this.profissoes.add(profissao);
    }
    
    public void listarProfissoes() {
        for (String profissao : this.profissoes) {
            System.out.println("- " + profissao);
        }
    }
    
    public void cadastrarCliente() throws Exception {
        String tipo = "";
        double valorTotal = 0;
        Ticket ticket = new Ticket();
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        int tipoDeCliente = scanner.scannerInt("Qual é o tipo desse cliente:" 
        + "\n1 - Clinte horista" 
        + "\n2 - Clinte mensalista", 
        "nao");

        String nome = scanner.scannerString("Informe o nome do cliente:", "nao");
        String profissao = scanner.scannerString("Informe a profissao do cliente::", "nao");

        if(tipoDeCliente == 1) {
            int tipoHorista = scanner.scannerInt("Qual é o tipo desse cliente:" 
            + "\n1 - Horista normal" 
            + "\n2 - Horista VIP", 
            "nao");
            if(tipoHorista == 1) {
                tipo = "Normal";
            } else {
                tipo = "VIP";
            }

            ClienteHorista clienteHorista = new ClienteHorista(nome, ticket, profissao, veiculos, valorTotal, tipo);
            this.clientes.add(clienteHorista);
        } else if (tipoDeCliente == 2) {
            ClienteMensalista clienteMensalista = new ClienteMensalista(nome, ticket, profissao, veiculos, mensalidade);
            this.clientes.add(clienteMensalista);
        }else {
            System.out.println("Nenhuma opção escolhida!");
        }
    }
    
    public void consultarCliente() throws Exception {
        int index = 0;
        for (Cliente cliente : this.clientes) {
            System.out.println(index + "- Cliente: " + cliente.getNome());
        }
        int indexCliente = scanner.scannerInt("Qual desses cliente deseja consultar?", "nao");
        System.out.println(this.clientes.get(indexCliente));
    }

    public void listarClientes() {
        int index = 0;
        for (Cliente cliente : this.clientes) {
            System.out.println(index + "- Cliente: " + cliente.toString());
        }
    }
    
    public void cadastrarVeiculos() throws Exception {
        listarClientes();
        int clienteVeiculo = scanner.scannerInt("O veiculo pertence a qual desses clientes?", "nao");
        System.out.println("Certo! Vamos cadastrar o veiculo.");
        
        String tipo = "";
        Veiculo novoVeiculo = new Veiculo("", "", "");
        int tipoVeiculo = scanner.scannerInt("O veiculo é:\n1 - Um carro\n2 - Uma moto", "nao");
        if (tipoVeiculo == 1) {
            int tipoCarro = scanner.scannerInt("O carro é:\n1 - Um SUV\n2 - Outro", "nao");
            if(tipoCarro == 1) {
                tipo = "SUV";
            } else {
                tipo = "Normal";
            }
            String modelo = scanner.scannerString("Qual é o modelo do carro?", "nao");
            String marca = scanner.scannerString("Qual é a marca do carro?", "nao");
            String placa = scanner.scannerString("Qual é a placa do carro?", "nao");
            novoVeiculo = new Carro(modelo, marca, placa, tipo);
        } else if (tipoVeiculo == 2) {
            String modelo = scanner.scannerString("Qual é o modelo do carro?", "nao");
            String marca = scanner.scannerString("Qual é a marca do carro?", "nao");
            String placa = scanner.scannerString("Qual é a placa do carro?", "nao");
            novoVeiculo = new Moto(modelo, marca, placa);
        } else {
            System.out.println("Nenhuma opção selecionada");
        }
        Veiculo veiculo = novoVeiculo;
        this.clientes.get(clienteVeiculo).getVeiculos().add(veiculo);
        this.veiculos.add(veiculo);
    }

    public void consultarVeiculo() throws Exception {
        int index = 0;
        for (Veiculo veiculo : this.veiculos) {
            System.out.println(index + "- Veiculo: " + veiculo.getModelo() + ". Placa: " + veiculo.getPlaca());
        }
        int indexCliente = scanner.scannerInt("Qual desses veiculo deseja consultar?", "nao");
        System.out.println(this.veiculos.get(indexCliente));
    }

    public void listarVeiculos() {
        int index = 0;
        for (Veiculo veiculo : this.veiculos) {
            System.out.println(index + "- Veiculo: " + veiculo.toString());
        }
    }

    public void gerarTicket() {
    }

    public void pagamentoMensalista() {
    }

    public void pagamentoHorista() {
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public ArrayList<Cliente> getCliente() {
        return clientes;
    }

    public void setCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<String> getProfissoes() {
        return profissoes;
    }

    public void setProfissoes(ArrayList<String> profissoes) {
        this.profissoes = profissoes;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

}