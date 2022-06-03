import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    public void jogar(int numjogador, int numDados) throws Exception {

        Random random = new Random();
        ArrayList<Integer> numSorteadosDados = new ArrayList<Integer>();
        for (int index = 0; index < numDados; index++) {
            int numSorteado = random.nextInt(5) + 1;
            numSorteadosDados.add(numSorteado);
        }
        System.out.println("Dado(s) lançado(s)!\n");

        ArrayList<Integer> numsJogadores = new ArrayList<Integer>();
        ArrayList<Integer> jogadoresVencedores = new ArrayList<Integer>();
        for (int index = 0; index < numjogador; index++) {
            int numJogador = scanner.scannerInt("Jogador " + (index+1) + ", tente acertar o numero do dado. Digite um numero de 1 a 6:", "nao");

            if ((numJogador < 1) || (numJogador > 6)) {
                throw new Exception("Erro!! O numero digitado deve ser entre 1 a 6.\nRode o jogo novamente!");
            }

            numsJogadores.add(numJogador);

            for (int numSorteado : numSorteadosDados) {
                if (numSorteado == numJogador) {
                    jogadoresVencedores.add(index);
                }
            }
        }

        System.out.println("Números sorteados: " + numSorteadosDados);
        
        if(jogadoresVencedores.isEmpty()) {
            System.out.println("O(s) número(s) sorteado(s) não foram acertados!");
        } else {
            for(int jogador : jogadoresVencedores) {
                System.out.println("O jogador " + (jogador+1) + " acertou! Número escolhido: " + numsJogadores.get(jogador));
            }
        }
        
    }
}
