public class Veiculo {
    private String nome;
    private String tipo;
    private String velocidadeMax;
    private int qtdePassageiroMax;
    public Veiculo(String nome, String tipo, String velocidadeMax, int qtdePassageiroMax) {
        this.nome = nome;
        this.tipo = tipo;
        this.velocidadeMax = velocidadeMax;
        this.qtdePassageiroMax = qtdePassageiroMax;
    }
    @Override
    public String toString() {
        return "Veiculo [nome=" + nome + ", qtdePassageiroMax=" + qtdePassageiroMax + ", tipo=" + tipo
                + ", velocidadeMax=" + velocidadeMax + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setVelocidadeMax(String velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
    public int getQtdePassageiroMax() {
        return qtdePassageiroMax;
    }
    public void setQtdePassageiroMax(int qtdePassageiroMax) {
        this.qtdePassageiroMax = qtdePassageiroMax;
    }
    public void pisarFundo() {
        System.out.println("O " + this.nome + " está indo a " + this.velocidadeMax);
    }
}
