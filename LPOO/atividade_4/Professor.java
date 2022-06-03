
public class Professor {
    private String nome;
    private String disciplinaLecionada;
    private String turmaLecionada;
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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDisciplinaLecionada() {
        return disciplinaLecionada;
    }
    public void setDisciplinaLecionada(String disciplinaLecionada) {
        this.disciplinaLecionada = disciplinaLecionada;
    }
    public String getTurmaLecionada() {
        return turmaLecionada;
    }
    public void setTurmaLecionada(String turmaLecionada) {
        this.turmaLecionada = turmaLecionada;
    }
    public void darAula() {
        System.out.println("O professor " + this.nome + " está dando aula!");
    }
}
