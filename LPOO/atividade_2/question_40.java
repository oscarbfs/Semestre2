package LPOO.atividade_2;

public class question_40 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int num = 0;
        while ((num < 2) || (num > 30)) {
            num = scanner.scannerInt("Informe um número entre 2 e 30: ", "nao");
        }

        int fatorial = 1;

        for (int index = num;index >= 1; index--) {
            fatorial = fatorial * index;
        }
        System.out.println(fatorial);

    }
}
