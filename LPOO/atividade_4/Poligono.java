
public class Poligono {
    private int qtdeLados;
    private String tipo;
    private double area;
    private double perimetro;
    public Poligono(int qtdeLados, String tipo, double area, double perimetro) {
        this.qtdeLados = qtdeLados;
        this.tipo = tipo;
        this.area = area;
        this.perimetro = perimetro;
    }
    @Override
    public String toString() {
        return "Poligono [area=" + area + ", perimetro=" + perimetro + ", qtdeLados=" + qtdeLados + ", tipo=" + tipo
                + "]";
    }
    public int getQtdeLados() {
        return qtdeLados;
    }
    public void setQtdeLados(int qtdeLados) {
        this.qtdeLados = qtdeLados;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public void saberLados(boolean ladosIguais) {
        if(ladosIguais) {
            double lado = this.perimetro/ this.qtdeLados;
            System.out.println("Os lados valem: " + lado);
        } else {
            System.out.println("Impossivel saber");

        }
    }
}
