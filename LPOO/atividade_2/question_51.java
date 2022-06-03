import java.util.ArrayList;

public class question_51 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int qtde = scanner.scannerInt("Informe quantos numeros não nulos vai escrever? ", "nao");
        int flag = 0;

        ArrayList<Integer> positivos = new ArrayList<Integer>();
        ArrayList<Integer> negativos = new ArrayList<Integer>();

        for (int index = 1; index <= qtde; index++) {
            int num = scanner.scannerInt("Informe o " + index + "° numero: ", "nao");
            while (num == flag) {
                num = scanner.scannerInt("Informe o " + index + "° numero:(não pode ser nulo) ", "nao");
            }
            if (num > flag) {
                positivos.add(num);
            } else if (num < flag) {
                negativos.add(num);
            }
        }
        System.out.println("Tem " + positivos.size() + " positivos e " + negativos.size() + " negativos.");
    }
}
