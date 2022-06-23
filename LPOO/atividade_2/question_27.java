package LPOO.atividade_2;

import java.util.ArrayList;

public class question_27 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int num1 = scanner.scannerInt("Informe um num1: ", "nao");
        int num2 = scanner.scannerInt("Informe um num1: ", "nao");
        int num3 = scanner.scannerInt("Informe um num1: ", "nao");
        int num4 = scanner.scannerInt("Informe um num1: ", "sim");

        int[] nums = { num1, num2, num3, num4 };

        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();

        for (int num : nums) {
            if (num % 2 == 0) {
                par.add(num);
            } else {
                impar.add(num);
            }
        }

        int soma = 0;
        for (int num : par) {
            soma = soma + num;
        }

        System.out.println("A soma dos numeros pares é de: " + soma);
    }
}
