package LPOO.atividade_7.Questao3.Pessoa;

public class Pobre extends Pessoa{

    public Pobre(String nome, int idade) {
        super(nome, idade);
    }
    
    public void trabalha() {
        System.out.println(getNome() + " está trabalhando");
    }
}
