import java.util.Scanner;

public class questao_6 {

    public static void main(String[] args) {
        function();
    }

    static void function() {
        Scanner scanner = new Scanner(System.in);
        Question[] questions = {
                new Question("Salary?"),
                new Question("Raise percentage?"),
        };

        for (Question element : questions) {
            System.out.println(element.sentence);
            String input = scanner.nextLine();
            Integer number = Integer.parseInt(input);
            element.answer = number;
        }

        Integer salary = questions[0].answer;
        Float raisePercentage = (questions[1].answer.floatValue() + 100) / 100;

        Float newSalary = salary * raisePercentage;

        System.out.println(String.format("New Salary: %.2f", newSalary));

        scanner.close();
    }

}
