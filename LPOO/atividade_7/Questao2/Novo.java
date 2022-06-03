package Questao2;

public class Novo extends Imovel{

    private double valorAdicional;

    public Novo(String endereco, double preco, double valorAdicional) {
        super(endereco, preco);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
    
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public void imprimeValorAdicional() {
        System.out.println("Valor adicional: R$ " + this.valorAdicional);
    }
    
    public void imprimeValorTotalImovelNovo() {
        System.out.println("Valor total: R$ " + this.valorAdicional + getPreco());
    }
    public double getValorTotalImovelNovo() {
        return valorAdicional + getPreco();
    }
}
