
public class Livro {
    private String titulo;
    private String autor;
    private int qtdePaginas;
    public Livro(String titulo, String autor, int qtdePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.qtdePaginas = qtdePaginas;
    }
    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", qtdePaginas=" + qtdePaginas + ", titulo=" + titulo + "]";
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getQtdePaginas() {
        return qtdePaginas;
    }
    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }
    public void vender() {
        System.out.println(this.titulo + " vendido");
    }
}
