package LPOO.desafio_1;

import java.util.ArrayList;

public class Estacionamento {
    private int capacidade;
    private double mensalidade;
    private String status;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<String> profissoes;
    private ArrayList<Ticket> tickets;
    private ArrayList<Veiculo> veiculosEstacionados = new ArrayList<>();

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


    public int qtdeMotoEstacionados() {
        int qtdeMotos = 0;
        for (Veiculo veiculo : this.veiculosEstacionados) {
            if (veiculo instanceof Moto) {
                qtdeMotos++;
            }
        }
        return qtdeMotos;
    }

    public int qtdeSUVEstacionados() {
        int qtdeSUV = 0;
        for (Veiculo veiculo : this.veiculosEstacionados) {
            if (veiculo instanceof CarroSuv) {
                qtdeSUV++;
            }
        }
        return qtdeSUV;
    }

    public int qtdeCarroNormalEstacionados() {
        int qtdeCarroNormal = 0;
        for (Veiculo veiculo : this.veiculosEstacionados) {
            if (veiculo instanceof CarroNormal) {
                qtdeCarroNormal++;
            }
        }
        return qtdeCarroNormal;
    }

    public int vagasOcupadas() {
        int qtdeMotos = qtdeMotoEstacionados();
        int qtdeSuv = qtdeSUVEstacionados();
        int qtdeCarroNormal = qtdeCarroNormalEstacionados();

        if (qtdeMotos % 3 == 1) {
            qtdeMotos += 2;
        } else if (qtdeMotos % 3 == 2) {
            qtdeMotos++;
        }

        return ((qtdeMotos / 3) + (qtdeSuv * 2) + qtdeCarroNormal);
    }

    public String mostarVagasDisponiveis() {
        int vagasMotoCompartilhada = 0;
        if (qtdeMotoEstacionados() % 3 == 1) {
            vagasMotoCompartilhada = 2;
        } else if (qtdeMotoEstacionados() % 3 == 2) {
            vagasMotoCompartilhada = 1;
        }
        int vagasDisponiveis = this.capacidade - vagasOcupadas();
        int vagasMotos = vagasDisponiveis * 3 + vagasMotoCompartilhada;

        int vagasSUVs = vagasDisponiveis / 2;
        int vagasCarrosNormais = vagasDisponiveis;
        return "Há " + vagasMotos + " vagas para motos.\nHá " + vagasSUVs + " vagas para SUVs.\nHá "
                + vagasCarrosNormais + " vagas para carros normais.";
    }

    public void consultarCapacidade() {
        System.out.println(
                "A capacidade total do estacionamento é de " + this.capacidade + ".\n" + mostarVagasDisponiveis());
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

        if (tipoDeCliente == 1) {
            int tipoHorista = scanner.scannerInt("Qual é o tipo desse cliente:"
                    + "\n1 - Horista normal"
                    + "\n2 - Horista VIP",
                    "nao");
            if (tipoHorista == 1) {
                tipo = "Normal";
            } else {
                tipo = "VIP";
            }

            ClienteHorista clienteHorista = new ClienteHorista(nome, profissao, veiculos, valorTotal, tipo);
            this.clientes.add(clienteHorista);
        } else if (tipoDeCliente == 2) {
            ClienteMensalista clienteMensalista = new ClienteMensalista(nome, profissao, veiculos, mensalidade, false);
            this.clientes.add(clienteMensalista);
        } else {
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
            System.out.println(
                    index + " - Cliente:\nNome: " + cliente.getNome() + "\nProfissão: " + cliente.getProfissao());
            index++;
        }
        System.out.println();
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
            if (tipoCarro == 1) {
                novoVeiculo = new CarroSuv(modelo, marca, placa);
            } else {
                novoVeiculo = new CarroNormal(modelo, marca, placa);
            }
        } else if (tipoVeiculo == 2) {
            String modelo = scanner.scannerString("Qual é o modelo do moto?", "nao");
            String marca = scanner.scannerString("Qual é a marca do moto?", "nao");
            String placa = scanner.scannerString("Qual é a placa do moto?", "nao");
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
        int indexVeiculo = scanner.scannerInt("Qual desses veiculo deseja consultar?", "nao");
        System.out.println(this.veiculos.get(indexVeiculo).toString());
    }

    public void listarVeiculos() {
        int index = 0;

        for (Cliente cliente : this.clientes) {
            for (Veiculo veiculo : cliente.getVeiculos()) {
                System.out.println(
                        index + " - Veiculo:\nDono = " + cliente.getNome() + "\nPlaca = " + veiculo.getPlaca());
                index++;
            }
        }
        System.out.println();
    }

    public void gerarTicket() throws Exception {
        if (vagasOcupadas() == this.capacidade) {
            System.out.println("Não há mais vagas para estacionar!");
        } else {
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
            System.out.println("Ticket gerado para o veiculo '" + veiculoEscolhido.getModelo() + "' com placa: "
                    + veiculoEscolhido.getPlaca());
            veiculosEstacionados.add(veiculoEscolhido);
        }
    }

    public void pagamentoMensalista() throws Exception {
        int index = 0;
        ArrayList<ClienteMensalista> clienteMensalistas = new ArrayList<>();
        for (Cliente cliente : this.clientes) {
            if (cliente instanceof ClienteMensalista) {
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

    public boolean temCarroEstacionado(Cliente cliente) {
        int qtdeCarrosEstacionados =0;
        for (Ticket ticket : tickets) {
            for (Veiculo veiculo : cliente.getVeiculos()) {
                if (veiculo == ticket.getVeiculo()) {
                    qtdeCarrosEstacionados++;
                }
            }
        }
        if (qtdeCarrosEstacionados==0) {
            return true;
        } else {
            return false;
        }
    }

    public void pagamentoHorista() throws Exception {
        int index = 0;
        ArrayList<ClienteHorista> clienteHoristas = new ArrayList<>();
        for (Cliente cliente : this.clientes) {
            if (cliente instanceof ClienteHorista && temCarroEstacionado(cliente)) {
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
                double tempoCliente = scanner.scannerDouble(
                        "Quanto tempo o carro desse cliente ficou no estacionamento? (Em minutos)", "nao");
                double valorTotal = tempoCliente * 0.2;
                System.out.println(
                        "Ticket do cliente '" + clienteEscolhido.getNome() + "' pago! Valor total: R$ " + valorTotal);
            }
            for (Veiculo veiculo : clienteEscolhido.getVeiculos()) {
                if (veiculo == ticket.getVeiculo()) {
                    veiculosEstacionados.remove(veiculo);
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