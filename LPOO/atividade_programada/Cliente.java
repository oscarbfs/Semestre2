package LPOO.atividade_programada;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int senha;
    private int cpf;
    private ArrayList<Conta> contas;

    public Cliente(String nome, int senha, int cpf, ArrayList<Conta> contas) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.contas = contas;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    String listarContas() {
        String contas = "";
        for (Conta conta : this.contas) {
            contas += conta.toString();
        }
        return contas;
    }

    @Override
    public String toString() {
        return "Cliente = " + nome + "\nCPF = " + cpf + "\nContas = [\n" + listarContas() + "]\n";
    }
}
