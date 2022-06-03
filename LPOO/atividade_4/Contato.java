
public class Contato {
    private String nome;
    private int numero;
    private String email;
    public Contato(String nome, int numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Contato [email=" + email + ", nome=" + nome + ", numero=" + numero + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void ligarPara(Contato contato) {
        System.out.println("Ligando para: " + contato.numero + " (" + contato.nome + " )");
    }
    public void mandarEmailPara(String mensagem) {
        System.out.println("Mensagem enviada para: " + this.email + " (" + this.nome + " )");
        System.out.println("Mensagem enviada: " + "'" + mensagem + "' ");
    }
    public void bloquear(Contato contato) {
        System.out.println("Numero: " + contato.numero + " (" + contato.nome + " )" + ". Foi bloqueado!");
    }
}
