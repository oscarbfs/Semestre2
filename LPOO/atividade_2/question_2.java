public class question_2 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int A = scanner.scannerInt("Informe o valor de A: ", "não");
        int B = scanner.scannerInt("Informe o valor de B: ", "sim");

        double W = Math.pow(B - A, 2);


        System.out.println("O resultado de W é: " + W); 
    }
}
