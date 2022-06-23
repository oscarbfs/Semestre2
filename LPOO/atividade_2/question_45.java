package LPOO.atividade_2;

public class question_45 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int num = scanner.scannerInt("Informe um número para saber se é primo: ", "sim");

        if ((num % 2 != 0) && (num % 3 != 0)) {
            System.out.println("Esse numero é primo");
        } else {
            System.out.println("Esse numero não é primo");
        }
    }
}
