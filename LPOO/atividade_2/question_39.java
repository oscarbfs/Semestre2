package LPOO.atividade_2;

public class question_39 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int num = 1;

        for (int index = 7;index >= 1; index--) {
            num = num * index;
        }
        System.out.println(num);
    }
}
