public class Ejercicio67 {
    public static void main(String[] args) {
        // Clase libre relacionada con mi vida cotidiana: las actividades de mi
        // rutina diaria.
        RutinaDiaria rutina = new RutinaDiaria("Estudiar Java", "19:00", 90);
        rutina.mostrarActividad();

        rutina.marcarCompletada();
        rutina.mostrarActividad();
    }
}
