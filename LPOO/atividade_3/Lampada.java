
public class Lampada {
    int potencia;
    String tipo;
    public Lampada(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Lampada [potencia=" + potencia + ", tipo=" + tipo + "]";
    }
}
