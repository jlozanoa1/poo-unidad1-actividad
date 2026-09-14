public class Ejercicio22 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        Libro libro4 = new Libro("La Odisea", "Homero", 384);

        libro1.mostrarLibro();
        libro2.mostrarLibro();
        libro3.mostrarLibro();
        libro4.mostrarLibro();

        /*
         * Conclusión: la clase Libro funciona como una plantilla porque define
         * qué características tiene un libro. Los objetos son casos concretos
         * de esa plantilla, porque cada uno guarda sus propios valores.
         */
    }
}
