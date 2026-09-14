public class Ejercicio17 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Luis Gonzáles", "128", "2");

        estudiante.mostrarInfo();

        estudiante.cambiarSemestre(3);
        estudiante.mostrarInfo();
    }
}