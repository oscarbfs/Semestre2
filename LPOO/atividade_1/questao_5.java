import java.util.Scanner;

public class questao_5 {
    public static void main(String[] args) {
        function();
    }
    
    static void function() {
        Scanner scanner = new Scanner(System.in);
        Question[] questoes = {
                new Question("Quantos eleitores?"),
                new Question("Quantos votos válidos?"),
                new Question("Quantos votos nulos?"),
                new Question("Quantos votos em branco?"), };

        for (Question elemento : questoes) {
            System.out.println(elemento.sentence);
            String input = scanner.nextLine();
            Integer dimension = Integer.parseInt(input);
            elemento.answer = dimension;
        }

        Float eleitores = questoes[0].answer.floatValue();
        Float validos = questoes[1].answer.floatValue();
        Float nulos = questoes[2].answer.floatValue();
        Float brancos = questoes[3].answer.floatValue();

        Float validsPercentage = validos / eleitores * 100;
        Float nullsPercentage = nulos / eleitores * 100;
        Float blanksPercentage = brancos / eleitores * 100;

        System.out.println(String.format("Total de eleitores: %.0f", eleitores));
        System.out.println(String.format("Porcentagem dos validos: %.1f%%", validsPercentage));
        System.out.println(String.format("Porcentagem dos nulos: %.1f%%", nullsPercentage));
        System.out.println(String.format("Porcentagem dos brancos: %.1f%%", blanksPercentage));

        scanner.close();
    }
}
