
public class Musica {
    String titulo;
    String compositor;
    String estilo;
    public Musica(String titulo, String compositor, String estilo) {
        this.titulo = titulo;
        this.compositor = compositor;
        this.estilo = estilo;
    }
    @Override
    public String toString() {
        return "Musica [compositor=" + compositor + ", estilo=" + estilo + ", titulo=" + titulo + "]";
    } 
}
