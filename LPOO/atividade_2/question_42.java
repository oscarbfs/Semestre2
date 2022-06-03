import java.util.Random;

public class question_42 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        Random gerador = new Random();
        int negativo = 0;
        int positivo = 0;
        int zeros = 0;

        for (int index = 0; index < 200; index++) {
            int num = gerador.nextInt();
            if (num < 0) {
                negativo++;
            } else if (num == 0) {
                zeros++;
            } else {
                positivo++;
            }
        }

        System.out.println("Tem " + negativo + " negativos, " + positivo + " positivos e " + zeros + " zeros.");
        
    }
}
