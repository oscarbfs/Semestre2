public class question_15 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int hora = scanner.scannerInt("Informe a unidade de hora do horario: ", "nao");
        int min = scanner.scannerInt("Informe a unidade de minutos do horario: ", "nao");
        int seg = scanner.scannerInt("Informe a unidade de segundos do horario: ", "sim");

        int hora_seg = hora * 3600;
        int min_seg = min * 60;
        int total_seg = hora_seg + min_seg + seg;

        System.out.println("O total em segundos é de: " + total_seg + " segundos\n");
    }
}
