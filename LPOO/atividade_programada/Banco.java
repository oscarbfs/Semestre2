package LPOO.atividade_programada;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Banco(String nome, ArrayList<Cliente> clientes) {
        this.nome = nome;
        this.clientes = clientes;
    }

    void autencicarCliente(int cpf, int senha, int index) throws Exception {
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
                funcoesConta(clienteAutenticado, index);
            }
        }
    }

    void funcoesConta(Cliente cliente, int index) throws Exception {
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
                "sim");
        switch (comando) {
            case 1:
                consultarPerfil(cliente);
                break;
            case 2:
                consultarConta(cliente);
                break;
            case 3:
                cadastrarConta(cliente, index);
                break;
            case 4:
                depositar(cliente);
                break;
            case 5:
                saquar(cliente);
                break;
            case 6:
                excluirPerfil(cliente);
                break;
            case 7:
                excluirConta(cliente);
                break;
            case 8:
                break;

            default:
                break;
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

    void listarContas(Cliente cliente) {
        int index = 0;
        for (Conta conta : cliente.getContas()) {
            System.out.println(index + " - Numero da Conta: " + conta.getNumConta());
            index++;
        }
    }

    void consultarPerfil(Cliente cliente){
        cliente.toString();
    }
    void consultarConta(Cliente cliente) throws Exception{
        listarContas(cliente);
        int indexContaEscolhida = scanner.scannerInt("Qual dessas contas deseja consultar?", "nao");
        Conta contaEscolhida = cliente.getContas().get(indexContaEscolhida);
        contaEscolhida.toString();
    }
    void cadastrarConta(Cliente cliente, int index) throws Exception{
        int senha = scanner.scannerInt("Crie uma senha de 4 digitos para sua conta", "nao");
        Conta novaConta = new Conta("001", index, senha, 0.0);
        cliente.getContas().add(novaConta);
    }
    void depositar(Cliente cliente) throws Exception{
        listarContas(cliente);
        int indexContaEscolhida = scanner.scannerInt("Qual dessas contas deseja depositar?", "nao");
        Conta contaEscolhida = cliente.getContas().get(indexContaEscolhida);

        int valorDeposito = scanner.scannerInt("Quanto deseja depositar?", "nao");

        contaEscolhida.setSaldo(contaEscolhida.getSaldo() + valorDeposito);;
    }
    void saquar(Cliente cliente){

    }
    void excluirPerfil(Cliente cliente){

    }
    void excluirConta(Cliente cliente){

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
