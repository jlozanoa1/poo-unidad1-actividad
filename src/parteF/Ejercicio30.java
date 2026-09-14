public class Ejercicio30 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("María López", "E002");
        Estudiante estudiante3 = new Estudiante("Juan Torres", "E003", 5);

        estudiante1.mostrarEstudiante();
        estudiante2.mostrarEstudiante();
        estudiante3.mostrarEstudiante();
    }
}
