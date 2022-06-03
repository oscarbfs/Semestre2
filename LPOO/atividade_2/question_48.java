public class question_48 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int qtde = scanner.scannerInt("Informe quantas notas vai escrever: ", "nao");

        int soma = 0;

        for (int index = 0; index < qtde; index++) {
            int num = scanner.scannerInt("Informe a nota: ", "nao");
            soma = soma + num;
        }
        int media = soma / qtde;
        System.out.println("A media é de: " + media);
    }
}
