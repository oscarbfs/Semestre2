import java.util.ArrayList;

public class question_36 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int qtde = scanner.scannerInt("Quantos numeros vai digitar? ", "nao");
        for (int index = 0; index < qtde; index++) {
            int num = scanner.scannerInt("Informe um numero: ", "nao");
            nums.add(num);
        }

        int soma = 0;
        int tamanho = nums.size();

        for (int elemento : nums) {
            soma = soma + elemento;
        }

        int media = soma / tamanho;

        System.out.println("A media é de: " + media);
    }
}
