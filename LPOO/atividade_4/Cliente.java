public class Cliente {
    private int id;
    private String nome;
    private int cpf;
    public Cliente(int id, String nome, int cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", id=" + id + ", nome=" + nome + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void fazerPedido(String pedido) {
        System.out.println("Seu pedido de um: " + pedido + ". Foi aceito e esta sendo preparado.");
    }
}
