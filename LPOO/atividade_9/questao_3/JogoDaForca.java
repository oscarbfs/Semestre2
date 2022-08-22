package LPOO.atividade_9.questao_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int numRandom = random.nextInt(3);
            
        String filePath = "LPOO/atividade_9/questao_3/PalavrasParaOJogo.txt";
            
        int maxErros = 10;
        int index = 0;
        String dica = "";
        String palavra = "";
        String[] palavraSplitada = palavra.split("");
        
        
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            
            do {
                String linha = myReader.nextLine();
                if(index == numRandom) {
                    String[] linhaSplitada = linha.split(" ");
                    dica = linhaSplitada[0].split(":")[1];
                    palavra = linhaSplitada[1].split(":")[1];
                    palavraSplitada = palavra.split("");
                }
                index++;

            } while (myReader.hasNextLine());

            myReader.close();

            System.out.println("\nA palavra escolhida é um(a) " + dica + ". E ela possui " + palavraSplitada.length + " letras\n");
            System.out.println("Obs: Todas as palavras são compostas inteiramente por letras minusculas e não possuem acentos!!!\n");
            
            ArrayList<String> letrasAcertadas = new ArrayList<>();
            ArrayList<String> letrasErradas = new ArrayList<>();
            boolean ganhou = false;
            
            for (int erros = 0; (erros < maxErros);) {
                if (ganhou) {
                    break;
                }
                System.out.println("Você possui " + (maxErros - erros) + " tentativas");
                
                String letra = scanner.scannerString("Informe uma letra", "nao");

                if(palavra.contains(letra)) {
                    System.out.println("Você acertou a letra!");
                } else {
                    System.out.println("Você errou! Não tem essa letra na palavra!");
                    letrasErradas.add(letra);
                    erros++;
                }
                    
                    boolean acertouLetra =  false;
                    boolean jaTinhaAcertado =  false;
                    int letrasOcultas = 0;

                    for (int i = 0; i < palavraSplitada.length; i++) {
                        if(palavraSplitada[i].equals(letra)) {
                            System.out.print(letra);
                            acertouLetra = true;
                        } else {
                            for (String letraAcertada : letrasAcertadas) {
                                if (palavraSplitada[i].equals(letraAcertada)) {
                                    System.out.print(letraAcertada);
                                    jaTinhaAcertado = true;
                                }
                            }
                            if(!jaTinhaAcertado) {
                                System.out.print(" * ");
                                letrasOcultas++;
                            }
                            jaTinhaAcertado = false;
                        }
                    }
                    if(acertouLetra) {
                        letrasAcertadas.add(letra);
                    }
                    if(letrasOcultas == 0) {
                        ganhou = true;
                    } else {
                        letrasOcultas = 0;
                    }
                System.out.println("\n Letras erradas: " + letrasErradas);
                
                System.out.println("\n");
            }

            if (ganhou) {
                System.out.println("PARABENS, VOCÊ GANHOU!");
            } else {
                System.out.println("\n PUTS, VOCÊ PERDEU!");
            }
            System.out.println("A palavra era: " + palavra + "\n");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
