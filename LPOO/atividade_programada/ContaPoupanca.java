package LPOO.atividade_programada;

public class ContaPoupanca extends Conta{
    private double rendimento;

    

    public ContaPoupanca(String agencia, int numConta, int senha, double saldo, double rendimento) {
        super(agencia, numConta, senha, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
