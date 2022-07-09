package LPOO.atividade_7.Questao5;

public class ItemPedido {
    
    String descricao;
    double valor;

    public ItemPedido(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "\ndescricao = " + descricao + ", valor = " + valor + "\n";
    }
}
