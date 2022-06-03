public class Aluno {
    String nome;
    int semestre;
    String matricula;

    public Aluno(String nome, int semestre, String matricula) {
        this.nome = nome;
        this.semestre = semestre;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", semestre=" + semestre + "]";
    }

}
