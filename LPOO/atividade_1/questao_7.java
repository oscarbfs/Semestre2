package LPOO.atividade_1;

import java.util.Scanner;

public class questao_7 {

    public static void main(String[] args) {
        function();
    }

    static void function() {
        Scanner scanner = new Scanner(System.in);
        Question[] questions = {
            new Question("How much it cost to build?"),
        };

        for (Question element : questions) {
            System.out.println(element.sentence);
            String input = scanner.nextLine();  
            Integer number = Integer.parseInt(input);
            element.answer = number;
        }
        
        Integer cost = questions[0].answer;
        Float distributionCost = (float) ((28.0 + 100.0)/100.0);
        Float fees = (float) ((45.0 + 100.0)/100.0);

        Float finalPrice = cost * distributionCost * fees;
        
        System.out.println(String.format("Final price: %.2f", finalPrice));  

        scanner.close();
    }

}
