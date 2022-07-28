package LPOO.atividade_8.questao_3;

import java.util.ArrayList;

public class Peca {
    String nome;
    String cor;
    int posicaoX;
    int posicaoY;

    public Peca(String nome, String cor, int posicaoX, int posicaoY) {
        this.nome = nome;
        this.cor = cor;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public ArrayList<Movimento> movimentosPermitidos(boolean primeiroMovimento) {
        return null;
    }

    public void movimentar(Movimento movimento) {}
}
