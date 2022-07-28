package LPOO.atividade_8.questao_3;

public class Principal {
    public static void main(String[] args) {
        Peao peao = new Peao("peao1", "branco", 0, 1);
        Torre torre = new Torre("torre1", "branco", 0, 0);
        Bispo bispo = new Bispo("bispo1", "branco", 2, 0);
        Cavalo cavalo = new Cavalo("cavalo1", "branco", 2, 0);

        peao.movimentar(new Movimento(0, 3), true);
        peao.movimentar(new Movimento(0, 4), false);
        peao.movimentar(new Movimento(0, 6), false);

        torre.movimentar(new Movimento(5, 0));
        torre.movimentar(new Movimento(5, 5));
        torre.movimentar(new Movimento(4, 4));

        bispo.movimentar(new Movimento(3, 1));
        bispo.movimentar(new Movimento(2, 2));
        bispo.movimentar(new Movimento(2, 3));

        cavalo.movimentar(new Movimento(3, 2));
        cavalo.movimentar(new Movimento(2, 4));
        cavalo.movimentar(new Movimento(2, 6));
    }
}
