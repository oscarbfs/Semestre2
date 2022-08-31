package LPOO.avaliacao2_3questao;

public abstract class FormasGeometricasPlanas {
    int lado1;
    int lado2;

    public FormasGeometricasPlanas(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    int calcularArea() {
        return lado1 * lado2;
    };
    int calcularPerimetro() {
        return lado1 + lado2;
    };
    void imprimirAreaPerimetro() {
        System.out.println("Area = " + calcularArea() + "\nPerimetro = " + calcularPerimetro() + "\n");
    };
}
