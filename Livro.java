/**
 * Esta classe representa um Livro do mundo real.
 * Utilizada para demonstrar conceitos de POO em Java.
 * Propriedades incluem título, autor e número de páginas.
 */
public class Livro {
    // Propriedades do objeto
    private String titulo;
    private String autor;
    private int paginas;
    
    // Construtor
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    // Getters e Setters
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
    
    public int getPaginas() {
        return paginas;
    }
    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}