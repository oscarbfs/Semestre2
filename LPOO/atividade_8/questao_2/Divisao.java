package LPOO.atividade_8.questao_2;

public class Divisao extends OperacaoMatematica{
    
    public Divisao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    double calcularOperacao(double valor1, double valor2) {
        if(valor2 == 0) {
            System.out.println("O divisor não pode ser zero!");
            return 0.0;
        }
        return valor1 / valor2;
    }
}
