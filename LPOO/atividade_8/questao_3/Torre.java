package LPOO.atividade_8.questao_3;

import java.util.ArrayList;

public class Torre extends Peca {

    public Torre(String nome, String cor, int posicaoX, int posicaoY) {
        super(nome, cor, posicaoX, posicaoY);
    }

    public ArrayList<Movimento> movimentosPermitidos() {
        ArrayList<Movimento> movimentos = new ArrayList<>();
        for (int x = 0; x <= 7; x++) {
            movimentos.add(new Movimento(x, this.posicaoY));
        }
        for (int y = 0; y <= 7; y++) {
            movimentos.add(new Movimento(this.posicaoX, y));
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
            System.out.println("Torre está na casa (" + this.posicaoX + ", " + this.posicaoY + ")");
        }
    }
}
