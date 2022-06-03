public class question_26 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int ano = scanner.scannerInt("Informe um ano: ", "sim");

        int div = ano%400;

        if (div == 0) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }
    }
}
