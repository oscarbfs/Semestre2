package LPOO.atividade_1;

import java.util.ArrayList;
import java.util.Scanner;

public class questao_4 {

    public static void main(String[] args) {
        function();
    }

    static void function() {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {
                "Quantos anos você tem?",
                "Quantos meses desde seu último aniversário?",
                "E quantos dias?" };
        ArrayList<Integer> idades = new ArrayList<Integer>();

        for (String elemento : perguntas) {
            System.out.println(elemento);
            String resposta = scanner.nextLine();
            Integer num = Integer.parseInt(resposta);
            idades.add(num);
        }

        Integer idadeEmDias = idades.get(0) * 365 + idades.get(1) * 30 + idades.get(2);

        System.out.println(String.format("A sua idade em dias é: %d", idadeEmDias));

        scanner.close();
    }
}
