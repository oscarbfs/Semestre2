public class question_13 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int A = scanner.scannerInt("Informe o valor de A na função de primeiro grau: ", "nao");
        int B = scanner.scannerInt("Informe o valor de B na função de primeiro grau: ", "sim");

        double X = -B / A;

        System.out.println("A raiz da equação é de: " + X + "\n");
    }
}
