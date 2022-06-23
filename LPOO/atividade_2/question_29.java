package LPOO.atividade_2;

public class question_29 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int idade = scanner.scannerInt("Informe sua idade: ", "sim");

        if(idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else if (idade >= 21) {
            System.out.println("Você é maior de idade e possiu idade civil.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
