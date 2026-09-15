public class Docente {
    private String nombre;
    private String especialidad;
    private int añosExperiencia;
    private boolean disponible;

    public Docente(String nombre, String especialidad, int añosExperiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.disponible = true;
    }

    public void marcarNoDisponible() {
        this.disponible = false;
    }

    public void marcarDisponible() {
        this.disponible = true;
    }

    public void mostrarDocente() {
        System.out.printf("Nombre: %s | Especialidad: %s | Experiencia: %d años | Disponible: %b%n",
                this.nombre, this.especialidad, this.añosExperiencia, this.disponible);
    }
}
