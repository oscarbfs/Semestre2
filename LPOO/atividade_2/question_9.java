package LPOO.atividade_2;

public class question_9 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int km = scanner.scannerInt("Informe a quilometragem percorrida: ", "nao");
        int litros = scanner.scannerInt("Informe a quantidade de litros gastos: ", "sim");

        int consumo_medio = km / litros;

        System.out.println("O consumo medio é de: " + consumo_medio + " km/L"); 
    }
}
