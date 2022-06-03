public class question_7 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int P = scanner.scannerInt("Informe o valor de P: ", "nao");
        int S = scanner.scannerInt("Informe o valor de S: ", "nao");
        int T = scanner.scannerInt("Informe o valor de T: ", "nao");
        int QA = scanner.scannerInt("Informe o valor de QA: ", "nao");
        int QI = scanner.scannerInt("Informe o valor de QI: ", "sim");

        int media = (P + S + T + QA + QI) / 5;

        System.out.println("O resultado da media é: " + media); 
    }
}
