public class question_28 {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        int numMaior = 0;

        int num1 = scanner.scannerInt("Informe o primeiro numero: ", "nao");

        numMaior = num1;
        
        int num2 = scanner.scannerInt("Informe o segundo numero: ", "nao");
        
        if (num2 == num1) {
            num2 = scanner.scannerInt("Informe o segundo numero: (Deve ser diferente do primero) ", "nao");
        } 
        if (num2 > num1) {
            numMaior = num2;
        }

        int num3 = scanner.scannerInt("Informe o terceiro numero: ", "nao");

        if ((num3 == num1) || (num3 == num2)) {
            num3 = scanner.scannerInt("Informe o terceiro numero: (Deve ser diferente dos outros) ", "sim");
        } 
        if ((num3 > num2) && (num3 > num1)) {
            numMaior = num3;
        }

        System.out.println("O maoir numero é: " + numMaior);
    }
}
