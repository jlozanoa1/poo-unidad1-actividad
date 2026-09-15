public class Ejercicio29 {
    public static void main(String[] args) {
        // Estudiante tiene tres formas de construcción: vacío, con nombre y
        // código, y con nombre, código y semestre.
        Estudiante estudiante = new Estudiante("Pedro Ramírez", "E001", 3);
        estudiante.mostrarEstudiante();
    }
}
