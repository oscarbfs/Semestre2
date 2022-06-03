public class question_35 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int soma = 0;
        for (int index = 1; index <= 100; index++) {
            soma = soma + index;
        }

        int media = soma / 100;
        System.out.println(media);
    }
}
