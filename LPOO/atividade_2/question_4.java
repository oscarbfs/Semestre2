public class question_4 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int F = scanner.scannerInt("Informe o valor de F: ", "nao");
        int G = scanner.scannerInt("Informe o valor de G: ", "nao");
        int R = scanner.scannerInt("Informe o valor de R: ", "nao");
        int S = scanner.scannerInt("Informe o valor de S: ", "sim");

        int f_g = F + G;
        int r_s = R + S;

        double P = Math.pow((f_g / r_s), 2);

        System.out.println("O resultado de P é: " + P); 
    }
}
