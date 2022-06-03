public class question_31 {
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
        
        String[] dezAQuinze = {
            "dez",
            "onze",
            "dose",
            "trese",
            "quatoze",
            "quinze",
            "dese",
        };
        
        String[] dezenas = {
            "vinte e ",
            "trinta e ",
            "quarenta e ",
            "cinquenta e ",
            "sessenta e ",
            "setenta e ",
            "oitenta e ",
            "noventa e ",
        };

        if (num < 10) {
            System.out.println("Por extenso fica: " + unidades[num]);
        } else if ((num >= 10) && (num < 20)) {
            System.out.println("Por extenso fica: " + dezAQuinze[num - 10]);
        } else {
            String number = String.valueOf(num);
            String[] digits = number.split("(?<=.)");
            System.out.println("Por extenso fica: " + dezenas[Integer.parseInt(digits[0]) - 2] + unidades[Integer.parseInt(digits[1])]);
        }
    }
}
