public class question_32 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int idadeAno = 0;
        int idadeMes = 0;

        int anoNasc = scanner.scannerInt("Informe o ano do seu nascimento: ", "nao");
        int mesNasc = scanner.scannerInt("Informe o mês do seu nascimento: ", "nao");
        int anoAtual = scanner.scannerInt("Informe o ano atual: ", "nao");
        int mesAtual = scanner.scannerInt("Informe o mês atual: ", "sim");

        if(mesNasc < mesAtual) {
            idadeAno = anoAtual - anoNasc;
            idadeMes = mesAtual - mesNasc;
        } else {
            idadeAno = anoAtual - anoNasc - 1;
            idadeMes = 12 - (mesNasc - mesAtual);
        }

        System.out.println("A sua idade é de: " + idadeAno + " e " + idadeMes + " meses");
    }
}
