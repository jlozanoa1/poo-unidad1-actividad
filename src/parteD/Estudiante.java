public class Estudiante {
    private String nombre;
    private String codigo;
    private String semestre;

    public Estudiante(String nombre, String codigo, String semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public Estudiante() {
        this("Desconocido", "000", "01");
    }

    public void mostrarInfo() {
        System.out.printf("Nombre: %s | Código: %s | Semestre: %s%n",
                this.nombre, this.codigo, this.semestre);
    }
}
