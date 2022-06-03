package Questao3.Pessoa;

public class Miseravel extends Pessoa{
    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }

    public void mendiga() {
        System.out.println(getNome() + " está mendigando!");
    }
}
