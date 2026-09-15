public class Ejercicio61 {
    public static void main(String[] args) {
        Docente docente1 = new Docente("Carlos Peña", "Matemáticas", 10);
        Docente docente2 = new Docente("Lucía Vargas", "Historia", 3);

        docente1.mostrarDocente();
        docente2.mostrarDocente();

        docente2.marcarNoDisponible();
        docente2.mostrarDocente();
    }
}
