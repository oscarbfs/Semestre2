public class question_57 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        double indice = scanner.scannerDouble("Informe o indice de poluição da sua cidade: ", "nao");

        String classificacao = "agradavel";
        if ((35 <= indice) && (indice <= 60)) {
            classificacao = "desagradável";
        } else if (indice >= 60) {
            classificacao = "perigoso";
        }

        System.out.println("A classificação do indice de poluição da sua cidade é de: " + classificacao);
    }
}
