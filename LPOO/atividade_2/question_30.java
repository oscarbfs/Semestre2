package LPOO.atividade_2;

public class question_30 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int num = scanner.scannerInt("Informe um numero: ", "sim");

        String[] unidades = {
            "zero",
            "um",
            "dois",
            "três",
            "quatro",
            "cinco",
            "seis",
            "sete",
            "oito",
            "nove",
        };

        System.out.println("Por extenso fica: " + unidades[num]);
    }
}
