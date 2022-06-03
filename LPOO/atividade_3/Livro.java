
public class Livro {
    String titulo;
    String autor;
    int qtdePaginas;
    public Livro(String titulo, String autor, int qtdePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.qtdePaginas = qtdePaginas;
    }
    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", qtdePaginas=" + qtdePaginas + ", titulo=" + titulo + "]";
    }
}
