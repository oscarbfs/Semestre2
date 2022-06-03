public class question_56 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int qtde = scanner.scannerInt("Informe a quantidade de dias trabalhados do encanador: ", "nao");
        double precoBruto = qtde * 20;
        double precoLiquido = precoBruto - (precoBruto * 0.08);
        System.out.println("O preço bruto é de: " + precoBruto);
        System.out.println("O preço liquido é de: " + precoLiquido);
    }
}
