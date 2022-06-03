public class question_20 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int qtde_dia = scanner.scannerInt("Informe a quantidade de cigarros fumados por dia: ", "nao");
        int anos = scanner.scannerInt("Informe a quantos anos você fuma: ", "sim");

        double perda_dia = qtde_dia * 10;
        double anos_dias = anos * 365;
        double perca_total = (perda_dia * anos_dias) / 1440;

        System.out.println("Você perdeu " + perca_total + " dias de vida");
    }
}
