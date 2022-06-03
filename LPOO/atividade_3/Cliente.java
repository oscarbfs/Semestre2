public class Cliente {
    int id;
    String nome;
    int cpf;
    public Cliente(int id, String nome, int cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", id=" + id + ", nome=" + nome + "]";
    }
}
