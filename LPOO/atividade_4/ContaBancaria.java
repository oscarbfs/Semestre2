
public class ContaBancaria {
    private double saldo;
    private String nomeDoTitular;
    private double fatura;
    public ContaBancaria(double saldo, String nomeDoTitular, double fatura) {
        this.saldo = saldo;
        this.nomeDoTitular = nomeDoTitular;
        this.fatura = fatura;
    }
    @Override
    public String toString() {
        return "ContaBancaria [fatura=" + fatura + ", nomeDoTitular=" + nomeDoTitular + ", saldo=" + saldo + "]";
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNomeDoTitular() {
        return nomeDoTitular;
    }
    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }
    public double getFatura() {
        return fatura;
    }
    public void setFatura(double fatura) {
        this.fatura = fatura;
    }
    public void fazerPix(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            System.out.println("Transferencia de: R$" + valor + " feita!");

        }
    }
    public void pagarFatura(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            System.out.println("Pagamento de: R$" + valor + " feita!");
            this.fatura = this.fatura - valor;
        }
    }
}
