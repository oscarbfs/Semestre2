
public class Professor {
    String nome;
    String disciplinaLecionada;
    String turmaLecionada;
    public Professor(String nome, String disciplinaLecionada, String turmaLecionada) {
        this.nome = nome;
        this.disciplinaLecionada = disciplinaLecionada;
        this.turmaLecionada = turmaLecionada;
    }
    @Override
    public String toString() {
        return "Professor [disciplinaLecionada=" + disciplinaLecionada + ", nome=" + nome + ", turmaLecionada="
                + turmaLecionada + "]";
    }
}
