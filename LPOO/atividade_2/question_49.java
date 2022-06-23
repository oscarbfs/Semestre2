package LPOO.atividade_2;

public class question_49 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int qtde = scanner.scannerInt("Informe quantas notas vai escrever: ", "nao");

        int soma = 0;
        int maiorNum = 0;
        int menorNum = 0;

        for (int index = 0; index < qtde; index++) {
            int num = scanner.scannerInt("Informe a nota: ", "nao");
            soma = soma + num;
            if (index == 0) {
                maiorNum = num;
                menorNum = num;
            } else {
                if(num < menorNum) {
                    menorNum = num;
                }
                if(num > maiorNum) {
                    maiorNum = num;
                }
                
            } 
        }
        int media = soma / qtde;
        System.out.println("A media é de: " + media);
        System.out.println("A menor nota é de: " + menorNum);
        System.out.println("A maior nota é de: " + maiorNum);
    }
}
