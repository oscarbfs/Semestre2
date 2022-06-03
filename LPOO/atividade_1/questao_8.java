import java.util.Scanner;

public class questao_8 {

    public static void main(String[] args) {
        function();
    }

    static void function() {
        Scanner scanner = new Scanner(System.in);
        Question[] questions = {new Question("Base salary?"),
                                new Question("How many cars you sold?"), 
                                new Question("How much money selling those cars?"),
                                new Question("How much is the commission?"),};

        for (Question element : questions) {
            System.out.println(element.sentence);
            String input = scanner.nextLine();  
            Integer number = Integer.parseInt(input);
            element.answer = number;
        }
        
        Integer baseSalary = questions[0].answer;
        Integer numberOfCarsSold = questions[1].answer;
        Integer soldAmount = questions[2].answer;
        Integer comission = questions[3].answer;

        Float finalSalary = (float) (baseSalary + (numberOfCarsSold * comission) + (0.05 * soldAmount));

        System.out.println(String.format("Final Salary: %.2f", finalSalary));

        scanner.close();
    }

}
