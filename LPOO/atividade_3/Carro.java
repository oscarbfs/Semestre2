public class Carro {
    int ano;
    String marca;
    String placa;
    String modelo;
    int qtdePortas;
    public Carro(int ano, String marca, String placa, String modelo, int qtdePortas) {
        this.ano = ano;
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.qtdePortas = qtdePortas;
    }
    @Override
    public String toString() {
        return "Carro [ano=" + ano + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", qtdePortas="
                + qtdePortas + "]";
    }
}
