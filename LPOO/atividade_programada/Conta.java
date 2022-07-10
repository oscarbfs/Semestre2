package LPOO.atividade_programada;

public class Conta {
    private String agencia;
    private int numConta;
    private int senha;
    private double saldo;
    
    public Conta(String agencia, int numConta, int senha, double saldo) {
        this.agencia = agencia = "001";
        this.numConta = numConta;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "[Conta = " + numConta + ", Agencia = " + agencia + ", Saldo = " + saldo + "]\n";
    }
}
