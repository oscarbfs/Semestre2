public class question_34 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int soma = 0;
        for (int index = 1; index <= 100; index++) {
            soma = soma + index;
        }
        System.out.println(soma);
    }
}
