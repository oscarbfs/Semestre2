import java.util.ArrayList;

public class question_43 {
    public static void main(String[] args) {
        function();
    }

    static void function() {

        int num = scanner.scannerInt("Informe um número para ser fatorado: ", "sim");;
        int ultimoQuociente = num;
        ArrayList<Integer> quocientes = new ArrayList<Integer>();
        ArrayList<Integer> divisores = new ArrayList<Integer>();
        int[] primos = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };
        
        System.out.println("Esse numero decomposto fica:");

        while (ultimoQuociente != 1) {
            for (int elemento : primos) {
                while (ultimoQuociente % elemento == 0) {
                    ultimoQuociente = ultimoQuociente / elemento;
                    quocientes.add(ultimoQuociente);
                    divisores.add(elemento);
                    System.out.println(ultimoQuociente);
                }
            }
        }

        String number = String.valueOf(num);

        String[] digits = number.split("(?<=.)");
        int tamanho = digits.length;
        String[] unidades = {"unidades", "dezenas", "centenas", "milhares"};
        System.out.println("\nEsse numero tem:");

        for (int index = 0; index < digits.length; index++) {
            System.out.println(digits[index] + " " + unidades[(tamanho - 1) - index]);
        }
    }
}
