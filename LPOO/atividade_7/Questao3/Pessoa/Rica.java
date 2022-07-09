package LPOO.atividade_7.Questao3.Pessoa;

public class Rica extends Pessoa{
    private double dinheiro;

    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public void fazCompras() {
        System.out.println(getNome() + " está fazendo compras!");
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
