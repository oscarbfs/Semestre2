package LPOO.atividade_8.questao_2;

public class Principal {
    public static void main(String[] args) {
        Divisao divisao = new Divisao(3, 0);
        Multiplicacao multiplicacao = new Multiplicacao(3, 3);
        Soma soma = new Soma(3, 3);
        Subtracao subtracao = new Subtracao(3, 3);

        System.out.println(divisao.toString());
        System.out.println(multiplicacao.toString());
        System.out.println(soma.toString());
        System.out.println(subtracao.toString());
    }
}
