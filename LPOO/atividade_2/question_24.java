public class question_24 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        System.out.println("Informe numeros diferentes de zero\n");
        int num1 = scanner.scannerInt("Informe o primeiro numero: ", "nao");
        int num2 = scanner.scannerInt("Informe o segundo numero: ", "sim");

        if (num2 == 0) {
            System.out.println("O segundo numero tem que ser diferente de zero. Não é possivel efetuar a operação.\n");
        } else {
            double div = num1 / num2;

            System.out.println("O resultado da divisão é de: " + div);
        }
    }
}
