public class Ejercicio33 {
    public static void main(String[] args) {
        // Libro tiene un constructor copia que recibe otro Libro.
        Libro original = new Libro("Rayuela", "Julio Cortázar", 624);
        Libro copia = new Libro(original);

        original.mostrarLibro();
        copia.mostrarLibro();
    }
}
