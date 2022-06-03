
public class Ingresso {
    private String filme;
    private String assento;
    private double preco;
    private String horario;
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
    public String getFilme() {
        return filme;
    }
    public void setFilme(String filme) {
        this.filme = filme;
    }
    public String getAssento() {
        return assento;
    }
    public void setAssento(String assento) {
        this.assento = assento;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public void comprar() {
        System.out.println("Ingresso para o filme: " + this.filme + " comprado. Preço: " + this.preco + ". Assento: " + this.assento + ". Comprado!");
    }
}
