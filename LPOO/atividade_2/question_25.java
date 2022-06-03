public class question_25 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int num1 = scanner.scannerInt("Informe o primeiro numero: ", "nao");
        int num2 = scanner.scannerInt("Informe o segundo numero: ", "sim");

        if (num1 > num2) {
            System.out.println("O primeiro número (" + num1 + ") é maior que o segundo número.");
        } else {
            System.out.println("O segundo número (" + num2 + ") é maior que o primeiro número.");
        }
    }
}
