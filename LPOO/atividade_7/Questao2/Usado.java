package LPOO.atividade_7.Questao2;

public class Usado extends Imovel{
    private double desconto;

    public Usado(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void imprimeDesconto() {
        System.out.println("Valor adicional: R$ " + this.desconto);
    }
    
    public void imprimeValorTotalImovelUsado() {
        System.out.println("Valor total: R$ " + (this.desconto/100) * getPreco());
    }
    public double getValorTotalImovelUsado() {
        return (desconto/100) * getPreco();
    }

}
