import java.util.ArrayList;

public class Estacionamento {
    private int capacidade;
    private double mensalidade;
    private String status;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<String> profissoes;
    private ArrayList<Ticket> tickets;

    public Estacionamento(int capacidade, double mensalidade, String status, ArrayList<Veiculo> veiculos,
            ArrayList<Cliente> clientes, ArrayList<String> profissoes, ArrayList<Ticket> tickets) {
        this.capacidade = capacidade;
        this.mensalidade = mensalidade;
        this.status = status;
        this.veiculos = veiculos;
        this.clientes = clientes;
        this.profissoes = profissoes;
        this.tickets = tickets;
    }

    int veiculosEstacionados = 0;

    public void consultarCapacidade() {
        System.out.println("A capacidade total do estacionamento é de " + this.capacidade + ". E tem " + (this.capacidade - veiculosEstacionados) + " vagas disponiveis.");
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

            ClienteHorista clienteHorista = new ClienteHorista(nome, profissao, veiculos, valorTotal, tipo);
            this.clientes.add(clienteHorista);
        } else if (tipoDeCliente == 2) {
            ClienteMensalista clienteMensalista = new ClienteMensalista(nome, profissao, veiculos, mensalidade, false);
            this.clientes.add(clienteMensalista);
        }else {
            System.out.println("Nenhuma opção escolhida!");
        }
    }
    
    public void consultarCliente() throws Exception {
        listarClientes();
        int indexCliente = scanner.scannerInt("Qual desses cliente deseja consultar?", "nao");
        System.out.println(this.clientes.get(indexCliente));
    }

    public void listarClientes() {
        int index = 0;
        for (Cliente cliente : this.clientes) {
            System.out.println(index + " - Cliente: " + cliente.toString());
            index++;
        }
    }
    
    public void cadastrarVeiculos() throws Exception {
        listarClientes();
        int clienteVeiculo = scanner.scannerInt("O veiculo pertence a qual desses clientes?", "nao");
        System.out.println("Certo! Vamos cadastrar o veiculo.");
        
        Veiculo novoVeiculo = new Veiculo("", "", "");
        int tipoVeiculo = scanner.scannerInt("O veiculo é:\n1 - Um carro\n2 - Uma moto", "nao");
        if (tipoVeiculo == 1) {
            int tipoCarro = scanner.scannerInt("O carro é:\n1 - Um SUV\n2 - Outro", "nao");
            String modelo = scanner.scannerString("Qual é o modelo do carro?", "nao");
            String marca = scanner.scannerString("Qual é a marca do carro?", "nao");
            String placa = scanner.scannerString("Qual é a placa do carro?", "nao");
            if(tipoCarro == 1) {
                novoVeiculo = new CarroSuv(modelo, marca, placa);
            } else {
                novoVeiculo = new CarroNormal(modelo, marca, placa);
            }
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
        listarVeiculos();
        int indexCliente = scanner.scannerInt("Qual desses veiculo deseja consultar?", "nao");
        System.out.println(this.veiculos.get(indexCliente).toString());
    }
    
    public void listarVeiculos() {
        int index = 0;
        for (Veiculo veiculo : this.veiculos) {
            System.out.println(index + " - Veiculo: " + veiculo.toString());
            index++;
        }
    }
    
    public void gerarTicket() throws Exception {
        listarClientes();
        int indexCliente = scanner.scannerInt("Qual desses clientes o veiculo que ira estacionar pertence?", "nao");
        
        Cliente clienteEscolhido = this.clientes.get(indexCliente);
        ArrayList<Veiculo> veiculosClienteEscolhido = clienteEscolhido.getVeiculos();
        int index = 0;
        
        for (Veiculo veiculo : veiculosClienteEscolhido) {
            System.out.println(index + "- Veiculo: " + veiculo.getModelo() + ". Placa: " + veiculo.getPlaca());
        }
        
        int indexVeiculo = scanner.scannerInt("O ticket gerado será para qual desses veiculos?", "nao");
        Veiculo veiculoEscolhido = veiculosClienteEscolhido.get(indexVeiculo);
        Ticket ticket = new Ticket(clienteEscolhido, veiculoEscolhido);
        this.tickets.add(ticket);
        System.out.println("Ticket gerado para o veiculo '" + veiculoEscolhido.getModelo() + "' com placa: " + veiculoEscolhido.getPlaca());
        if(veiculoEscolhido instanceof Moto) {
            veiculosEstacionados = veiculosEstacionados + 1/3;
        } else if (veiculoEscolhido instanceof CarroSuv) {
            veiculosEstacionados = veiculosEstacionados + 2;
        } else {
            veiculosEstacionados++;
        }
    }

    public void pagamentoMensalista() throws Exception {
        int index = 0;
        ArrayList<ClienteMensalista> clienteMensalistas = new ArrayList<>();
        for (Cliente cliente : this.clientes) {
            if(cliente instanceof ClienteMensalista) {
                System.out.println(index + " - Cliente: " + cliente.getNome());
                ClienteMensalista mensalista = (ClienteMensalista) cliente;
                clienteMensalistas.add(mensalista);
                index++;
            }
        }
        int indexCliente = scanner.scannerInt("Qual desses clientes ira pagar a mensalidade?", "nao");
        ClienteMensalista clienteEscolhido = clienteMensalistas.get(indexCliente);
        System.out.println("Mensalidade do cliente '" + clienteEscolhido.getNome() + "' pago!");
    }
    
    public void pagamentoHorista() throws Exception {
        int index = 0;
        ArrayList<ClienteHorista> clienteHoristas = new ArrayList<>();
        for (Cliente cliente : this.clientes) {
            if(cliente instanceof ClienteHorista) {
                System.out.println(index + " - Cliente: " + cliente.getNome());
                ClienteHorista horista = (ClienteHorista) cliente;
                clienteHoristas.add(horista);
                index++;
            }
        }
        int indexCliente = scanner.scannerInt("Qual desses clientes ira pagar a o ticket?", "nao");
        
        ClienteHorista clienteEscolhido = clienteHoristas.get(indexCliente);
        
        for (Ticket ticket : tickets) {
            if (ticket.getCliente() == clienteEscolhido) {
                double tempoCliente = scanner.scannerDouble("Quanto tempo o carro desse cliente ficou no estacionamento? (Em minutos)", "nao");
                double valorTotal = tempoCliente * 0.2;
                System.out.println("Ticket do cliente '" + clienteEscolhido.getNome() + "' pago! Valor total: R$ " + valorTotal);
                if(ticket.getVeiculo() instanceof Moto) {
                    veiculosEstacionados = veiculosEstacionados + 1/3;
                } else if (ticket.getVeiculo() instanceof CarroSuv) {
                    veiculosEstacionados = veiculosEstacionados + 2;
                } else {
                    veiculosEstacionados++;
                }
            }
        }
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

}