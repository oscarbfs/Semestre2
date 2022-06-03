
public class Pais {
    String nome;
    String continente;
    String lingua;
    public Pais(String nome, String continente, String lingua) {
        this.nome = nome;
        this.continente = continente;
        this.lingua = lingua;
    }
    @Override
    public String toString() {
        return "Pais [continente=" + continente + ", lingua=" + lingua + ", nome=" + nome + "]";
    }
}
