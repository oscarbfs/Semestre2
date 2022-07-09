package LPOO.atividade_7.Questao3.Animal;

public class Cachorro extends Animal{
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void late(){
        System.out.println("Au Au!");
    }
}
