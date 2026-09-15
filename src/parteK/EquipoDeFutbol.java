public class EquipoDeFutbol {
    private String nombre;
    private String ciudad;
    private int jugadores;
    private int puntos;

    public EquipoDeFutbol(String nombre, String ciudad, int jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = jugadores;
        this.puntos = 0;
    }

    public void sumarPuntosPorVictoria() {
        this.puntos += 3;
    }

    public void sumarPuntoPorEmpate() {
        this.puntos += 1;
    }

    public void mostrarEquipo() {
        System.out.printf("Equipo: %s | Ciudad: %s | Jugadores: %d | Puntos: %d%n",
                this.nombre, this.ciudad, this.jugadores, this.puntos);
    }
}
