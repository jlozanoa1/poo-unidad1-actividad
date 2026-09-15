public class RutinaDiaria {
    private String actividad;
    private String horaInicio;
    private int duracionMinutos;
    private boolean completada;

    public RutinaDiaria(String actividad, String horaInicio, int duracionMinutos) {
        this.actividad = actividad;
        this.horaInicio = horaInicio;
        this.duracionMinutos = duracionMinutos;
        this.completada = false;
    }

    public void marcarCompletada() {
        this.completada = true;
    }

    public void mostrarActividad() {
        System.out.printf("Actividad: %s | Inicio: %s | Duración: %d min | Completada: %b%n",
                this.actividad, this.horaInicio, this.duracionMinutos, this.completada);
    }
}
