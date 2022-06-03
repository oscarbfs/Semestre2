import java.util.ArrayList;
import java.util.Scanner;

public class questao_3 {

    public static void main(String[] args) {
        function();
    }

    static void function() {
        Scanner scanner = new Scanner(System.in);
        int[] qtdeDimensoes = {1, 2};
        ArrayList<Integer> dimensoes = new ArrayList<Integer>();


        for (int elemento : qtdeDimensoes) {
            System.out.println("Informe a " + elemento + "° dimensão:");
            String resposta = scanner.nextLine();  
            Integer dimensoesRespostas = Integer.parseInt(resposta);
            dimensoes.add(dimensoesRespostas);
        }
        
        int area = 1;

        for (int elemento : dimensoes) {
            area = area * elemento;
        }

        System.out.println(String.format("A área é de: %d", area));  

        scanner.close();
    }
}
