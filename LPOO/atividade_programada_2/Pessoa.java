package LPOO.atividade_programada_2;

public abstract class Pessoa {
    private String nome;
    private String endereço;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }
    
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
}