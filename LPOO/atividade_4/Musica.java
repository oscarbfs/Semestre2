
public class Musica {
    private String titulo;
    private String compositor;
    private String estilo;
    public Musica(String titulo, String compositor, String estilo) {
        this.titulo = titulo;
        this.compositor = compositor;
        this.estilo = estilo;
    }
    @Override
    public String toString() {
        return "Musica [compositor=" + compositor + ", estilo=" + estilo + ", titulo=" + titulo + "]";
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    } 
    public void tocar() {
        System.out.println(this.titulo + " está tocando!");
    } 
}
