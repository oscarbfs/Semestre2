package Questao1;

public class Normal extends Ingresso{

    public Normal(double valor) {
        super(valor);
    }

    public void imprimeValorNormal() {
        System.out.println("Ingresso normal. Valor: R$ " + getValor());
    }
}
