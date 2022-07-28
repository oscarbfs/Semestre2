package LPOO.atividade_8.questao_3;

import java.util.ArrayList;

public class Peao extends Peca {

    public Peao(String nome, String cor, int posicaoX, int posicaoY) {
        super(nome, cor, posicaoX, posicaoY);
    }

    public ArrayList<Movimento> movimentosPermitidos(boolean primeiroMovimento) {
        ArrayList<Movimento> movimentos = new ArrayList<>();
        movimentos.add(new Movimento(this.posicaoX, this.posicaoY + 1));
        if(primeiroMovimento) {movimentos.add(new Movimento(this.posicaoX, this.posicaoY + 2));}
        return movimentos;
    }
    boolean movimentoEPossivel(Movimento movimento, boolean primeiroMovimento) {
        boolean estaPermtido = false;
        for (Movimento movimentoPermitido : movimentosPermitidos(primeiroMovimento)) {
            if (movimento.posicaoX == movimentoPermitido.posicaoX && movimento.posicaoY == movimentoPermitido.posicaoY) {
                estaPermtido = true;
            }
        }
        return estaPermtido;
    }

    public void movimentar(Movimento movimento, boolean primeiroMovimento) {
        if (movimento.posicaoX < 0 || movimento.posicaoY < 0 || movimento.posicaoX > 8 || movimento.posicaoY > 8
                || !movimentoEPossivel(movimento, primeiroMovimento)) {

            System.out.println("Movimento Impossivel!");
        } else {
            this.posicaoX = movimento.posicaoX;
            this.posicaoY = movimento.posicaoY;
            System.out.println("Peao está na casa (" + this.posicaoX + ", " + this.posicaoY + ")");
        }
    }
}
