package LPOO.atividade_2;

public class question_41 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        for (int num = 1;num <= 30; num++) {
            if((num%2 == 0) && (num%7 == 0) && (num%3 == 0)) {
                System.out.println(num);
            }
        }
    }
}
