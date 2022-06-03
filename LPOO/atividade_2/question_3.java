public class question_3 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int R = scanner.scannerInt("Informe o valor de R: ", "sim");

        double resultado = R + (R%3);


        System.out.println("O resultado é: " + resultado); 
    }
}
