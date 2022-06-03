public class Funcionario {
    int id;
    String nome;
    String cargo;
    double salario;
    public Funcionario(int id, String nome, String cargo, double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo + ", id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
    }
}
