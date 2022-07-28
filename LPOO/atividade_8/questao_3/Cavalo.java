package LPOO.atividade_8.questao_3;

import java.util.ArrayList;

public class Cavalo extends Peca {

    public Cavalo(String nome, String cor, int posicaoX, int posicaoY) {
        super(nome, cor, posicaoX, posicaoY);
    }

    public ArrayList<Movimento> movimentosPermitidos() {
        ArrayList<Movimento> movimentos = new ArrayList<>();
        movimentos.add(new Movimento(this.posicaoX + 1, this.posicaoY + 2));
        movimentos.add(new Movimento(this.posicaoX + 2, this.posicaoY + 1));
        movimentos.add(new Movimento(this.posicaoX + 2, this.posicaoY - 1));
        movimentos.add(new Movimento(this.posicaoX + 1, this.posicaoY - 2));
        movimentos.add(new Movimento(this.posicaoX - 1, this.posicaoY - 2));
        movimentos.add(new Movimento(this.posicaoX - 2, this.posicaoY - 1));
        movimentos.add(new Movimento(this.posicaoX - 2, this.posicaoY + 1));
        movimentos.add(new Movimento(this.posicaoX - 1, this.posicaoY + 2));
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
        if (movimento.posicaoX < 0 || movimento.posicaoY < 0 || movimento.posicaoX > 8 || movimento.posicaoY > 8
                || !movimentoEPossivel(movimento)) {
            System.out.println("Movimento Impossivel!");
        } else {
            this.posicaoX = movimento.posicaoX;
            this.posicaoY = movimento.posicaoY;
            System.out.println("Cavalo está na casa (" + this.posicaoX + ", " + this.posicaoY + ")");
        }
    }
}
