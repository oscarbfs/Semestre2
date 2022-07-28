package LPOO.atividade_8.questao_2;

public class Soma extends OperacaoMatematica{

    
    public Soma(double valor1, double valor2) {
        super(valor1, valor2);
    }

    double calcularOperacao(double valor1, double valor2) {
        return valor1 + valor2;
    }
}
