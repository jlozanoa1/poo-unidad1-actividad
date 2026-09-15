public class Ejercicio65 {
    public static void main(String[] args) {
        EquipoDeFutbol equipo = new EquipoDeFutbol("Halcones FC", "Medellín", 22);
        equipo.mostrarEquipo();

        equipo.sumarPuntosPorVictoria();
        equipo.mostrarEquipo();

        equipo.sumarPuntoPorEmpate();
        equipo.mostrarEquipo();
    }
}
