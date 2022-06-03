
public class Pais {
    private String nome;
    private String continente;
    private String lingua;
    public Pais(String nome, String continente, String lingua) {
        this.nome = nome;
        this.continente = continente;
        this.lingua = lingua;
    }
    @Override
    public String toString() {
        return "Pais [continente=" + continente + ", lingua=" + lingua + ", nome=" + nome + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getContinente() {
        return continente;
    }
    public void setContinente(String continente) {
        this.continente = continente;
    }
    public String getLingua() {
        return lingua;
    }
    public void setLingua(String lingua) {
        this.lingua = lingua;
    }
}
