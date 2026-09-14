public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public void mostrarInfo() {
        System.out.printf("Título: %s | Artista: %s | Duración: %d seg%n",
                this.titulo, this.artista, this.duracion);
    }
}
