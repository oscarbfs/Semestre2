package LPOO.desafio_1;

public class Veiculo {
    private String modelo;
    private String marca;
    private String placa;
    public Veiculo(String modelo, String marca, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
    @Override
    public String toString() {
        return "\n Marca = " + marca + "\n Modelo = " + modelo + "\n Placa = " + placa;
    }
}
