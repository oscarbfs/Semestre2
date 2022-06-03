public class Carro {
    private int ano;
    private String marca;
    private String placa;
    private String modelo;
    private int qtdePortas;
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
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getQtdePortas() {
        return qtdePortas;
    }
    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }
    public void ligar() {
        System.out.println("Carro ligado!");
    }
    public void desligar() {
        System.out.println("Carro desligado!");
    }
    public void ligarAcordicionado() {
        System.out.println("Arcondicionado ligado!");
    }
}
