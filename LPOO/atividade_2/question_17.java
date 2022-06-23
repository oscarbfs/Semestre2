package LPOO.atividade_2;

public class question_17 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int preco = scanner.scannerInt("Informe o preço do produto: ", "nao");
        int desconto = scanner.scannerInt("Informe a quatidade de desconto em porcentagem (não coloque '%'): ", "sim");

        int valor_desconto = (desconto * preco) / 100;
        int preco_final = preco - valor_desconto;

        System.out.println("O valor do desconto é de: " + valor_desconto + ". E o preco final é de: " + preco_final);
    }
}
