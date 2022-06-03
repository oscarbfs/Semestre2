
public class ContaBancaria {
    double saldo;
    String nomeDoTitular;
    double fatura;
    public ContaBancaria(double saldo, String nomeDoTitular, double fatura) {
        this.saldo = saldo;
        this.nomeDoTitular = nomeDoTitular;
        this.fatura = fatura;
    }
    @Override
    public String toString() {
        return "ContaBancaria [fatura=" + fatura + ", nomeDoTitular=" + nomeDoTitular + ", saldo=" + saldo + "]";
    }
}
