package LPOO.atividade_2;

public class question_11 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int BME = scanner.scannerInt("Informe a base menor do trapezio: ", "nao");
        int BMA = scanner.scannerInt("Informe a base maior do trapezio: ", "nao");
        int H = scanner.scannerInt("Informe a altura do trapezio: ", "sim");

        double area = ((BME + BMA) * H) / 2;

        System.out.println("A area do trapezio é de: " + area);
    }
}
