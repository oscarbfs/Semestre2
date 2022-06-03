public class Calculadora {
    private String tipo;
    private int qtdeOperacoes;
    public Calculadora(String tipo, int qtdeOperacoes) {
        this.tipo = tipo;
        this.qtdeOperacoes = qtdeOperacoes;
    }
    @Override
    public String toString() {
        return "Calculadora [qtdeOperacoes=" + qtdeOperacoes + ", tipo=" + tipo + "]";
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getQtdeOperacoes() {
        return qtdeOperacoes;
    }
    public void setQtdeOperacoes(int qtdeOperacoes) {
        this.qtdeOperacoes = qtdeOperacoes;
    }
    public void somar(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
    public void diminuir(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    }
    public void multiplicar(int num1, int num2) {
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
    }
}
