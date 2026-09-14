public class Paciente {
    private String nombre;
    private int edad;
    private String diagnostico;

    public Paciente(String nombre, int edad, String diagnostico) {
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    public void mostrarPaciente() {
        System.out.printf("Nombre: %s | Edad: %d | Diagnóstico: %s%n",
                this.nombre, this.edad, this.diagnostico);
    }
}
