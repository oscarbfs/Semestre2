public class question_38 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int numInicial = scanner.scannerInt("Informe o número inicial: ", "nao");
        int numFinal = scanner.scannerInt("Informe o número final: ", "sim");

        for (;numInicial <= numFinal; numInicial++) {
            System.out.println(numInicial);
        }

    }
}
