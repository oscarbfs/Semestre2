import java.util.ArrayList;

public class question_54 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int franquia = 100;
        double custo = 0.75;

        int qtde = scanner.scannerInt("Informe quantas ligações você fez: ", "nao");
        ArrayList<Integer> tempos = new ArrayList<Integer>();

        for (int index = 1; index <= qtde; index++) {
            int tempo = scanner.scannerInt("Informe a quantidade um minutos da " + index + "° ligação: ", "nao");
            tempos.add(tempo);
        }

        int pulsosGastos = 0;
        for (int tempo : tempos) {
            pulsosGastos += 2;

            int pulsoAdicional = (tempo / 4);
            if (tempo % 4 == 0) {
                pulsosGastos = pulsosGastos + pulsoAdicional - 1;
            } else {
                pulsosGastos = pulsosGastos + pulsoAdicional;
            }
        }
        
        double totalPagar = 0.0;
        if (pulsosGastos > franquia) {
            totalPagar = (pulsosGastos - franquia) * custo;
        }

        System.out.println("O total de pulsos é de: " + pulsosGastos + " e o custo adicional é de: " + totalPagar);
    }
}
