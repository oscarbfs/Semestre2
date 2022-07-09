package LPOO.atividade_7.Questao4;


import java.util.Scanner;

public class scanner {
    public static String scannerString(String pergunta, String fim) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(pergunta);
        String resposta = scanner.nextLine(); 
        System.out.print("\n");

        if(fim == "sim") {
            scanner.close();
        }
        return resposta;

    }

    public static int scannerInt(String pergunta, String fim)throws Exception {
        int resposta = 0;
        try {
            resposta = Integer.parseInt(scannerString(pergunta, fim));
        } catch (Exception e) {
            throw new Exception("Isso não é um número!");
        }
        return resposta;
    }

    public static double scannerDouble(String pergunta, String fim) throws Exception{
        double resposta = 0;
        try {
            resposta = Double.parseDouble(scannerString(pergunta, fim));
        } catch (Exception e) {
            throw new Exception("Isso não é um número!");
        }
        return resposta;
    }
}
