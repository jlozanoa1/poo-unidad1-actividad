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


    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setSemestre(String semestre) { this.semestre = semestre; }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Luis Gonzáles", "128", "segundo");

        Estudiante estudiante2 = new Estudiante();

        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
    }
}
