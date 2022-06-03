public class question_10 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int F = scanner.scannerInt("Informe a temperatura em Fahrenheit: ", "nao");
        double C = (5 * (F-32)) / 9;
        System.out.println("A coversão para Celsius é de: " + C + "\n"); 
        
        int P = scanner.scannerInt("Informe a quantidade de chuva em polegadas: ", "nao");
        double MM = P * 25.4; 
        System.out.println("A coversão para milimetros é de: " + MM + "\n"); 
        
        int KMH = scanner.scannerInt("Informe a velocidade em Km/H: ", "sim");
        double MS = KMH / 3.6; 
        System.out.println("A coversão para m/s é de: " + MS + "\n"); 

    }
}
