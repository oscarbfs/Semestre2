import java.util.Scanner;

public class scanner {
    public static String scannerString(String pergunta, String fim) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(pergunta);
        String resposta = scanner.nextLine(); 
        System.out.println("\n");

        if(fim == "sim") {
            scanner.close();
        }
        return resposta;

    }

    public static int scannerInt(String pergunta, String fim) {
        int resposta = Integer.parseInt(scannerString(pergunta, fim));
        return resposta;
    }
    public static double scannerDouble(String pergunta, String fim) {
        double resposta = Double.parseDouble(scannerString(pergunta, fim));
        return resposta;
    }
}
