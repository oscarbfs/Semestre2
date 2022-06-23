package LPOO.atividade_2;

public class question_44 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int num = scanner.scannerInt("Informe um número para saber seus divisores: ", "sim");

        System.out.println("Os divisores desse numeros são: ");
        for (int index = 1; index <= num; index++) {
            if (num%index == 0) {
                System.out.println(index);
            }
        }
    }
}
