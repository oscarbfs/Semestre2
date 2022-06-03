public class question_16 {
    public static void main(String[] args) {
        function();
    }

    static int horasEmSegudnos(String ordem, String fim) {
        int hora = scanner.scannerInt("Informe a unidade de hora do " + ordem + " horario: ", "nao");
        int min = scanner.scannerInt("Informe a unidade de minutos do " + ordem + " horario: ", "nao");
        int seg = scanner.scannerInt("Informe a unidade de segundos do " + ordem + " horario: ", fim);

        int hora_seg = hora * 3600;
        int min_seg = min * 60;
        int total_seg = hora_seg + min_seg + seg;

        return total_seg;
    }

    static void function() {
        int tempo1 = horasEmSegudnos("primeiro","nao");
        int tempo2 = horasEmSegudnos("segundo", "sim");

        int diferenca = tempo1 - tempo2;

        System.out.println("A diferença em segundos é de: " + diferenca + " segundos\n");
    }
}
