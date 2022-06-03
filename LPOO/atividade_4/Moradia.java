
public class Moradia {
    private String dono;
    private int qtdePessoas;
    private int qtdeQuartos;
    String tamanho;
    public Moradia(String dono, int qtdePessoas, int qtdeQuartos, String tamanho) {
        this.dono = dono;
        this.qtdePessoas = qtdePessoas;
        this.qtdeQuartos = qtdeQuartos;
        this.tamanho = tamanho;
    }
    @Override
    public String toString() {
        return "Moradia [dono=" + dono + ", qtdePessoas=" + qtdePessoas + ", qtdeQuartos=" + qtdeQuartos + ", tamanho="
                + tamanho + "]";
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public int getQtdePessoas() {
        return qtdePessoas;
    }
    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }
    public int getQtdeQuartos() {
        return qtdeQuartos;
    }
    public void setQtdeQuartos(int qtdeQuartos) {
        this.qtdeQuartos = qtdeQuartos;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public void comprar(String novoDono) {
        String donoAntigo = this.dono;
        setDono(novoDono);
        System.out.println(this.dono +  " comprou a moradia de " + donoAntigo);
    }
}
