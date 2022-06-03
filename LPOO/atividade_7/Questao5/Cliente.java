package Questao5;

public class Cliente {
    private String nome;
    private String telefone;
    private int diaNascimneto;
    private int mesNascimneto;

    public Cliente(String nome, String telefone, int diaNascimneto, int mesNascimneto) {
        this.nome = nome;
        this.telefone = telefone;
        this.diaNascimneto = diaNascimneto;
        this.mesNascimneto = mesNascimneto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getDiaNascimneto() {
        return diaNascimneto;
    }

    public void setDiaNascimneto(int diaNascimneto) {
        this.diaNascimneto = diaNascimneto;
    }

    public int getMesNascimneto() {
        return mesNascimneto;
    }

    public void setMesNascimneto(int mesNascimneto) {
        this.mesNascimneto = mesNascimneto;
    }

    @Override
    public String toString() {
        return "  Nome = " + nome + "\n  telefone=" + telefone + "\n  Dia do nascimneto=" + diaNascimneto
                + "\n  Mes do nascimneto=" + mesNascimneto;
    }
}
