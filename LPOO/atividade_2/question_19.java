public class question_19 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int distancia = scanner.scannerInt("Informe a distancia que foi percorrida com o carro alugado (em Km): ", "nao");
        int dias = scanner.scannerInt("Informe a quantidade de dias com o carro alugado: ", "sim");

        double distancia_preco = distancia * 0.15;
        double dias_preco = dias * 65;

        double total = distancia_preco + dias_preco;

        System.out.println("O total a ser pago é de: " + total + " reais");
    }
}
