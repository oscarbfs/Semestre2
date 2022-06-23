package LPOO.atividade_2;

import java.util.ArrayList;

public class question_46 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        ArrayList<Integer> primos = new ArrayList<Integer>();

        for (int num = 0; primos.size() < 500; num++) {
            ArrayList<Integer> divisores = new ArrayList<Integer>();
            for (int index = 1; index <= num; index++) {
                if (num % index == 0) {
                    divisores.add(index);
                }
            }
            if (divisores.size() == 2) {
                primos.add(num);
                System.out.println(num);
            }
        }
    }
}
