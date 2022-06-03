public class Animal {
    private String especie;
    private String habitat;
    private int qtdePatas;
    public Animal(String especie, String habitat, int qtdePatas) {
        this.especie = especie;
        this.habitat = habitat;
        this.qtdePatas = qtdePatas;
    }
    @Override
    public String toString() {
        return "Animal [especie=" + especie + ", habitat=" + habitat + ", qtdePatas=" + qtdePatas + "]";
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public int getQtdePatas() {
        return qtdePatas;
    }
    public void setQtdePatas(int qtdePatas) {
        this.qtdePatas = qtdePatas;
    }
    public void cacar() {
        System.out.println(this.especie + " está caçando!");
    }
    public void fugir() {
        System.out.println(this.especie + " está fazendo uma retirada estrategica!");
    }
    public void descansar() {
        System.out.println(this.especie + " está descansando!");
    }

}
