package LPOO.atividade_8.questao_1;

import java.util.Date;

public class Pessoa {
    String nome;
    String telefone;
    String endereço;
    Date aniversario;

    public Pessoa(String nome, String telefone, Date aniversario) {
        this.nome = nome;
        this.telefone = telefone;
        this.aniversario = aniversario;
    }

    public Pessoa(String nome, String telefone, String endereço) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa(String nome, String telefone, String endereço, Date aniversario) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
        this.aniversario = aniversario;
    }

    
}