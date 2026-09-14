public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
        this("Desconocido", "Desconocido", 1);
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro(Libro otro) {
        this(otro.titulo, otro.autor, otro.paginas);
    }

    public void mostrarLibro() {
        System.out.printf("Título: %s | Autor: %s | Páginas: %d%n",
                this.titulo, this.autor, this.paginas);
    }
}
