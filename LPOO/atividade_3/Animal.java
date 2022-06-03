public class Animal {
    String especie;
    String habitat;
    int qtdePatas;
    public Animal(String especie, String habitat, int qtdePatas) {
        this.especie = especie;
        this.habitat = habitat;
        this.qtdePatas = qtdePatas;
    }
    @Override
    public String toString() {
        return "Animal [especie=" + especie + ", habitat=" + habitat + ", qtdePatas=" + qtdePatas + "]";
    }
}
