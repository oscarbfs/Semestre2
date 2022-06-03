public class Carro extends Veiculo{
    String tipo;

    public Carro(String modelo, String marca, String placa, String tipo) {
        super(modelo, marca, placa);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
