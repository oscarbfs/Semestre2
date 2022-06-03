public class question_18 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int distancia = scanner.scannerInt("Informe a distancia que será percorrida (em Km): ", "nao");
        int velocidade = scanner.scannerInt("Informe a velociade media esperada: (em Km/h)", "sim");

        int tempo = distancia / velocidade;

        System.out.println("O tempo gasto será de: " + tempo + " hora");
    }
}
