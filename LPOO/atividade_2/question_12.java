public class question_12 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int A = scanner.scannerInt("Informe o primeiro lado do triangulo: ", "nao");
        int B = scanner.scannerInt("Informe o segundo lado do triangulo: ", "nao");
        int C = scanner.scannerInt("Informe o terceiro lado do triangulo: ", "sim");

        double T = (A+B+C) / 2;

        double area = Math.sqrt(T*(T-A)*(T-B)*(T-C));

        System.out.println("A área do triangulo é de: " + area + "\n");
    }
}
