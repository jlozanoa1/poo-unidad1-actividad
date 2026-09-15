public class Estudiante {
    private String nombre;
    private String codigo;
    private int semestre;

    public Estudiante() {
        this("Desconocido", "0000", 1);
    }

    public Estudiante(String nombre, String codigo) {
        this(nombre, codigo, 1);
    }

    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarEstudiante() {
        System.out.printf("Nombre: %s | Código: %s | Semestre: %d%n",
                this.nombre, this.codigo, this.semestre);
    }
}
