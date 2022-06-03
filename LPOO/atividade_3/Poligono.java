
public class Poligono {
    int qtdeLados;
    String tipo;
    double area;
    double perimetro;
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
}
