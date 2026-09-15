public class Biblioteca {
    private String nombre;
    private String direccion;
    private int librosDisponibles;

    public Biblioteca(String nombre, String direccion, int librosDisponibles) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.librosDisponibles = librosDisponibles;
    }

    public void prestarLibro() {
        if (this.librosDisponibles > 0) {
            this.librosDisponibles--;
        }
    }

    public void devolverLibro() {
        this.librosDisponibles++;
    }

    public void mostrarBiblioteca() {
        System.out.printf("Biblioteca: %s | Dirección: %s | Libros disponibles: %d%n",
                this.nombre, this.direccion, this.librosDisponibles);
    }
}
