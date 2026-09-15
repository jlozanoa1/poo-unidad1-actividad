public class Ejercicio53 {
    public static void main(String[] args) {
        Reserva reserva = new Reserva("Diego Torres", "2026-09-20");
        reserva.mostrarReserva();

        reserva.confirmar();
        reserva.mostrarReserva();

        reserva.cancelar();
        reserva.mostrarReserva();
    }
}
