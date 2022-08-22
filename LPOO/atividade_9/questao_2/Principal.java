package LPOO.atividade_9.questao_2;

import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        String filePath = "LPOO/atividade_9/questao_2/arquivoDeSaida.txt";

        String texto = "Em arquivologia, arquivo é um conjunto de documentos criados ou \n" 
        + "recebidos por uma organização, firma ou indivíduo, que os mantém ordenadamente \n" 
        + "como fonte de informação para a execução de suas atividades . Os documentos preservados \n" 
        + "pelo arquivo podem ser de vários tipos e em vários suportes .";
        
        String[] palavras = texto.split(" ");
        String[] linhas = texto.split("\n");
        int qtdePalavras = palavras.length;
        int qtdeLinhas = linhas.length;

        try {

            FileWriter myWriter = new FileWriter(filePath, false);
            myWriter.write("Quantidade de Palavras: " + qtdePalavras + "\n");
            myWriter.write("Quantidade de Linhas: " + qtdeLinhas + "\n");

            for (String palavraAContar : palavras) {
                int qtdeDessaPalavra = 0;
                for (String outraPalavra : palavras) {
                    if(outraPalavra == palavraAContar) {
                        qtdeDessaPalavra++;
                    }
                }    
                myWriter.write(palavraAContar + ": " + qtdeDessaPalavra + "\n");
            }

            myWriter.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
