package LPOO.avaliacao2_3questao;

public class Retangulo extends FormasGeometricasPlanas{

    public Retangulo(int lado1, int lado2) {
        super(lado1, lado2);
    }

    public void metadeTamnho() {
        this.lado1 =this.lado1/2;
        this.lado2 =this.lado2/2;
        System.out.println("Metade do lado 1: " + this.lado1 + ". Metade do lado 2: " + this.lado2);
        System.out.println("Novo perimetro: " + (this.lado1+this.lado2));
        System.out.println("Nova area: " + (this.lado1*this.lado2));
    };
    
    public void dobrarTamanho() {
        this.lado1 =this.lado1*2;
        this.lado2 =this.lado2*2;
        System.out.println("Dobro do lado 1: " + this.lado1 + ". Dobro do lado 2: " + this.lado2);
        System.out.println("Novo do perimetro: " + (this.lado1+this.lado2));
        System.out.println("Nova da area: " + (this.lado1*this.lado2));
    };
    
    public void triplicarTamanho() {
        this.lado1 =this.lado1*3;
        this.lado2 =this.lado2*3;
        System.out.println("Triplo do lado 1: " + this.lado1 + ". Triplo do lado 2: " + this.lado2);
        System.out.println("Novo perimetro: " + (this.lado1+this.lado2));
        System.out.println("Nova area: " + (this.lado1*this.lado2));

    };
    
}
