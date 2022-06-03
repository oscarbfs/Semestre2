
public class Ingresso {
    String filme;
    String assento;
    double preco;
    String horario;
    public Ingresso(String filme, String assento, double preco, String horario) {
        this.filme = filme;
        this.assento = assento;
        this.preco = preco;
        this.horario = horario;
    }
    @Override
    public String toString() {
        return "Ingresso [assento=" + assento + ", filme=" + filme + ", horario=" + horario + ", preco=" + preco + "]";
    }
}
