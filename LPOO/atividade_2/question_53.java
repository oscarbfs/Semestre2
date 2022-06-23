package LPOO.atividade_2;

public class question_53 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int qtde = scanner.scannerInt("Informe quantos generos ira inserir? ", "nao");

        int qtdeMas = 0;
        int somaIdadeMas = 0;
        int qtdeFem = 0;
        int somaIdadeFem = 0;

        for (int index = 1; index <= qtde; index++) {
            int genero = scanner.scannerInt("Informe o genero do " + index + "° pelo numero correspondente: \n(1- masculino/2- feminino) ", "nao");
            String idade = scanner.scannerString("Informe a idade do " + index + "°: ", "nao");
            if (genero == 1) {
                qtdeMas++;
                somaIdadeMas = somaIdadeMas + Integer.parseInt(idade);
                System.out.println(qtdeMas);
                System.out.println(somaIdadeMas);
            } else if (genero == 2) {
                qtdeFem++;
                somaIdadeFem = somaIdadeFem + Integer.parseInt(idade);
            }

        }
        
        int mediaFem = 1;
        int mediaMas = 1;

        if(qtdeMas != 0) {
            mediaMas = somaIdadeMas/qtdeMas;
        } else {

        }
        if (qtdeFem != 0) {
            mediaFem = somaIdadeFem/qtdeFem;
        }
        System.out.println("A quantidade de pessoas do sexo masculino é de: " + qtdeMas);
        System.out.println("E a media de idade de pessoas do sexo masculino é de: " + mediaMas);
        System.out.println("A quantidade de pessoas do sexo feminino é de: " + qtdeFem);
        System.out.println("E a media de idade de pessoas do sexo feminino é de: " + mediaFem);
    }
}
