package LPOO.atividade_2;

public class question_47 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int num1 = scanner.scannerInt("Informe o primeiro número: ", "nao");;
        int num2 = scanner.scannerInt("Informe o segundo número: ", "sim");;

        int menorNum = 0;
        int mdc = 1;

        if (num1 < num2) {
            menorNum = num1;
        } else {
            menorNum = num2;
        }
        for (int index = 1; index <= menorNum; index++) {
            if ((num1 % index == 0) && (num2 % index == 0)) {
                mdc = index;
            }
        }

        System.out.println("O MDC é de: " + mdc);
    }
}
