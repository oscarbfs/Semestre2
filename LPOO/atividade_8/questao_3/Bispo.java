package LPOO.atividade_8.questao_3;

import java.util.ArrayList;

public class Bispo extends Peca {

    public Bispo(String nome, String cor, int posicaoX, int posicaoY) {
        super(nome, cor, posicaoX, posicaoY);
    }

    public ArrayList<Movimento> movimentosPermitidos() {
        ArrayList<Movimento> movimentos = new ArrayList<>();
        for (int index = 0; index <= (7 - posicaoX) || index <= (7 - posicaoY); index++) {
            movimentos.add(new Movimento(this.posicaoX + index, this.posicaoY + index));
        }
        for (int index = 0; index <= (posicaoX) || index <= (7 - posicaoY); index++) {
            movimentos.add(new Movimento(this.posicaoX - index, this.posicaoY + index));
        }

        for (int index = 0; index <= (7 - posicaoX) || index <= (posicaoY); index++) {
            movimentos.add(new Movimento(this.posicaoX + index, this.posicaoY - index));
        }
        for (int index = 0; index <= (posicaoX) || index <= (posicaoY); index++) {
            movimentos.add(new Movimento(this.posicaoX - index, this.posicaoY - index));
        }
        return movimentos;
    }

    boolean movimentoEPossivel(Movimento movimento) {
        boolean estaPermtido = false;
        for (Movimento movimentoPermitido : movimentosPermitidos()) {
            if (movimento.posicaoX == movimentoPermitido.posicaoX && movimento.posicaoY == movimentoPermitido.posicaoY) {
                estaPermtido = true;
            }
        }
        return estaPermtido;
    }

    public void movimentar(Movimento movimento) {
        if (movimento.posicaoX < 0 || movimento.posicaoY < 0 || movimento.posicaoX > 7 || movimento.posicaoY > 7
                || !movimentoEPossivel(movimento)) {
            System.out.println("Movimento Impossivel!");
        } else {
            this.posicaoX = movimento.posicaoX;
            this.posicaoY = movimento.posicaoY;
            System.out.println("Bispo está na casa (" + this.posicaoX + ", " + this.posicaoY + ")");
        }
    }
}
