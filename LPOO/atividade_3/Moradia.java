
public class Moradia {
    String dono;
    int qtdePessoas;
    int qtdeQuartos;
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
}
