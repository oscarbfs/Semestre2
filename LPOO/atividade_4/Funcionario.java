public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salario;
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
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void contratar() {
        System.out.println(this.nome + " foi contratado para o cargo de " + this.cargo + ". Com o salario de " + this.salario);
    }

    public void demitir(String motivo) {
        System.out.println(this.nome + " foi demitido. " + motivo);
    }

}
