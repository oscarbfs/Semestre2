package LPOO.atividade_programada;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Banco(String nome, ArrayList<Cliente> clientes) {
        this.nome = nome;
        this.clientes = clientes;
    }

    void autencicarCliente(int cpf, int senha) throws Exception {
        Cliente clienteAutenticado = null;
        boolean clienteEncontrado = false;
        for (Cliente cliente : this.clientes) {
            if(cliente.getCpf() == cpf) {
                clienteEncontrado = true;
                clienteAutenticado = cliente;
            }
        }
        if (!clienteEncontrado) {
            System.out.println("Cliente Não Encontrado!\n");
        } else {
            if (clienteAutenticado.getSenha() == senha) {
                System.out.println("Cliente Autenticado!\n");
                funcoesConta(clienteAutenticado);
            }
        }
    }

    void funcoesConta(Cliente cliente) throws Exception {
        boolean parar = false;
        int index = 0;
        while(!parar) {
            int comando = scanner.scannerInt(
                    "O que deseja fazer?\n" +
                            "1 - Consultar Perfil\n" +
                            "2 - Consultar Conta\n" +
                            "3 - Cadastrar Conta\n" +
                            "4 - Depositar\n" +
                            "5 - Saque\n" +
                            "6 - Excluir Perfil\n" +
                            "7 - Excluir Conta\n" +
                            "8 - Sair\n",
                    "nao");
            if (comando == 1) {
                consultarPerfil(cliente);
            } else if (comando == 2) {
                consultarConta(cliente);
            } else if (comando == 3) {
                cadastrarConta(cliente, index);
            } else if (comando == 4) {
                depositar(cliente);
            } else if (comando == 5) {
                saquar(cliente);
            } else if (comando == 6) {
                parar = excluirPerfil(cliente);
            } else if (comando == 7) {
                excluirConta(cliente);
            } else {
                parar = true;
            }
            index++;
        }
    }

    void cadastrarCliente() throws Exception {
        String nome = scanner.scannerString("Informe seu nome", "nao");
        int cpf = scanner.scannerInt("Informe seu cpf", "nao");
        int senha = scanner.scannerInt("Crie uma senha (somente numeros)", "nao");
        ArrayList<Conta> contas = new ArrayList<>();
        Cliente novoCliente = new Cliente(nome, senha, cpf, contas);
        this.clientes.add(novoCliente);
        System.out.println("Cliente Cadastrado!");
    }

    Conta escolherConta(Cliente cliente, String pergunta) throws Exception {
        int index = 0;
        for (Conta conta : cliente.getContas()) {
            System.out.println(index + " - Numero da Conta: " + conta.getNumConta());
            index++;
        }
        int indexContaEscolhida = scanner.scannerInt(pergunta, "nao");
        Conta contaEscolhida = cliente.getContas().get(indexContaEscolhida);
        return contaEscolhida;

    }

    void consultarPerfil(Cliente cliente){
        System.out.println(cliente.toString());
    }
    void consultarConta(Cliente cliente) throws Exception{
        System.out.println(escolherConta(cliente, "Qual dessas contas deseja consultar?").toString());
    }
    void cadastrarConta(Cliente cliente, int index) throws Exception{
        int tipoConta = scanner.scannerInt("A conta será:\n1 - Conta Poupança\n 2 - Conta Corrente", "nao");
        int senha = scanner.scannerInt("Crie uma senha de 4 digitos para sua conta", "nao");

        Conta novaConta = null;
        if (tipoConta == 1) {
            novaConta = new ContaPoupanca("001", index, senha, 0.0, 0.3);
        } else {
            novaConta = new ContaCorrente("001", index, senha, 0.0);
        }
        cliente.getContas().add(novaConta);
    }
    void depositar(Cliente cliente) throws Exception{
        
        Conta contaEscolhida = escolherConta(cliente, "Qual dessas contas deseja depositar?");

        int valorDeposito = scanner.scannerInt("Quanto deseja depositar?", "nao");

        contaEscolhida.setSaldo(contaEscolhida.getSaldo() + valorDeposito);
    }
    void saquar(Cliente cliente) throws Exception{
        Conta contaEscolhida = escolherConta(cliente, "Qual dessas contas deseja saquar?");
        double saldoAtual = contaEscolhida.getSaldo();
        System.out.println("O valor do seu saldo atual é de: " + saldoAtual);

        int valorSaquar = scanner.scannerInt("Quanto deseja saquar?", "nao");
        if(saldoAtual > valorSaquar) {
            contaEscolhida.setSaldo(contaEscolhida.getSaldo() - valorSaquar);
        } else if (valorSaquar < 0 || valorSaquar > saldoAtual) {
            System.out.println("Impossivel realizar o saque!");
        }
    }
    boolean excluirPerfil(Cliente cliente) throws Exception{
        int comando = scanner.scannerInt("Tem certeza que deseja excluir esse perfil de cliente?\n1 - Sim\n2 - Não", "nao");
        if (comando == 1) {
            this.clientes.remove(cliente);
            System.out.println("Perfil excluido!");
            return true;
        } else {
            System.out.println("Entendido. Perfil mantida!");
            return false;
        }
    }
    void excluirConta(Cliente cliente) throws Exception{
        Conta contaExcluir = escolherConta(cliente, "Qual dessas contas deseja excluir?");
        int comando = scanner.scannerInt("Tem certeza que deseja excluir essa conta?\n1 - Sim\n2 - Não", "nao");
        if (comando == 1) {
            cliente.getContas().remove(contaExcluir);
            System.out.println("Conta excluida!");
        } else {
            System.out.println("Entendido. Conta mantida!");
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
