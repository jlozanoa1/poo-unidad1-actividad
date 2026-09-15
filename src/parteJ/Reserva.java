public class Reserva {
    private String nombreCliente;
    private String fecha;
    private boolean activa;

    public Reserva(String nombreCliente, String fecha) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = false;
    }

    public void confirmar() {
        this.activa = true;
    }

    public void cancelar() {
        this.activa = false;
    }

    public void mostrarReserva() {
        System.out.printf("Cliente: %s | Fecha: %s | Activa: %b%n",
                this.nombreCliente, this.fecha, this.activa);
    }
}
