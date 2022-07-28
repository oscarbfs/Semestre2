package LPOO.atividade_8.questao_2;

public class OperacaoMatematica {
    double valor1;
    double valor2;

    public OperacaoMatematica(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    double calcularOperacao(double valor1, double valor2) {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Valor1 = " + valor1 + "\nValor2 = " + valor2 + "\nResultado da operação = " + calcularOperacao(valor1, valor2);
    }
}
