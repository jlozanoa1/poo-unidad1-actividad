public class Ejercicio34 {
    public static void main(String[] args) {
        Libro original = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro copia = new Libro(original);

        original.mostrarLibro();
        copia.mostrarLibro();
    }
}
