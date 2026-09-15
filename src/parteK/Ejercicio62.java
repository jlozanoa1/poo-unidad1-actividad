public class Ejercicio62 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Calle 10 #5-30", 50);
        biblioteca.mostrarBiblioteca();

        biblioteca.prestarLibro();
        biblioteca.prestarLibro();
        biblioteca.mostrarBiblioteca();

        biblioteca.devolverLibro();
        biblioteca.mostrarBiblioteca();
    }
}
