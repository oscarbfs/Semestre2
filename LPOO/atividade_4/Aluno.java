public class Aluno {
    private String nome;
    private int semestre;
    private String matricula;

    public Aluno(String nome, int semestre, String matricula) {
        this.nome = nome;
        this.semestre = semestre;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", semestre=" + semestre + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void estudar() {
        System.out.println(this.nome + " esta estudando!");
    }

    public void descansar() {
        System.out.println(this.nome + " esta descansando!");
    }
    public void trancar() {
        System.out.println("Aluno: " + this.nome + ", com matricula: " + this.matricula + " trancou o curso!s");
    }
}
