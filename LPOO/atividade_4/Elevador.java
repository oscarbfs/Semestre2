
public class Elevador {
    private String material;
    private double velocidade;
    private double qtdeAndares;
    public Elevador(String material, double velocidade, double qtdeAndares) {
        this.material = material;
        this.velocidade = velocidade;
        this.qtdeAndares = qtdeAndares;
    }
    @Override
    public String toString() {
        return "Elevador [material=" + material + ", qtdeAndares=" + qtdeAndares + ", velocidade=" + velocidade + "]";
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public double getQtdeAndares() {
        return qtdeAndares;
    }
    public void setQtdeAndares(double qtdeAndares) {
        this.qtdeAndares = qtdeAndares;
    }
    public void irPara(int andar) {
        System.out.println("Indo para o " + andar + "° andar.");
    }
    public void irMaisRapido(int velocidade) {
        System.out.println("Aumentando a velocidade");
        this.velocidade = this.velocidade + velocidade;
        System.out.println("Nova velocidade: " + this.velocidade);
    }
    public void irMaisDevagar(int velocidade) {
        System.out.println("Diminuindo a velocidade");
        this.velocidade = this.velocidade - velocidade;
        System.out.println("Nova velocidade: " + this.velocidade);
    }
}
