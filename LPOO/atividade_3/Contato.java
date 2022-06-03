
public class Contato {
    String nome;
    int numero;
    String email;
    public Contato(String nome, int numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Contato [email=" + email + ", nome=" + nome + ", numero=" + numero + "]";
    }
}
