package LPOO.atividade_1;

public class questao_1 {

    public static void main(String[] args) {
        function();
    }

    static void function() {
        int A = 10;
        int B = 20;
        int C = B;
        B = A;
        A = C;

        String resultado = String.format("A = %d e B = %d.", A, B);

        System.out.println(resultado); 
    }
}
