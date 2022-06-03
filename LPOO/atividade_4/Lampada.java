
public class Lampada {
    private int potencia;
    private String tipo;
    public Lampada(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Lampada [potencia=" + potencia + ", tipo=" + tipo + "]";
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void acender() {
        System.out.println("Lampada ligada");
    }

}
