public class Curso {
    private String nombre;
    private int creditos;
    private String profesor;

    public Curso(String nombre, int creditos, String profesor) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    public void mostrarCurso() {
        System.out.printf("Curso: %s | Créditos: %d | Profesor: %s%n",
                this.nombre, this.creditos, this.profesor);
    }
}
