import java.util.ArrayList;

public class question_52 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int qtde = scanner.scannerInt("Informe quantos numeros sequeciais na ordem crescente vai escrever: ", "nao");
        // int flag = -1;
        int erros = 0;

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int index = 1; index < qtde; index++) {
            int num = scanner.scannerInt("Informe o " + index + "° numero: ", "nao");
            if (index == 1) {
                nums.add(num);
            } else {
                if (num == nums.get(index - 2) + 1) {
                    nums.add(num);
                } else {
                    System.out.println("Os numeros devem ser sequencias e em ordem crescente. Siga a sequencia a partir do ultimo numero digitado.");
                    erros++;
                    nums.add(num);
                }
            }
        }
        System.out.println("Você erro " + erros + " numeros na sequencia.");
    }
}
