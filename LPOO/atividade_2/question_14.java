public class question_14 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int NUM1 = scanner.scannerInt("Informe a primeira nota: ", "nao");
        int PESO1 = scanner.scannerInt("Informe agora seu peso: ", "nao");
        int NUM2 = scanner.scannerInt("Informe a segunda nota: ", "nao");
        int PESO2 = scanner.scannerInt("Informe agora seu peso: ", "sim");

        double media = (NUM1*PESO1 + NUM2*PESO2) / (PESO1 + PESO2);

        System.out.println("A media ponderada é de: " + media + "\n");
    }
}
